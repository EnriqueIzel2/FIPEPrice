package com.enriqueizel.fipeprice.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Car(
  val id: String,
  val name: String
) : Parcelable
