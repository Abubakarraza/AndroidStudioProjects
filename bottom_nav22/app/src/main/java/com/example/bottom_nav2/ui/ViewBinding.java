package com.example.bottom_nav2.ui;

import android.view.View;

import androidx.annotation.NonNull;

public interface ViewBinding {

    /**
     * Returns the outermost {@link View} in the associated layout file. If this binding is for a
     * {@code <merge>} layout, this will return the first view inside of the merge tag.
     */
    @NonNull
    View getRoot();
};
