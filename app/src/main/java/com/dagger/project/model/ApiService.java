package com.dagger.project.model;

import android.util.Log;

import okhttp3.OkHttpClient;

public class ApiService {

    private OkHttpClient client;

    public ApiService(OkHttpClient client) {
        this.client = client;
    }

    public void register(){
        Log.e("TAGTAG", "ApiService------>register;client--->"+client);
    }
}
