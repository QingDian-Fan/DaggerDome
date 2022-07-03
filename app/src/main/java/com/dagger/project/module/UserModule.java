package com.dagger.project.module;


import android.util.Log;

import com.dagger.project.model.ApiService;
import com.dagger.project.model.UserManager;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    public ApiService provideApiService(){

        Log.e("TAGTAG", "UserModule------>provideApiService: ");
        return new ApiService();
    }

    @Provides
    public UserManager provideUserManager(ApiService mService){
        return new UserManager(mService);
    }
}
