package com.ashiba.blogapp;

import android.support.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

/**
 * Created by Mohamed Ashiba on 13.11.18.
 */

public class BlogPostId {

    @Exclude
    public String BlogPostId;

    public <T extends BlogPostId> T withId(@NonNull final String id) {
        this.BlogPostId = id;
        return (T) this;
    }

}
