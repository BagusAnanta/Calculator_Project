package com.bsoftwarefoundation.calculator.Mathoperation

class Evaluate {
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
                var answer : Double = 0.0
                // variable for position
                val startPosition = position

                // below, we are make check open and close parenthesis algoritm
                if(extraSpace('('.toInt())){
                    answer = parseExpression()
                    extraSpace(')'.toInt())
                } else if (chart >= '0'.toInt() && chart <= '9'.toInt() || chart == '.'.toInt()){
                    while (chart >= '0'.toInt() && chart <= '9'.toInt() || chart == '.'.toInt()) nextChar()
                    // below we are getting sub string from our string user start and position
                    answer = str.substring(startPosition,position).toDouble()
                }
                return answer
            }
        }.parse()
    }
}