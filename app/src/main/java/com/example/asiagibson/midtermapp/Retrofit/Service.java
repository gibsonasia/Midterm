package com.example.asiagibson.midtermapp.Retrofit;

import com.example.asiagibson.midtermapp.Retrofit.Json;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by asiagibson on 12/10/16.
 */

public interface Service {
    @GET("https://vine.co/api/timelines/users/918753190470619136")
    Call<Json> getStuff();
}
