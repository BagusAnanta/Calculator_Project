package com.bsoftwarefoundation.calculator.Mathformula

open class MathPower{

    fun XPower2(X : Double) : Double{
        val result =  Math.pow(X, 2.0)
        return result
    }

    fun XPower3(X : Double) : Double{
        val result = Math.pow(X,3.0)
        return result
    }

    fun XPowerY(X : Double, Y : Double) : Double{
        val result = Math.pow(X,Y)
        return result
    }

    fun TenPowerx(x : Double) : Double{
        val result = Math.pow(10.0,x)
        return result
    }



}

