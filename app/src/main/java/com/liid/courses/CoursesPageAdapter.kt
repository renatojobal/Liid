package com.liid.courses

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

private const val ARG_OBJECT = "object"

class CoursesPageAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return 7
    }

    override fun getItem(position: Int): Fragment {
        val fragment = DemoObjectFragment()
        fragment.arguments = Bundle().apply {
            // Our object is just an integer :-P
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment
    }

    override fun getPageTitle(position: Int): CharSequence {
        return "Nuevos ${(position + 1)}"
    }

}