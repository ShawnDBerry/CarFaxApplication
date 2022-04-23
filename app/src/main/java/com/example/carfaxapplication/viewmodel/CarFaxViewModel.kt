package com.example.carfaxapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.example.carfaxapplication.model.CarFaxSearch
import com.example.carfaxapplication.network.CarfaxRetrofitInstance
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CarFaxViewModel: ViewModel() {

    val carfaxRetrofit = CarfaxRetrofitInstance()

     fun getCarFax(): Observable<CarFaxSearch> {
                return carfaxRetrofit.getCarFax()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        }

}