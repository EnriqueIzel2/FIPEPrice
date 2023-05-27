package com.enriqueizel.fipeprice.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enriqueizel.fipeprice.data.Car
import com.enriqueizel.fipeprice.databinding.CarItemBinding

class CarAdapter(private val carList: List<Car>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

  inner class ViewHolder(val binding: CarItemBinding) : RecyclerView.ViewHolder(binding.root) {

  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(
      CarItemBinding.inflate(
        LayoutInflater.from(parent.context),
        parent,
        false
      )
    )
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val car = carList[position]

    holder.binding.carName.text = car.name
  }

  override fun getItemCount() = carList.size
}