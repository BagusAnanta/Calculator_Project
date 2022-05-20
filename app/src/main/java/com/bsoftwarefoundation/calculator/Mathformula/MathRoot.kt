package com.bsoftwarefoundation.calculator.Mathformula

class MathRoot {

    fun SquareRoot(X : Double): Double{
        val result : Double = Math.sqrt(X)
        return result
    }

    fun YunderrootX(y : Double, X : Double) : Double{
        // a formula is X ^ 1/y
        val formula : Double = Math.pow(X,1.0/y)
        return formula
    }

}