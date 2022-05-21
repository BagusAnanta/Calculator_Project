package com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula

class MathTrigonometryInverse {
    // Inverse formula in trigonometry sin^-1,cos^-1 ,tan^-1 and inverse have 2 in radiant or degress

    fun SinusInverseRadiant(X : Double) : Double{
        val result = Math.asin(X)
        val radian_result = Math.toRadians(result)
        return radian_result
    }

    fun CosinusInverseRadiant(X : Double) : Double{
        val result = Math.acos(X)
        val radian_result = Math.toRadians(result)
        return radian_result
    }

    fun TangeInverseRadiant(X : Double) : Double{
        val result = Math.atan(X)
        val radian_result = Math.toRadians(result)
        return radian_result
    }

    inner class MathTrigonometryInverseDegress{

        fun SinusInverseDegress(X : Double) : Double{
            val result = Math.asin(X)
            val degress_result = Math.toDegrees(result)
            return degress_result
        }

        fun CosinusInverseDegress(X : Double) : Double{
            val result = Math.acos(X)
            val degress_result = Math.toDegrees(result)
            return degress_result
        }

        fun TangenInverseDegress(X : Double) : Double{
            val result = Math.atan(X)
            val degress_result = Math.toDegrees(result)
            return degress_result
        }

    }


}