package com.example.navigationhw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var nameInput: EditText
    private lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameInput = view.findViewById(R.id.secondTV)
        submit =view.findViewById(R.id.submit)

        submit.setOnClickListener {
            val name = nameInput.text.toString()
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
            action.name = name
            findNavController().navigate(action)


        }
    }

}