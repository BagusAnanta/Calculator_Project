package com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula

class MathTrigonometryInverse {
    // Inverse formula in trigonometry sin^-1,cos^-1 ,tan^-1 and inverse have 2 in radiant or degress

    fun SinusInverseRadiant(X : Double) : Double{
        val result = Math.asin(X)
        return result
    }

    fun CosinusInverseRadiant(X : Double) : Double{
        val result = Math.acos(X)
        return result
    }

    fun TangeInverseRadiant(X : Double) : Double{
        val result = Math.atan(X)
        return result
    }

    inner class MathTrigonometryInverseDegress{

        fun SinusInverseDegress(X : Double) : Double{
            val convert_radiant = Math.toDegrees(X)
            val result = Math.asin(convert_radiant)
            return result
        }

        fun CosinusInverseDegress(X : Double) : Double{
            val convert_radiant = Math.toDegrees(X)
            val result = Math.acos(convert_radiant)
            return result
        }

        fun TangenInverseDegress(X : Double) : Double{
            val convert_radiant = Math.toDegrees(X)
            val result = Math.atan(convert_radiant)
            return result
        }

    }


}