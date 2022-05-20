package com.bsoftwarefoundation.calculator.Mathformula

class MathEuler {

    fun Euler() : String{
        val Euler_equation = Math.E
        return Euler_equation.toString()
    }

    fun EulerPowerX(x : Double) : Double{
        val result = Math.exp(x)
        return result
    }
}