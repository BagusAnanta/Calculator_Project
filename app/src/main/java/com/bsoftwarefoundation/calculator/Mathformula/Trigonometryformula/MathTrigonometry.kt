package com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula

class MathTrigonometry {

    // Trigonometry on Radiant
    fun SinusRadiant(X : Double) : Double{
        val result = Math.sin(X)
        val radian_result = Math.toRadians(result)
        return radian_result
    }

    fun CosinusRadiant(X : Double) : Double{
        val result = Math.cos(X)
        val radian_result = Math.toRadians(result)
        return radian_result
    }

    fun TangenRadiant(X : Double) : Double{
        val result = Math.tan(X)
        val radian_result = Math.toRadians(result)
        return radian_result
    }

    inner class MathTrigonometryDegress{

        // Trigonometry on Degress
        fun SinusDegress(X : Double) : Double{
            val result = Math.sin(X)
            val degress_result = Math.toDegrees(result)
            return degress_result
        }

        fun CosinusDegress(X : Double) : Double{
            val result = Math.cos(X)
            val degress_result = Math.toDegrees(result)
            return degress_result
        }

        fun TangenDegress(X : Double) : Double{
            val result = Math.tan(X)
            val degress_result = Math.toDegrees(result)
            return degress_result
        }
    }
}