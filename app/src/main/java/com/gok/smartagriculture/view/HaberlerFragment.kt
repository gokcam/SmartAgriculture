package com.gok.smartagriculture.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import androidx.lifecycle.ViewModelProvider
import com.gok.smartagriculture.R
import com.gok.smartagriculture.viewmodel.HaberlerFragmentViewModel


class HaberlerFragment : Fragment() {
    private lateinit var viewModel : HaberlerFragmentViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_haberler, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(HaberlerFragmentViewModel::class.java)
        viewModel.getHaber()
    }


}