package com.example.android.miwok;

/**
 * Created by beni on 6/21/2017.
 */

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;

    private int songId;



    private int imageId;

    public Word(String defaultTranslation,String miwokTranslation, int songId){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.songId = songId;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageId,int songId){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageId = imageId;
        this.songId = songId;
    }
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageId() { return imageId; }

    public int getSongId() {
        return songId;
    }
}
