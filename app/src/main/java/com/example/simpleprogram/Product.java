package com.example.simpleprogram;

import android.support.annotation.DrawableRes;

public class Product {
    private String name;
    private int costOfProducts;
    @DrawableRes
    private int photoId;


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
