package com.example.inshortnewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.inshortnewsapp.Fragments.AllNewsFragment
import com.example.inshortnewsapp.Fragments.DiscoverFragment
import com.example.inshortnewsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)



        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(DiscoverFragment(),"Discover")
        adapter.addFragment(AllNewsFragment(),"All News")


        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

    }
}