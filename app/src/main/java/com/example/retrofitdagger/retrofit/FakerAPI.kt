package com.example.retrofitdagger.retrofit

import com.example.retrofitdagger.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("/products") //initialize api call
    suspend fun getProducts() : Response<List<Product>>
}