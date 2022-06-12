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

            // this function will only perform add and substract operation
            fun parseExpression() : Double{
                var value = parseTerm()
                while(true){
                    if(extraSpace('+'.toInt())) value += parseTerm() // add
                    else if(extraSpace('-'.toInt())) value -= parseTerm() // substract
                    else return value
                }
            }

            fun parseTerm() : Double{
               /* var value = parseFactor()
                while(true){
                    if(extraSpace('*'.toInt())) value *= parseFactor()
                    else if (extraSpace('/'.toInt()))
                }*/
                return 0.0
            }

        }
    }
}