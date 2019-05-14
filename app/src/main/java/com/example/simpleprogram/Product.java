package com.example.simpleprogram;

import android.support.annotation.DrawableRes;

public class Product {
    private String name;
    private int costOfProducts;
    @DrawableRes
    private int photoId;
    private int quantity;
    private int costOfAllInEach;
    static private int costOfAllInt;

    public int getCostOfAllInt() {
        return costOfAllInt;
    }

    public void setCostOfAllInt(int costOfAllInt) {
        this.costOfAllInt = costOfAllInt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, int costOfProducts, int photoId) {
        this.name = name;
        this.costOfProducts = costOfProducts;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostOfProducts() {
        return costOfProducts;
    }

    public void setCostOfProducts(int costOfProducts) {
        this.costOfProducts = costOfProducts;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
