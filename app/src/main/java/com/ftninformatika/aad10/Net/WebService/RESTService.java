package com.ftninformatika.aad10.Net.WebService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RESTService {
    public static final String BASE_URL = "https://www.omdbapi.com";
    public static final String API_KEY = "129de919";

    public static Retrofit getRetrofitInstance() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

    public static OMDBApiEndpointIntefrace apiInterface() {
        OMDBApiEndpointIntefrace apiService = getRetrofitInstance().create(OMDBApiEndpointIntefrace.class);

        return apiService;
    }
}
