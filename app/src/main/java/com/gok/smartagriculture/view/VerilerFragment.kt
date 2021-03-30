package com.gok.smartagriculture.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.gok.smartagriculture.R
import com.gok.smartagriculture.adapter.VerilerAdapter
import com.gok.smartagriculture.viewmodel.VerilerFragmentViewModel
import kotlinx.android.synthetic.main.fragment_veriler.*


class VerilerFragment : Fragment() {
    private lateinit var viewModel : VerilerFragmentViewModel
    private val recyclerVeriAdapter = VerilerAdapter(arrayListOf())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_veriler, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        VerilerRecyclerView.layoutManager = LinearLayoutManager(context)
        VerilerRecyclerView.adapter = recyclerVeriAdapter

        viewModel = ViewModelProvider(this).get(VerilerFragmentViewModel::class.java)
        viewModel.refreshData()

        observeLiveData()


    }


    fun observeLiveData()
    {
        viewModel.veriler.observe(this, Observer { veriler ->
            veriler?.let {
                VerilerRecyclerView.visibility = View.VISIBLE
                recyclerVeriAdapter.veriListesiGuncelle(veriler)

            }
        })
    }
}