package com.example.shuvamghosh.prodb;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.shuvamghosh.prodb.api.ApiClient;
import com.example.shuvamghosh.prodb.api.ApiInterface;
import com.example.shuvamghosh.prodb.model.RespModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Shuvam Ghosh on 9/17/2017.
 */

public class DetailsActivity extends AppCompatActivity {

    RecyclerView recView;
    MyAdapter adapter;
    RecyclerView.LayoutManager lm;
    List<RespModel> rm;
    ProgressDialog pd;
    String proteinName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        recView = findViewById(R.id.rec_view_items);
        lm = new LinearLayoutManager(this);
        rm = new ArrayList<>();
        recView.setLayoutManager(lm);
        proteinName = getIntent().getStringExtra("Protein");

        pd = new ProgressDialog(DetailsActivity.this);
        pd.setMessage("Loading");
        pd.show();
        pd.setCancelable(false);


        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<RespModel>> call = apiService.getTopRatedMovies(20,proteinName);
        call.enqueue(new Callback<List<RespModel>>() {
            @Override
            public void onResponse(Call<List<RespModel>> call, Response<List<RespModel>> response) {
                pd.cancel();

                if(response.body().size()>0)
                {
                    rm = response.body();
                    adapter = new MyAdapter(DetailsActivity.this,rm);
                    recView.setAdapter(adapter);

                }
                else {
                    Toast.makeText(DetailsActivity.this, "Protein not found", Toast.LENGTH_SHORT).show();
                }

                Log.d("Response got: ",""+response.body().size());
                // List<Movie> movies = response.body().getResults();
                // moviesRecView.setAdapter(new MoviesAdapter(movies,R.layout.movie_item,getApplicationContext()));
            }

            @Override
            public void onFailure(Call<List<RespModel>> call, Throwable t) {
                // Log.e(TAG,t.toString());
                Log.d("Response error: ",""+t.toString());

            }
        });



    }

}
