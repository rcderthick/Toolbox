package com.example.toolbox.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.toolbox.ActivityReference_ASCII
import com.example.toolbox.databinding.FragmentEngineeringBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentEngineeringBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentEngineeringBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        var btnAscii = binding.btnAscii
        btnAscii.setOnClickListener{
            val intent = Intent(requireContext(), ActivityReference_ASCII::class.java)
            startActivity(intent)
        }








        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}