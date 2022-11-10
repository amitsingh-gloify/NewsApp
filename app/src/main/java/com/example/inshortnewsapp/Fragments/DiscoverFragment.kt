package com.example.inshortnewsapp.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.inshortnewsapp.databinding.FragmentDiscoverBinding


class DiscoverFragment : Fragment() {

    lateinit var bindind:FragmentDiscoverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var  binding = FragmentDiscoverBinding.inflate(inflater, container, false)


        return binding.root

    }


}