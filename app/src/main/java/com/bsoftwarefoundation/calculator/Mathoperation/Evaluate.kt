package com.bsoftwarefoundation.calculator.Mathoperation

import com.bsoftwarefoundation.calculator.Mathformula.MathEuler
import com.bsoftwarefoundation.calculator.Mathformula.MathLogaritm
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometry
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometryHyperbolic
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometryInverse

class Evaluate {
    
    var Math_eular = MathEuler()
    var Math_logaritm = MathLogaritm()
    var Math_trigonometryhyper = MathTrigonometryHyperbolic()

    // for check position and char position
    fun evaluate(str : String) : Any {
        return object  : Any(){
            var position = -1
            var chart = 0

            // in below method use for moving to next character (Space)
            fun nextChar(){
                /*
                * below line, we are increment position
                * and moving to next position*/
                chart = if(++position < str.length) str[position].toInt() else -1
            }

            // in below method use to check the extra space
            // present int the expression and remove it
            fun extraSpace(charttoextra : Int) : Boolean{
                while(chart == ' '.toInt()) nextChar()
                if(chart == charttoextra){
                    nextChar()
                    return true
                }
                return false
            }

            fun parse() : Double{
                nextChar()
                val value = parseExpression()
                if(position < str.length) throw RuntimeException("Unexpected: " + chart.toChar())
                return value
            }

            // this function will only perform add and substract operation
            fun parseExpression() : Double{
                var value = parseTerm()
                while(true){
                    if(extraSpace('+'.toInt())) value += parseTerm() // add
                    else if(extraSpace('-'.toInt())) value -= parseTerm() // subtract
                    else return value
                }
            }

            fun parseTerm() : Double{
                var value = parseFactor()
                while(true){
                    if(extraSpace('*'.toInt())) value *= parseFactor()
                    else if (extraSpace('/'.toInt())) value /= parseFactor()
                    else return value
                }

            }

            fun parseFactor() : Double{
                // on below, we gonna check add and substract and performing unary operation
                if(extraSpace('+'.toInt())) return parseFactor() // Unary add
                if(extraSpace('-'.toInt())) return -parseFactor() // Unary Subtract

                // double variable for answer
                var value : Double = 0.0
                // variable for position
                val startPosition = position

                // below, we are make check open and close parenthesis algoritm
                if(extraSpace('('.toInt())){
                    value = parseExpression()
                    extraSpace(')'.toInt())
                } else if (chart >= '0'.toInt() && chart <= '9'.toInt() || chart == '.'.toInt()){
                    while (chart >= '0'.toInt() && chart <= '9'.toInt() || chart == '.'.toInt()) nextChar()
                    // below we are getting sub string from our string user start and position
                    value = str.substring(startPosition,position).toDouble()
                } else if(chart >= 'a'.toInt() && chart <= 'z'.toInt()){
                    while(chart >= 'a'.toInt() && chart <= 'z'.toInt()) nextChar()
                    val function = str.substring(startPosition,position)
                    value = parseFactor()
                    value = when(function){
                        "ln"   -> Math_logaritm.ln(value)
                        "log"  -> Math_logaritm.Logaritm(value)
                        "sinh" -> Math_trigonometryhyper.SinusHyperbolic(value)
                        "cosh" -> Math_trigonometryhyper.CosinusHyperbolic(value)
                        "tanh" -> Math_trigonometryhyper.TangenHyperbolic(value)
                        "e^x"  -> Math_eular.EulerPowerX(value)
                        else -> 0.0
                    }
                }
                return value
            }
        }.parse()
    }
}