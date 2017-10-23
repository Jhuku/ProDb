package com.example.shuvamghosh.prodb.api;
import com.example.shuvamghosh.prodb.model.RespModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by Shuvam Ghosh on 2/1/2017.
 */

public interface ApiInterface {

    @Headers("Accept: application/json")
    @GET("coordinates")
    Call<List<RespModel>> getTopRatedMovies(@Query("size") int size, @Query("protein") String proteinName);
}
