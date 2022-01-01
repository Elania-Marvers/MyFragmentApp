package com.mytryonkotlinpartii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), RedFragment.RedFragmentListener {


    private lateinit var redFragment: RedFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redFragment = RedFragment()
        redFragment.listener = this


        supportFragmentManager.beginTransaction()
            .add(R.id.container, redFragment)
            .commit()
    }

    override fun onClick() {
        val blueFragment = BlueFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, blueFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .addToBackStack(null)
            .commit()
    }
}