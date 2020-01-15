package com.zachpuls.pantryui.model;

import java.util.Date;

public class Ingredient {
    private int id;
    private IngredientType type;
    private Date expirationDate;

    public Ingredient() {
    }

    public Ingredient(int id, IngredientType type, Date expirationDate) {
        this.id = id;
        this.type = type;
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IngredientType getType() {
        return type;
    }

    public void setType(IngredientType type) {
        this.type = type;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
