package com.example.smalsam.drawerpoc.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

/**
 * Created by smalsam on 10/3/2014.
 */
public class POCActivity extends Activity {
    ViewGroup container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppContainer appContainer = new AppContainerImpl();
        container = appContainer.get(this);
    }
}
