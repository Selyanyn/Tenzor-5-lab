package com.example.a5_tenzor_two_activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class ReceiverFragment : Fragment(R.layout.receiver_fragment) {
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val readButton = view.findViewById<Button>(R.id.read_button)
        val message = view.findViewById<TextView>(R.id.message_text_box)
        message.setText(arguments?.getString("message") ?: "")

        readButton.setOnClickListener {
            message.setText(getString(R.string.message_was_read))
        }
    }
}