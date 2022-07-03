package com.dagger.project.model;

import android.util.Log;

public class UserManager {

    private ApiService mService;

    public UserManager(ApiService mService) {
        this.mService = mService;
    }


    public void register(){
        Log.e("TAGTAG", "UserManager------>register");
    }
}
