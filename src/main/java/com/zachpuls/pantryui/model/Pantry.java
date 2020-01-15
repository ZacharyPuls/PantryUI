package com.zachpuls.pantryui.model;

import java.util.List;

public class Pantry {
    private int id;
    private User user;
    private String name;
    private List<Ingredient> ingredients;

    public Pantry() {
    }

    public Pantry(int id, User user, String name, List<Ingredient> ingredients) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
