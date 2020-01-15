package com.zachpuls.pantryui.model;

import java.util.List;

public class Recipe {
    private int id;
    private String name;
    private List<IngredientType> ingredients;

    public Recipe() {
    }

    public Recipe(int id, String name, List<IngredientType> ingredients) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IngredientType> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientType> ingredients) {
        this.ingredients = ingredients;
    }
}
