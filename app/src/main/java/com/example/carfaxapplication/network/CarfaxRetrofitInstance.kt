package com.example.carfaxapplication.network

import com.example.carfaxapplication.model.CarFaxSearch
import com.example.carfaxapplication.util.BASE_URL
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CarfaxRetrofitInstance {
    private var carfaxService: CarfaxService

    init {
        this.carfaxService = createService(retrofitInstance())
    }

    private fun retrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    private fun createService(retrofit: Retrofit): CarfaxService {
        return retrofit.create(CarfaxService::class.java)
    }
     fun getCarFax(): Observable<CarFaxSearch> {
        return carfaxService.getCarFax()
    }
}