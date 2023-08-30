package com.example.recipeappjava;

public class Recipe {
    private String name;
    private String cuisine;
    private String course;  // New parameter

    public Recipe(String name, String cuisine, String course) {
        this.name = name;
        this.cuisine = cuisine;
        this.course = course;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
