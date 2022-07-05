package com.example.checklistoto

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.checklistoto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun onDelete(view: View) {
        binding.parentLinearLayout.removeView(view.parent as View)
    }
    fun onAddField(view: View) {
        val inflater =
            getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView: View = inflater.inflate(R.layout.field, null)
        binding.parentLinearLayout.addView(rowView, binding.parentLinearLayout.childCount - 1)
    }
}