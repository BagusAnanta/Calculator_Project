package com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula

class MathTrigonometryInverse {
    // Inverse formula in trigonometry sin^-1,cos^-1 ,tan^-1 and inverse have 2 in radiant or degress
    var Mathtrigonometry = MathTrigonometry().MathTrigonometryDegress()

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
            val result = Math.toDegrees(Math.asin(X))
            return result
        }

        fun CosinusInverseDegress(X : Double) : Double{
            val result = Math.toDegrees(Math.acos(X))
            return result
        }

        fun TangenInverseDegress(X : Double) : Double{
            val result = Math.toDegrees(Math.atan(X))
            return result
        }

    }


}