package com.enriqueizel.fipeprice.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enriqueizel.fipeprice.databinding.FragmentMainBinding

class MainFragment : Fragment() {

  private var _binding: FragmentMainBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    _binding = FragmentMainBinding.inflate(inflater, container, false)
    val view = binding.root

    return view
  }

  override fun onDestroy() {
    super.onDestroy()
    _binding = null
  }
}