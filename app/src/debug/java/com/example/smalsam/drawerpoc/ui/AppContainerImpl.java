package com.example.smalsam.drawerpoc.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.smalsam.drawerpoc.R;

/**
 * Created by smalsam on 10/3/2014.
 */

// Debug Version
public class AppContainerImpl implements AppContainer{

    private Activity activity;
    private Context drawerContext;
    private DrawerLayout drawerLayout;
    private ViewGroup content;

    // Intercepts viewgroup, and injects debug drawer
    @Override
    public ViewGroup get(Activity activity) {
        this.activity = activity;
        drawerContext = activity;

        activity.setContentView(R.layout.debug_activity_frame);

        ViewGroup drawer = (ViewGroup) activity.findViewById(R.id.debug_drawer);
        LayoutInflater.from(drawerContext).inflate(R.layout.debug_drawer_content, drawer);

        content = (ViewGroup) activity.findViewById(R.id.debug_content);
        
        drawerLayout = (DrawerLayout) activity.findViewById(R.id.debug_drawer_layout);
        drawerLayout.setDrawerShadow(R.drawable.debug_drawer_shadow, Gravity.END);

        return content;
    }
}
