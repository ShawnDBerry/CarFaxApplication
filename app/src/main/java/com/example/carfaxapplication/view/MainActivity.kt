package com.example.carfaxapplication.view

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carfaxapplication.R
import com.example.carfaxapplication.adapter.CarFaxRVAdapter
import com.example.carfaxapplication.model.Listing
import com.example.carfaxapplication.viewmodel.CarFaxViewModel
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity(), CarFaxRVAdapter.CarFaxItemDelegate, CarFaxRVAdapter.CardClickListener{
    private lateinit var carList: List<Listing>
    private var compositeDisposable = CompositeDisposable()
    private lateinit var carFaxViewModel: CarFaxViewModel
    private var carFaxRVAdapter: CarFaxRVAdapter? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var carDetailFragment = CarDetailFragment()
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (ActivityCompat.checkSelfPermission(applicationContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    Activity(),
                    Manifest.permission.CALL_PHONE)) {
            } else {
                ActivityCompat.requestPermissions(
                    Activity(),
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1)
            }
        }
        recyclerView = findViewById(R.id.car_list_recyclerview)
        carFaxViewModel = ViewModelProvider(this).get(CarFaxViewModel::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            compositeDisposable.add(
                carFaxViewModel.getCarFax()
                    .subscribe({ listing ->
                        carList = listing.listings
                        CoroutineScope(Dispatchers.Main).launch{
                            printResults(listing.listings)
                            setUpRV(listing.listings)
                            println(listing.listings)
                        }
                    }, { throwable ->
                        Log.d("TAG_Q", "error " + throwable.message)
                    })
            )
        }
    }

    private fun setUpRV(result: List<Listing>){
        carFaxRVAdapter = CarFaxRVAdapter(result, this,this)
        layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = carFaxRVAdapter
        recyclerView?.layoutManager = layoutManager
        val decorater: RecyclerView.ItemDecoration = DividerItemDecoration(this, RecyclerView.VERTICAL)
        recyclerView?.addItemDecoration(decorater)

    }

    private fun printResults(categoryList: List<Listing>) {
        categoryList.forEach { listItem ->
            Log.d("TAG_Q", " " + listItem.id)
        }
    }


    override fun viewCarFaxItem(child: Listing) {
        Log.d("TAG_Q", "fragment opened")
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.car_detail_framelayout, carDetailFragment).commit()
    }

    override fun onCallDealerButtonClicked(child: Listing) {
        TODO("Not yet implemented")
    }
}