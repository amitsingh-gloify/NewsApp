package com.example.inshortnewsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class ViewPagerAdapter(supportFragmentManger : FragmentManager) : FragmentStatePagerAdapter(supportFragmentManger){

    // declare arrayList to contain fragments and its title
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()


    override fun getCount(): Int {
        return  mFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
       return mFragmentList[position]
    }

    fun addFragment(fragment:Fragment,title: String)
    {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }
}