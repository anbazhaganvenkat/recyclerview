package com.example.fullrecycleview.animation;

/**
 * Created by anbu on 28/01/2019
 */

public class AnimationData {
    private String mTitle;
    private String mSubTitle;

    AnimationData(String title, String subTitle){
        mTitle = title;
        mSubTitle = subTitle;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }

    public void setmSubTitle(String mSubTitle) {
        this.mSubTitle = mSubTitle;
    }
}