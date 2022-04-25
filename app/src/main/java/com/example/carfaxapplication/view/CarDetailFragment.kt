package com.example.carfaxapplication.view

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import com.bumptech.glide.Glide
import com.example.carfaxapplication.R


class CarDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_car_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val context: Context = getApplicationContext()

        val packageManager: PackageManager = context.getPackageManager()
        val packageName: String = context.getPackageName()
        val yearMakeModelTrim: TextView = view.findViewById(R.id.year_make_model_trim)
        val currentPriceMileage: TextView = view.findViewById(R.id.current_price_mileage)
        val locationCityState: TextView = view.findViewById(R.id.vehicle_location_value)
        val interiorColor: TextView = view.findViewById(R.id.vehicle_interior_color_value)
        val exteriorColor: TextView = view.findViewById(R.id.vehicle_exterior_color_value)
        val driveType: TextView = view.findViewById(R.id.vehicle_drive_type_value)
        var transmission: TextView = view.findViewById(R.id.vehicle_transmission_value)
        var engine: TextView = view.findViewById(R.id.vehicle_engine_value)
        var bodyStyle: TextView = view.findViewById(R.id.vehicle_body_type_value)
        var callDealerButton: Button = view.findViewById(R.id.call_dealer_button)
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
        val callDealerPhone = this.requireArguments().getString("bodyStyle")

        callDealerButton.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_CALL)

            if (context.let { it1 -> ActivityCompat.checkSelfPermission(it1, Manifest.permission.CALL_PHONE) } != PackageManager.PERMISSION_GRANTED) {
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
            callIntent.data = Uri.parse("tel:$callDealerPhone")
            context?.let { it1 -> ContextCompat.startActivity(it1, callIntent, null) }

        }
    }
}