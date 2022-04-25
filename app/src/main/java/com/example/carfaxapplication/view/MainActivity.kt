package com.example.carfaxapplication.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
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
    private var carFaxViewModel = CarFaxViewModel()
    private var carFaxRVAdapter: CarFaxRVAdapter? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var carDetailFragment = CarDetailFragment()
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        val bundle = Bundle()
        val vehicleImage = child.images.firstPhoto.large
        val vehicleYearMakeModelTrim = (child.year.toString() +
                " " + child.make.toString() + " " + child.model.toString() +
                " " + child.trim.toString())
        val location = (child.dealer.city + ", " + child.dealer.state)
        val currentPriceMileage = (child.currentPrice.toString() + " | " + child.mileage)
        val interiorColor = child.interiorColor
        val exteriorColor = child.exteriorColor
        val driveType = child.drivetype
        val transmission = child.transmission
        val engine = child.engine
        val bodyType = child.bodytype

        bundle.putString("vehicleImage", vehicleImage)
        bundle.putString("yearMakeModelTrim", vehicleYearMakeModelTrim)
        bundle.putString("currentPriceMileage", currentPriceMileage)
        bundle.putString("location", location)
        bundle.putString("interiorColor", interiorColor)
        bundle.putString("exteriorColor", exteriorColor)
        bundle.putString("driveType", driveType)
        bundle.putString("transmission", transmission)
        bundle.putString("engine", engine)
        bundle.putString("bodyType", bodyType)

        carDetailFragment.arguments = bundle
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(R.id.car_detail_framelayout, carDetailFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onCallDealerButtonClicked(child: Listing) {
        TODO("Not yet implemented")
    }
}