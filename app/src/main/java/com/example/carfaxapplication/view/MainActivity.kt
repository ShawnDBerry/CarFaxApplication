package com.example.carfaxapplication.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
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

class MainActivity : AppCompatActivity(), CarFaxRVAdapter.CarFaxItemDelegate {

    private var compositeDisposable = CompositeDisposable()
    private lateinit var carFaxViewModel: CarFaxViewModel
    private var carFaxRVAdapter: CarFaxRVAdapter? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    val recyclerView: RecyclerView = findViewById(R.id.car_list_recyclerview)
    private var carDetailFragment = CarDetailFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        carFaxViewModel = ViewModelProvider(this).get(CarFaxViewModel::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            compositeDisposable.add(
                carFaxViewModel.getCarFax()
                    .subscribe({ listing ->
                        printResults(listing.listings)
                        setUpRV(listing.listings)
                    }, { throwable ->
                        Log.d("TAG_Q", "error " + throwable.message)
                    })
            )
        }
    }

    private fun setUpRV(result: List<Listing>){
        carFaxRVAdapter = CarFaxRVAdapter(result, this,this)
        layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = carFaxRVAdapter
        recyclerView.layoutManager = layoutManager
        val decorater: RecyclerView.ItemDecoration = DividerItemDecoration(this, RecyclerView.VERTICAL)
        recyclerView.addItemDecoration(decorater)

    }

    private fun printResults(categoryList: List<Listing>) {
        categoryList.forEach { listItem ->
            Log.d("TAG_Q", " " + listItem.id)
        }
    }

    override fun viewCarFaxItem(child: Listing) {
        TODO("Not yet implemented")
    }
}