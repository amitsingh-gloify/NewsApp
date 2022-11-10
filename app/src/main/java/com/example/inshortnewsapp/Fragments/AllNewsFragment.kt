package com.example.inshortnewsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.inshortnewsapp.databinding.FragmentAllNewsBinding


class AllNewsFragment : Fragment() {

lateinit var binding:FragmentAllNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding = FragmentAllNewsBinding.inflate(inflater,container,false)


        return binding.root
    }

}