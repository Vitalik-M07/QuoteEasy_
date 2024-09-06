package com.project.presentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.project.presentation.databinding.ActivityMainBinding
import java.security.Provider


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =  ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        val viewModel = (application as ProviderViewModel).viewModel()
        viewModel.liveData.observe(this){
            binding.MainTextView.text = it
        }
        viewModel.load()
    }
}