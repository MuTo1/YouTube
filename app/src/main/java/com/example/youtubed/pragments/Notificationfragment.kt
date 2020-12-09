package com.example.youtubed.pragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.youtubed.R

class Notificationfragment : Fragment (R.layout.fragment_notification) {

    private lateinit var textview: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textview = view.findViewById(R.id.count)

        //textview.text =

    }
}