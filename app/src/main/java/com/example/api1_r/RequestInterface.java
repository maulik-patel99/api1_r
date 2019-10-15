package com.example.api1_r;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface RequestInterface {
    String baseurl="https://jsonplaceholder.typicode.com";
    @GET("/posts")
    Call<List<AndroidVersion>> getJSON();
}
