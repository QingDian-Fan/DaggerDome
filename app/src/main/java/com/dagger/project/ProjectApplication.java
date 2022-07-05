package com.dagger.project;

import android.app.Application;

import com.dagger.project.component.DaggerHttpComponent;

import javax.inject.Inject;

public class ProjectApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
     //   DaggerHttpComponent.create().inject(this);
    }
}
