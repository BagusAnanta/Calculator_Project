package com.bsoftwarefoundation.calculator.Mathoperation
import org.mariuszgromada.math.mxparser.Expression

class Operation {

    fun operation(expression : String) : String{
        val result = Expression(expression).calculate()
        return result.toString()
    }
}