package com.example.a5_tenzor_two_activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class ReceiverFragment : Fragment(R.layout.receiver_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("LifecycleTag", "Receiver: onViewCreated")
        val readButton = view.findViewById<Button>(R.id.read_button)
        val message = view.findViewById<TextView>(R.id.message_text_box)
        val messageText = arguments?.getString("message") ?: ""


        Log.i("delta", "overdrivу")
        val viewModel = ViewModelProvider(requireActivity()).get(ReceiverViewModel::class.java)
        message.setText(messageText)
        viewModel.getMessage().observe(viewLifecycleOwner, Observer<String> { msg ->
            Log.i("delta", msg)
            view.findViewById<TextView>(R.id.message_text_box).setText(msg)
        })

        readButton.setOnClickListener {
            viewModel.storeMessage(getString(R.string.message_was_read))
        }
    }

    override fun onAttach(context: Context) {
        Log.i("LifecycleTag", "Receiver: onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifecycleTag", "Receiver: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("LifecycleTag", "Receiver: onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        Log.i("LifecycleTag", "Receiver: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("LifecycleTag", "Receiver: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("LifecycleTag", "Receiver: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("LifecycleTag", "Receiver: onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("LifecycleTag", "Receiver: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.i("LifecycleTag", "Receiver: onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("LifecycleTag", "Receiver: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("LifecycleTag", "Receiver: onDetach")
        super.onDetach()
    }
}