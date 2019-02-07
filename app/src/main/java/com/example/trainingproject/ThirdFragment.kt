package com.example.trainingproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.third_fragment, container, false)
        val textView = view.findViewById<TextView>(R.id.txtMain)
        textView.setText(R.string.fragment_3)
        return view
    }
}
