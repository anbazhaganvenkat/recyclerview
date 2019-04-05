package com.example.fullrecycleview.addfavorites.model;

/**
 * Created by anbu on 28/01/2019.
 */

public class ElementList {

    private String mName;
    boolean section;

    public ElementList(String mName, boolean section) {
        this.mName = mName;
        this.section = section;
    }

    public ElementList() {
    }


    public boolean isSection() {
        return section;
    }

    public void setSection(boolean section) {
        this.section = section;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

}
