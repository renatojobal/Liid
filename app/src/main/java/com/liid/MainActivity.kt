package com.liid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBar(findViewById(R.id.tool_bar_main))
        configNav()
    }

    private fun configNav() {
        NavigationUI.setupWithNavController(bottom_menu, Navigation.findNavController(this, R.id.fragment_content))
    }
}