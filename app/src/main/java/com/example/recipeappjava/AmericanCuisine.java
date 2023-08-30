package com.example.recipeappjava;

import androidx.appcompat.app.AppCompatActivity;
import org.bson.Document;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;

import android.os.AsyncTask;
import android.os.Bundle;

public class AmericanCuisine extends AppCompatActivity {

    private RecipeFragment recipeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipeFragment = (RecipeFragment) getSupportFragmentManager().findFragmentById(R.id.recipeFragment);

        // Fetch data from MongoDB based on the cuisine (e.g., "Indian")
        String cuisine = "Indian";
        new FetchRecipesTask().execute(cuisine);
    }

    private class FetchRecipesTask extends AsyncTask<String, Void, List<Recipe>> {
        @Override
        protected List<Recipe> doInBackground(String... cuisines) {
            List<Recipe> recipes = new ArrayList<>();

            try (MongoClient mongoClient = MongoClients.create("your_mongodb_connection_uri")) {
                MongoDatabase database = mongoClient.getDatabase("ahaan");
                MongoCollection<Document> collection = database.getCollection("recipes");

                String cuisine = cuisines[0];
                Document query = new Document("cuisine", cuisine);
                collection.find(query).iterator().forEachRemaining(document -> {
                    String name = document.getString("name");
                    String fetchedCuisine = document.getString("cuisine");
                    recipes.add(new Recipe(name, fetchedCuisine));
                });

                return recipes;
            }
        }

        @Override
        protected void onPostExecute(List<Recipe> recipes) {
            recipeFragment.updateRecipeList(recipes);
        }
    }
}