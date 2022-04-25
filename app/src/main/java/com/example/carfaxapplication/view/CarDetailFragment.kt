package com.example.carfaxapplication.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.carfaxapplication.R
import java.text.DecimalFormat
import java.text.NumberFormat


class CarDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_car_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var yearMakeModelTrim: TextView = view.findViewById(R.id.year_make_model_trim)
        var currentPriceMileage: TextView = view.findViewById(R.id.current_price_mileage)
        var locationCityState: TextView = view.findViewById(R.id.vehicle_location_value)
        var interiorColor: TextView = view.findViewById(R.id.vehicle_interior_color_value)
        var exteriorColor: TextView = view.findViewById(R.id.vehicle_exterior_color_value)
        var driveType: TextView = view.findViewById(R.id.vehicle_drive_type_value)
        var transmission: TextView = view.findViewById(R.id.vehicle_transmission_value)
        var engine: TextView = view.findViewById(R.id.vehicle_engine_value)
        var bodyStyle: TextView = view.findViewById(R.id.vehicle_body_type_value)
        context?.let {
            Glide.with(it).load(this.requireArguments().getString("vehicleImage"))
                .into(view.findViewById(R.id.car_image))
        }
        yearMakeModelTrim.text = this.requireArguments().getString("yearMakeModelTrim")
        currentPriceMileage.text = this.requireArguments().getString("currentPriceMileage")
        locationCityState.text = this.requireArguments().getString("locationCityState")
        interiorColor.text = this.requireArguments().getString("interiorColor")
        exteriorColor.text = this.requireArguments().getString("exteriorColor")
        driveType.text = this.requireArguments().getString("driveType")
        transmission.text = this.requireArguments().getString("transmission")
        engine.text = this.requireArguments().getString("engine")
        bodyStyle.text = this.requireArguments().getString("bodyStyle")

        // Sets the derived data (type String) in the TextView
//        myTextView.text = message
    }
}