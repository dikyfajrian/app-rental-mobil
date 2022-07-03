package com.inducesmile.taxirental.models;


import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.io.File;

public class CarCategoryObject {

    private int id;
    private Bitmap imagePath;
    private String imageName;

    public CarCategoryObject(int id, Bitmap imagePath, String imageName) {
        this.id = id;
        this.imagePath = imagePath;
        this.imageName = imageName;
    }

    public CarCategoryObject(Bitmap imagePath, String imageName) {
        this.imagePath = imagePath;
        this.imageName = imageName;
    }

    public int getId() {
        return id;
    }

    public Bitmap getImagePath() {
        return imagePath;
    }

    public String getImageName() {
        return imageName;
    }
}
