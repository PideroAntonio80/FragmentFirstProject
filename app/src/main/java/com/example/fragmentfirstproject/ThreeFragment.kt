package com.example.fragmentfirstproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentfirstproject.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {
    private var _binding: FragmentThreeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThreeBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ThreeFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}