package com.example.a5_tenzor_two_activities

import android.content.Context
import android.content.ReceiverCallNotAllowedException
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText

class SenderFragment : Fragment(R.layout.sender_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("LifecycleTag", "Sender: onViewCreated")
        super.onViewCreated(view, savedInstanceState)
        val updateButton = requireView().findViewById<Button>(R.id.send_button)
        val textInput = requireView().findViewById<TextInputEditText>(R.id.text_input)

        updateButton.setOnClickListener {
            val fragment = ReceiverFragment()
            val bundle = Bundle();
            bundle.putString("message", textInput.text.toString())
            ViewModelProvider(requireActivity())
                .get(ReceiverViewModel::class.java)
                .getMessage()
                .removeObservers(requireActivity())
            fragment.arguments = bundle
            requireActivity().supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment, "receiverF1")
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onAttach(context: Context) {
        Log.i("LifecycleTag", "Sender: onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifecycleTag", "Sender: onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("LifecycleTag", "Sender: onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        Log.i("LifecycleTag", "Sender: onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("LifecycleTag", "Sender: onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("LifecycleTag", "Sender: onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("LifecycleTag", "Sender: onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("LifecycleTag", "Sender: onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.i("LifecycleTag", "Sender: onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i("LifecycleTag", "Sender: onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i("LifecycleTag", "Sender: onDetach")
        super.onDetach()
    }
}