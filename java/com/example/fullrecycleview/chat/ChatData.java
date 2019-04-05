package com.example.fullrecycleview.chat;

/**
 * Created by anbu on 28/01/2019
 */

public class ChatData {
    private int element;
    private String mTitle;
    private String mTime;


    public ChatData(int element, String mTitle, String mSubTitle) {
        this.element = element;
        this.mTitle = mTitle;
        this.mTime = mSubTitle;
    }

    public int getElement() {
        return element;
    }

    public String getTitle() {
        return mTitle;
    }


    public String getTime() {
        return mTime;
    }

}