package com.bsoftwarefoundation.calculator.Componentcalculator

import android.widget.TextView

class ComponentDeleteClear {

    fun ClearAll(Maintext : TextView,Secondtext : TextView){
        // cleare all text
        var maintext : String = Maintext.text.toString()
        var secondtext : String = Secondtext.text.toString()
    }

    fun Delete(MainText : TextView){
        // clear last Character / last Number
        var string : String = MainText.text.toString()

        // if Textview have number/character or not empty, we must substring a text
        if(!string.equals("")){
            string = string.substring(0,string.length - 1)
            MainText.text = string
        }
    }
}