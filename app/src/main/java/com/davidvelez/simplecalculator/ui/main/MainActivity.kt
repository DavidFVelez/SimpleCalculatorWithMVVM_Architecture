package com.davidvelez.simplecalculator.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.davidvelez.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val sumarObserver = Observer<Double> { suma ->
            mainBinding.totalTextView.text = suma.toString()
        }

        mainViewModel.suma.observe(this, sumarObserver)

        val restarObserver = Observer<Double> { resta ->
            mainBinding.totalTextView.text = resta.toString()
        }

        mainViewModel.resta.observe(this, restarObserver)

        val multiplicarObserver = Observer<Double> { multiplicacion ->
            mainBinding.totalTextView.text = multiplicacion.toString()
        }

        mainViewModel.multiplicacion.observe(this, multiplicarObserver)

        val dividirObserver = Observer<Double> { division ->
            mainBinding.totalTextView.text = division.toString()
        }

        mainViewModel.division.observe(this, dividirObserver)


        mainBinding.sumarButton.setOnClickListener {
            mainViewModel.sumar(
                mainBinding.primerNumeroEditText.text.toString().toDouble(),
                mainBinding.segundoNumeroEditText.text.toString().toDouble()
            )
        }

        mainBinding.sumarButton.setOnClickListener {
            mainViewModel.sumar(
                mainBinding.primerNumeroEditText.text.toString().toDouble(),
                mainBinding.segundoNumeroEditText.text.toString().toDouble()
            )
        }

        mainBinding.restarButton.setOnClickListener {
            mainViewModel.restar(
                mainBinding.primerNumeroEditText.text.toString().toDouble(),
                mainBinding.segundoNumeroEditText.text.toString().toDouble()
            )
        }

        mainBinding.dividirButton.setOnClickListener {
            mainViewModel.dividir(
                mainBinding.primerNumeroEditText.text.toString().toDouble(),
                mainBinding.segundoNumeroEditText.text.toString().toDouble()
            )
        }

        mainBinding.multiplicarButton.setOnClickListener {
            mainViewModel.multiplicar(
                mainBinding.primerNumeroEditText.text.toString().toDouble(),
                mainBinding.segundoNumeroEditText.text.toString().toDouble()
            )
        }

    }

}