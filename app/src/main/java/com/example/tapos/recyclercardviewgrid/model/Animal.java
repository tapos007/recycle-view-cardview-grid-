package com.example.tapos.recyclercardviewgrid.model;

import com.example.tapos.recyclercardviewgrid.R;

import java.util.ArrayList;

/**
 * Created by tapos on 8/24/2017.
 */

public class Animal {
    private String title;
    private int imageId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public static ArrayList<Animal> getData(){
        ArrayList<Animal> dataList = new ArrayList<>();
        int[] images = getImages();
        for (int i = 0; i < images.length; i++) {
            Animal animal = new Animal();
            animal.setImageId(images[i]);
            animal.setTitle("Animal"+ i);
            dataList.add(animal);
        }
        return  dataList;
    }

    private static int[] getImages() {
        int[] images = {
                R.drawable.image_2,
                R.drawable.image_3,
                R.drawable.image_4,
                R.drawable.image_5,
                R.drawable.image_6,
                R.drawable.image_7,
                R.drawable.image_8,
                R.drawable.image_9,
                R.drawable.image_10,
                R.drawable.image_12,
                R.drawable.image_13,
                R.drawable.image_14,
                R.drawable.image_15,
                R.drawable.image_16,
                R.drawable.image_17,
                R.drawable.image_18,
                R.drawable.image_19,
                R.drawable.image_20
        };
        return  images;
    }
}
