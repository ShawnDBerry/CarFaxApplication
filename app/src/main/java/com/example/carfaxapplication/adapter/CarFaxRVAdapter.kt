package com.example.carfaxapplication.adapter

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carfaxapplication.R
import com.example.carfaxapplication.model.Listing


class CarFaxRVAdapter(
    private var carList: List<Listing>,
    private var carFaxItemDelegate: CarFaxItemDelegate,
    private var applicationContext: Context,
) :
    RecyclerView.Adapter<CarFaxRVAdapter.CarFaxAdapterViewHolder>() {

    interface CarFaxItemDelegate {
        fun viewCarFaxItem(child: Listing)
    }

    interface CardClickListener {
        fun onCallDealerButtonClicked(child: Listing)
    }

    class CarFaxAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var yearMakeModelTrim: TextView = itemView.findViewById(R.id.year_make_model_trim)
        var currentPriceMileage: TextView = itemView.findViewById(R.id.current_price_mileage)
        var locationCityState: TextView = itemView.findViewById(R.id.city_state)
        var vehiclePhoto: ImageView = itemView.findViewById(R.id.car_image)
        var callDealerButton: Button = itemView.findViewById(R.id.call_dealer_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarFaxAdapterViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.car_item_layout, parent, false)
        return CarFaxAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarFaxAdapterViewHolder, position: Int) {
        holder.yearMakeModelTrim.text = (carList[position].year.toString() +
                " " + carList[position].make.toString() + " " + carList[position].model.toString() +
                " " + carList[position].trim.toString())

        holder.currentPriceMileage.text =
            (carList[position].currentPrice.toString() + " | " + carList[position].mileage)
        holder.locationCityState.text =
            (carList[position].dealer.city + ", " + carList[position].dealer.state)

        Glide.with(applicationContext).load(carList[position].images.firstPhoto.large)
            .into(holder.vehiclePhoto)

        holder.itemView.setOnClickListener {
            carFaxItemDelegate.viewCarFaxItem(carList[position])
        }
        holder.callDealerButton.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_CALL)

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
            callIntent.data = Uri.parse("tel:" + carList[position].dealer.phone)
            startActivity(applicationContext, callIntent, null)

        }
    }
}