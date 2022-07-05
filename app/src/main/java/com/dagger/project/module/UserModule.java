package com.dagger.project.module;


import android.util.Log;

import com.dagger.project.model.ApiService;
import com.dagger.project.model.UserManager;
import javax.inject.Named;


import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;


@Module//(includes = HttpModule.class)
public class UserModule {

    @Provides
    public ApiService provideApiService(OkHttpClient client){

        Log.e("TAGTAG", "UserModule------>provideApiService: ");
        return new ApiService(client );
    }

    @Named("gitee")
    @Provides
    public String provideUrl(){
        return "http://www.gitee.com";
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
