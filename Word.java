package com.example.hemant.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int img;

    public Word(String DefaultTranslation, String MiwokTranslation, int img1) {
        this.mDefaultTranslation = DefaultTranslation;
        this.mMiwokTranslation = MiwokTranslation;
        this.img=img1;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImg(){
        return img;
    }
}
