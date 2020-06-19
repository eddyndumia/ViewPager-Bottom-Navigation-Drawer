package ed.developer.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ed.developer.viewpager.Fragments.*

//
// Created by Eddy Developer W. on 6/6/2020.
// Copyright (c) 2020 Developers Team Inc. All rights reserved.
internal class PagerAdapter(fragment: FragmentManager) :
    FragmentPagerAdapter(fragment) {
    override fun getItem(position: Int): Fragment {
        return when(position){

            0 ->{HomeFragment()}
            1 -> {SearchFragment()}
            2 -> {PostFragment()}
            3 -> {NotificationsFragment()}
            4 -> {ProfileFragment()}
            else ->{HomeFragment()}
        }
    }

    override fun getCount(): Int {
        return 5
    }

}