package com.example.android.miwok;

/**
 * Created by beni on 6/21/2017.
 */

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;

    public Word(String defaultTranslation,String miwokTranslation){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
