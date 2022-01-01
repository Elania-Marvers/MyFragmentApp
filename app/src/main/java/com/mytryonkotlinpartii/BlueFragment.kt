package com.mytryonkotlinpartii

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BlueFragment: Fragment() {


    private val myTag = "BlueFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(myTag, "onCreate()")
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(myTag, "onAttach()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(myTag, "onDetach()")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }
}