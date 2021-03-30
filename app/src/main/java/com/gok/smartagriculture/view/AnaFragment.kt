package com.gok.smartagriculture.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.gok.smartagriculture.R
import kotlinx.android.synthetic.main.fragment_ana.*


class AnaFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ana, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_veriler.setOnClickListener {
            val action = AnaFragmentDirections.actionAnaFragmentToVerilerFragment()
            Navigation.findNavController(it).navigate(action)
        }
        button_kontrol.setOnClickListener {
            val action = AnaFragmentDirections.actionAnaFragmentToKontrolFragment()
            Navigation.findNavController(it).navigate(action)
        }
        button_haberler.setOnClickListener {
            val action = AnaFragmentDirections.actionAnaFragmentToHaberlerFragment()
            Navigation.findNavController(it).navigate(action)
        }


    }


}