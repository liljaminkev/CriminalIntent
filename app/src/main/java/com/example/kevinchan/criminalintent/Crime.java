package com.example.kevinchan.criminalintent;

import java.util.UUID;

/**
 * Created by kevinchan on 4/25/17.
 */

public class Crime {
    private UUID mId;
    private String mTitle;


    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime(){
        mId = UUID.randomUUID();
    }


}
