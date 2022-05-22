package com.bsoftwarefoundation.calculator.Mathformula

import android.widget.TextView

class MathDerivative {

    // Derivative formula : nX^n-1
    fun Derivative(n: Double): Double {

        // return derivative power
        val derivative_pow = n-1
        return derivative_pow
    }

    // Derivative formula :
    fun Derivative(X : Double, n : Double, result : TextView) : Double{

        // TODO: Fix This before
        // for n-1
        val derivative_pow = n-1

        // for X.n
        val derivative_multiply = X*n

        return derivative_pow
    }
}