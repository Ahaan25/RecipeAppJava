package com.example.recipeappjava;

import android.os.AsyncTask;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

class FetchRecipesTask extends AsyncTask<String, Void, List<Recipe>> {
    @Override
    protected List<Recipe> doInBackground(String... cuisines) {
        List<Recipe> recipes = new ArrayList<>();

        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://ahaan2509:<password>@cluster0.mv1ttih.mongodb.net/?retryWrites=true&w=majority")) {
            MongoDatabase database = mongoClient.getDatabase("ahaan");
            MongoCollection<Document> collection = database.getCollection("recipes");

            String cuisine = cuisines[0];
            Document query = new Document("cuisine", cuisine);
            collection.find(query).iterator().forEachRemaining(document -> {
                String name = document.getString("name");
                String fetchedCuisine = document.getString("cuisine");
                String course = document.getString("course");  // Assuming you have a 'course' field in the document
                recipes.add(new Recipe(name, fetchedCuisine, course));
            });

            return recipes;
        }
    }

    @Override
    protected void onPostExecute(List<Recipe> recipes) {
        recipeFragment.updateRecipeList(recipes);
    }
}
