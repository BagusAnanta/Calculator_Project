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
            var result : Double = 0.0
            if(X == 180.0 || X == 360.0){
                result = 0.0
            } else {
                // convert into radian
                val convert_radiant = Math.toRadians(X)
                result = Math.sin(convert_radiant)
            }
            return result
        }

        fun CosinusDegress(X : Double) : Double{
            var result : Double = 0.0
            if(X == 90.0 || X == 270.0){
                result = 0.0
            } else {
                val convert_radiant = Math.toRadians(X)
                result = Math.cos(convert_radiant)
            }
            return result
        }

        fun TangenDegress(X : Double) : Double{
            var result : Double = 0.0
            if(X == 180.0 || X == 360.0){
                result = 0.0
            } else {
                val convert_radiant = Math.toRadians(X)
                result = Math.tan(convert_radiant)
            }
            return result
        }
    }
}