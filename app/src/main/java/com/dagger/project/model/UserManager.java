package com.dagger.project.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class UserManager {

    private ApiService mService;

    public String url;


    public UserManager(ApiService mService) {
        this.mService = mService;
    }

    public UserManager(ApiService mService, String url) {
        this.mService = mService;
        this.url = url;
    }

    public void register(){
        Log.e("TAGTAG", "UserManager------>register:url-->"+url);
    }
}
