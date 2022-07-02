package com.bsoftwarefoundation.calculator.Mathoperation
import net.objecthunter.exp4j.ExpressionBuilder

class Operation {

    fun operation(Expression : String) : String{
        val expression = ExpressionBuilder(Expression).build()
        val result = expression.evaluate().toString()
        return result
    }
}