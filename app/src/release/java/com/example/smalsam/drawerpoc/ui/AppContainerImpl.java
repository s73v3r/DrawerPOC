package com.example.smalsam.drawerpoc.ui;

import android.app.Activity;
import android.view.ViewGroup;

/**
 * Created by smalsam on 10/3/2014.
 */
public class AppContainerImpl implements AppContainer{


    @Override
    public ViewGroup get(Activity activity) {
        return (ViewGroup) activity.findViewById(android.R.id.content);
    }
}
