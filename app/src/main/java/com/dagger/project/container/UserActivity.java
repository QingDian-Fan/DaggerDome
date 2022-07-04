package com.dagger.project.container;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dagger.project.R;
import com.dagger.project.component.DaggerUserComponent;
import com.dagger.project.model.ApiService;
import com.dagger.project.model.UserManager;

import javax.inject.Inject;


public class UserActivity extends AppCompatActivity {

    @Inject
    ApiService mService;

    @Inject
    UserManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        DaggerUserComponent.create().inject(this);

        mService.register();

        mManager.register();
    }
}