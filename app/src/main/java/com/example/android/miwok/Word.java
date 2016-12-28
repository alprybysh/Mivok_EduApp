package com.example.android.miwok;

import android.content.Context;

/**
 * Created by aprybysh on 12/20/16.
 */

public class Word {


    private String mDefaultTranslation;


    private String mMiwokTranslation;


    private int mResourceId;

    private int mImageID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int resourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId = resourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageID, int resourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageID = imageID;
        mResourceId = resourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {

        return mMiwokTranslation;
    }

    public int getImageID() {
        return mImageID;
    }

    public boolean hasImage () {
        return mImageID != NO_IMAGE_PROVIDED;
    }

    public int getResourceId() {
        return mResourceId;
    }

}
