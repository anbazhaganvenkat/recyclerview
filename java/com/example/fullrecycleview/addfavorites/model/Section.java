package com.example.fullrecycleview.addfavorites.model;

/**
 * Created by anbu on 28/01/2019.
 */

public class Section extends ElementList {
    public Section(String name) {
        this.setName(name);
        this.setSection(true);
    }
}
