package com.dagger.project.module;


import android.util.Log;

import com.dagger.project.model.ApiService;
import com.dagger.project.model.UserManager;
import javax.inject.Named;

import dagger.Module;
import dagger.Provides;



@Module
public class UserModule {

    @Provides
    public ApiService provideApiService(){

        Log.e("TAGTAG", "UserModule------>provideApiService: ");
        return new ApiService();
    }

    @Named("mytoken")
    @Provides
    public String provideUrl(){
        return "http://www.mytoken.io";
    }

    @Named("github")
    @Provides
    public String provideStr(){
        return "https://www.github.com";
    }

    @Provides
    public UserManager provideUserManager(ApiService mService, @Named("github") String url){
        return new UserManager(mService,url);
    }
}
