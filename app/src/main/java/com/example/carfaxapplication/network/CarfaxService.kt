package com.example.carfaxapplication.network

import com.example.carfaxapplication.model.CarFaxSearch
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface CarfaxService {

    @GET("assignment.json")
    suspend fun getCarFax(): Observable<CarfaxService>
}