package com.bsoftwarefoundation.calculator.Mathformula

class MathFactorial() {

    fun Factorial(n : Int):Double{
        // Factorial formula = n! = n*n*n*n...3*2*1
        // if n == 0 or n == 1, return 1
        var factresult = 1

        if(n == 0|| n == 1){
            return factresult.toDouble()
        } else {
            for(num in n downTo 1){ factresult *= num }
        }
        
        return factresult.toDouble()
    }
}