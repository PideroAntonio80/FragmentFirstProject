package com.example.fragmentfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentfirstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.flFragmentContainer, OneFragment.newInstance()).commit()

        initListeners()
    }

    private fun initListeners() {
        binding.bOne.setOnClickListener {
            showFragment(OneFragment.newInstance())
        }

        binding.bTwo.setOnClickListener {
            showFragment(TwoFragment.newInstance())
        }

        binding.bThree.setOnClickListener {
            showFragment(ThreeFragment.newInstance())
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.flFragmentContainer, fragment).commit()
    }
}