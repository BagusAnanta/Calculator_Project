package com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula

class MathTrigonometryInverse {
    // Inverse formula in trigonometry sin^-1,cos^-1 ,tan^-1 and inverse have 2 in radiant or degress
    var Mathtrigonometry = MathTrigonometry().MathTrigonometryDegress()

    fun SinusInverseRadiant(X : Double) : Double{
        val result = Math.toRadians(Math.asin(Math.sin(X)))
        return result
    }

    fun CosinusInverseRadiant(X : Double) : Double{
        val result = Math.toRadians(Math.acos(Math.cos(X)))
        return result
    }

    fun TangeInverseRadiant(X : Double) : Double{
        val result = Math.toRadians(Math.atan(Math.tan(X)))
        return result
    }

    inner class MathTrigonometryInverseDegress{

        fun SinusInverseDegress(X : Double) : Double{
            val convert_radiant = Math.toRadians(X)
            val result = Math.toDegrees(Math.asin(Math.sin(convert_radiant)))
            return result
        }

        fun CosinusInverseDegress(X : Double) : Double{
            val convert_radiant = Math.toRadians(X)
            val result = Math.toDegrees(Math.asin(Math.cos(convert_radiant)))
            return result
        }

        fun TangenInverseDegress(X : Double) : Double{
            val convert_radiant = Math.toRadians(X)
            val result = Math.toDegrees(Math.atan(Math.tan(convert_radiant)))
            return result
        }

    }


}