package com.bsoftwarefoundation.calculator.Mathformula

class MathRoot {

    fun SquareRoot(X : Double): Double{
        val result : Double = Math.sqrt(X)
        return result
    }

    fun Yunderrooty(y : Double) : Double{
        // a formula is y ^ 1/y
        val formula : Double = Math.pow(y,1.0/y)
        return formula
    }

}