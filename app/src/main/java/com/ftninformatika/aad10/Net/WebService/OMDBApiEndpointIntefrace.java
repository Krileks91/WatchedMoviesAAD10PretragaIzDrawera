package com.ftninformatika.aad10.Net.WebService;

import com.ftninformatika.aad10.Models.Movie;
import com.ftninformatika.aad10.Models.Result;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface OMDBApiEndpointIntefrace {
    @GET("/")
    Call<Result> getMoviesByTitle(@QueryMap Map<String, String> query);

    @GET("/")
    Call<Movie> getMoviesByIMDBID(@QueryMap Map<String, String> query);
}
