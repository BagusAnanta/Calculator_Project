package com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula

class MathTrigonometry {

    // Trigonometry on Radiant
    fun SinusRadiant(X : Double) : Double{
        val result = Math.sin(X)
        return result
    }

    fun CosinusRadiant(X : Double) : Double{
        val result = Math.cos(X)
        return result
    }

    fun TangenRadiant(X : Double) : Double{
        val result = Math.tan(X)
        return result
    }

    inner class MathTrigonometryDegress{

        // Trigonometry on Degress
        fun SinusDegress(X : Double) : Double{
            // convert into radian
            val convert_radiant = Math.toRadians(X)
            val result = Math.sin(convert_radiant)
            return result
        }

        fun CosinusDegress(X : Double) : Double{
            val convert_radiant = Math.toRadians(X)
            val result = Math.cos(convert_radiant)
            return result
        }

        fun TangenDegress(X : Double) : Double{
            val convert_radiant = Math.toRadians(X)
            val result = Math.tan(convert_radiant)
            return result
        }
    }
}