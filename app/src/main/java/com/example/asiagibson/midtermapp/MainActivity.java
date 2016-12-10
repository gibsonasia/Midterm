package com.example.asiagibson.midtermapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.asiagibson.midtermapp.Pojos.Records;
import com.example.asiagibson.midtermapp.RV.VineAdapter;
import com.example.asiagibson.midtermapp.Retrofit.Json;
import com.example.asiagibson.midtermapp.Retrofit.Service;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public String TAG;
    TextView textView;
    VineAdapter adapter;
    RecyclerView mRecyclerView;


    String link = "https://vine.co/";
//    api/timelines/users/918753190470619136
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new VineAdapter();
        mRecyclerView.setAdapter(adapter);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(link)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Service service = retrofit.create(Service.class);

        Call<Json> call = service.getStuff();

        call.enqueue(new Callback<Json>() {

            @Override
            public void onResponse(Call<Json> call, Response<Json> response) {
                try {
                    if (response.isSuccessful()) {
                        adapter.setRecordsList(response.body().getRecords());
                       Log.d(TAG, "Success: " + response.body().getRecords());
                      //  textView.setText( response.body().g());
                    } else {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    }
                } catch (IOException e) {
                    Log.e(TAG, e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<Json> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });


    }
}
