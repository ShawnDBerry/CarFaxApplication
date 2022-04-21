package com.example.carfaxapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.carfaxapplication.R
import com.example.carfaxapplication.model.Listing

class CarFaxRVAdapter(private var carList: List<Listing>, private var applicationContext: Context):
    RecyclerView.Adapter<CarFaxRVAdapter.CarFaxAdapterViewHolder>() {

    class CarFaxAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var yearMakeModelTrim: TextView = itemView.findViewById(R.id.year_make_model_trim)
    var currentPriceMileage: TextView = itemView.findViewById(R.id.current_price_mileage)
    var locationCityState: TextView = itemView.findViewById(R.id.city_state)
    var vehiclePhoto: ImageView = itemView.findViewById(R.id.car_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarFaxAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_item_layout, parent, false)
        return CarFaxAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarFaxAdapterViewHolder, position: Int) {
        holder.yearMakeModelTrim.text = (carList[position].year.toString() +
                " " + carList[position].make.toString() + " " + carList[position].model.toString() +
                " " + carList[position].trim.toString())

        holder.currentPriceMileage.text = (carList[position].currentPrice.toString() + " | " + carList[position].mileage)
        holder.locationCityState.text = (carList[position].dealer.city + ", " + carList[position].dealer.state)

        Glide.with(applicationContext).load(carList[position].images.firstPhoto)
            .apply(RequestOptions.circleCropTransform()).into(holder.vehiclePhoto)

        holder.itemView.setOnClickListener {

        }
    }
}