package com.example.fullrecycleview.addfavorites.model;

/**
 * Created by anbu on 28/01/2019.
 */

public class Fruit extends ElementList {


    private int mIndex;
    private boolean mFavourite;

    public Fruit(String name, boolean section, int index, boolean favourite) {
        this.setName(name);
        this.setSection(false);
        this.mIndex = index;
        this.mFavourite = favourite;
    }

    public int getIndex() {
        return mIndex;
    }

    public void setIndex(int mIndex) {
        this.mIndex = mIndex;
    }

    public boolean isFavourite() {
        return mFavourite;
    }

    public void setFavourite(boolean mFavourite) {
        this.mFavourite = mFavourite;
    }
}
