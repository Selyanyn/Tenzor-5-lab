package com.example.a5_tenzor_two_activities

import android.content.ReceiverCallNotAllowedException
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText

class SenderFragment : Fragment(R.layout.sender_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val updateButton = requireView().findViewById<Button>(R.id.send_button)
        val textInput = requireView().findViewById<TextInputEditText>(R.id.text_input)

        updateButton.setOnClickListener {
            val fragment = ReceiverFragment()
            val bundle = Bundle();
            bundle.putString("message", textInput.text.toString())
            fragment.arguments = bundle
            requireActivity().supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }
    }
}