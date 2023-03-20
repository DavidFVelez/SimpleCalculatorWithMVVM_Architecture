package com.davidvelez.simplecalculator.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val suma: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }
    val resta: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }
    val division: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }
    val multiplicacion: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }


    fun sumar(valor1: Double, valor2: Double) {

      suma.value = valor1+valor2
        //Log.d("Resultado", total.toString())

    }

    fun restar(valor1: Double, valor2: Double) {

        resta.value = valor1-valor2

    }
    fun dividir(valor1: Double, valor2: Double) {

        division.value = valor1/valor2

    }
    fun multiplicar(valor1: Double, valor2: Double) {

        multiplicacion.value= valor1*valor2

    }


}