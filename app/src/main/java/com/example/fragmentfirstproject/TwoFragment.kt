package com.example.fragmentfirstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentfirstproject.databinding.FragmentThreeBinding
import com.example.fragmentfirstproject.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTwoBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            TwoFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}