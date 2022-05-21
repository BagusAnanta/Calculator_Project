package com.bsoftwarefoundation.calculator.Componentcalculator

import android.widget.TextView

class ComponentDeleteClear {

    fun ClearAll(Maintext : TextView,Secondtext : TextView){
        // cleare all text
        Maintext.setText("")
        Secondtext.setText("")
    }
}