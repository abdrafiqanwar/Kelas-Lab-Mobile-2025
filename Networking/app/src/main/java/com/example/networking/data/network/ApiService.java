package com.example.networking.data.network;

import com.example.networking.data.response.UserResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("users")
    Call<UserResponse> getlistUsers(@Query("page") int page);
}
