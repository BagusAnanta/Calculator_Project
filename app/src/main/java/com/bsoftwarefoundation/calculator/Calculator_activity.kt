package com.bsoftwarefoundation.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import com.bsoftwarefoundation.calculator.Mathformula.MathPower
import org.w3c.dom.Text

class Calculator_activity : AppCompatActivity() {
    // TODO: Initiated MathFormula Class
    var Math_power = MathPower()

    // TODO : Initiated TextView Result
    private lateinit var Textview_Result : TextView
    private lateinit var SecondTextview_Result : TextView
    private lateinit var IndicatorError_Result : TextView


    // TODO : Initiated Button Operation Symbol
    private lateinit var Button_AC : Button
    private lateinit var Button_DEL : Button
    private lateinit var Button_PlusMinus : Button
    private lateinit var Button_Divide : Button
    private lateinit var Button_Multiply : Button
    private lateinit var Button_Substract : Button
    private lateinit var Button_Add : Button
    private lateinit var Button_Equals : Button
    private lateinit var Button_Percent : Button
    private lateinit var Button_Decimal : Button

    // TODO : Initiated Button Number
    private lateinit var Button_Zero : Button
    private lateinit var Button_One : Button
    private lateinit var Button_Two : Button
    private lateinit var Button_Three : Button
    private lateinit var Button_Four : Button
    private lateinit var Button_Five : Button
    private lateinit var Button_Six : Button
    private lateinit var Button_Seven : Button
    private lateinit var Button_Eight : Button
    private lateinit var Button_Nine : Button

    // TODO : Initiated Button Scientific Calculator Symbol
    private lateinit var Button_OpenParentheses : Button
    private lateinit var Button_CloseParentheses : Button
    private lateinit var Button_MC : Button
    private lateinit var Button_MPlus : Button
    private lateinit var Button_MMinus : Button
    private lateinit var Button_MR : Button
    private lateinit var Button_XPower2 : Button
    private lateinit var Button_XPower3 : Button
    private lateinit var Button_XPowery : Button
    private lateinit var Button_XFactorial : Button
    private lateinit var Button_root : Button
    private lateinit var Button_PowerY_UnderRootX : Button
    private lateinit var Button_1DivideX : Button
    private lateinit var Button_e : Button
    private lateinit var Button_ePowerX : Button
    private lateinit var Button_In : Button
    private lateinit var Button_log : Button
    private lateinit var Button_logPowerY : Button
    private lateinit var Button_Radian : Button
    private lateinit var Button_Sin : Button
    private lateinit var Button_Cos : Button
    private lateinit var Button_Tan : Button
    private lateinit var Button_Inverse : Button
    private lateinit var Button_10PowerX : Button
    private lateinit var Button_Degress : Button
    private lateinit var Button_Sinh : Button
    private lateinit var Button_Cosh : Button
    private lateinit var Button_Tanh : Button
    private lateinit var Button_YPowerX : Button
    private lateinit var Button_Pi : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        // set content
        setContentView(R.layout.activity_main)

        // TODO : Declare Button and Textview Calculator

        // Textview Result
        Textview_Result = findViewById(R.id.textViewcalculator)
        SecondTextview_Result = findViewById(R.id.secondtextViewcalculator)
        IndicatorError_Result = findViewById(R.id.indicatorerrorcalculator)

        // Button Symbol
        Button_AC = findViewById(R.id.Clear)
        Button_DEL = findViewById(R.id.Delete)
        Button_PlusMinus = findViewById(R.id.Plusminus)
        Button_Divide = findViewById(R.id.Divide)
        Button_Multiply = findViewById(R.id.Multiply)
        Button_Substract = findViewById(R.id.Substract)
        Button_Add = findViewById(R.id.Add)
        Button_Equals = findViewById(R.id.Equals)
        Button_Percent = findViewById(R.id.Percent)
        Button_Decimal = findViewById(R.id.Decimal)

        // Button Number
        Button_Zero = findViewById(R.id.Zero)
        Button_One = findViewById(R.id.One)
        Button_Two = findViewById(R.id.Two)
        Button_Three = findViewById(R.id.Three)
        Button_Four = findViewById(R.id.Four)
        Button_Five = findViewById(R.id.Five)
        Button_Six = findViewById(R.id.Six)
        Button_Seven = findViewById(R.id.Seven)
        Button_Eight = findViewById(R.id.Eight)
        Button_Nine = findViewById(R.id.Nine)

        // Scientific Math Calculator Symbol
        // TODO: Null Pointer Exception Problem
        Button_OpenParentheses   = findViewById(R.id.Openparentheses)
        Button_CloseParentheses = findViewById(R.id.Closeparentheses)
        Button_MC = findViewById(R.id.MC)
        Button_MPlus = findViewById(R.id.Mplus)
        Button_MMinus = findViewById(R.id.Mminus)
        Button_MR = findViewById(R.id.Mr)
        Button_XPower2 = findViewById(R.id.Xpower2)
        Button_XPower3 = findViewById(R.id.Xpower3)
        Button_XPowery = findViewById(R.id.Xpowery)
        Button_XFactorial = findViewById(R.id.Factorial)
        Button_root = findViewById(R.id.Root)
        Button_PowerY_UnderRootX = findViewById(R.id.YunderrootX)
        Button_1DivideX = findViewById(R.id.Dividedby1)
        Button_e = findViewById(R.id.Naturalequation)
        Button_ePowerX = findViewById(R.id.Naturalpowerx)
        Button_In = findViewById(R.id.In)
        Button_log = findViewById(R.id.Logaritm)
        Button_logPowerY = findViewById(R.id.Logaritmpowy)
        Button_Radian = findViewById(R.id.Radiant)
        Button_Sin = findViewById(R.id.Sinus)
        Button_Cos = findViewById(R.id.Cosinus)
        Button_Tan = findViewById(R.id.Tangen)
        Button_Inverse = findViewById(R.id.Inverse)
        Button_10PowerX = findViewById(R.id.Tenpowerx)
        Button_Degress = findViewById(R.id.Degress)
        Button_Sinh = findViewById(R.id.Sinush)
        Button_Cosh = findViewById(R.id.Cosinush)
        Button_Tanh = findViewById(R.id.Tangenh)
        Button_YPowerX = findViewById(R.id.Ypowerx)
        Button_Pi = findViewById(R.id.pi)

        // TODO : For Number Button

        Button_One.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "1")
        }

        Button_Two.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "2")
        }

        Button_Three.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "3")
        }

        Button_Four.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "4")
        }

        Button_Five.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "5")
        }

        Button_Six.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "6")
        }

        Button_Seven.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "7")
        }

        Button_Eight.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "8")
        }

        Button_Nine.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "9")
        }

        Button_Zero.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "0")
        }

        // TODO: Button Symbol

        Button_Decimal.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + ",")
        }

        Button_Add.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "+")
        }

        Button_Divide.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "/")
        }

        Button_Substract.setOnClickListener {
            val string : String = Textview_Result.text.toString()
            if(!string.get(index = string.length - 1).equals("-")){
                Textview_Result.text = (Textview_Result.toString() + "-")
            }
        }

        Button_Multiply.setOnClickListener {
            val string : String = Textview_Result.text.toString()
            if(!string.get(index = string.length - 1).equals("*")){
                Textview_Result.text = (Textview_Result.text.toString() + "*")
            }
        }

        //TODO : Scientific Calculator Symbol
        Button_OpenParentheses.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "(")
        }

        Button_CloseParentheses.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + ")")
        }

        Button_XPower2.setOnClickListener {
            // TODO : Please repair
            if(Textview_Result.text.toString().isEmpty()){
                // If Textview_Result is empty, show text "Kesalahan"
                Textview_Result.text = (Textview_Result.text.toString() + "^" + "(2)")
                IndicatorError_Result.visibility = View.VISIBLE
                IndicatorError_Result.setText("Kesalahan")
            } else {
                // for tester if correct you can left, if have problem please correct it after
                val string : String = Textview_Result.text.toString()
                val Double_value : Double = string.toDouble()

                // call function power in here!!! and set result in here
                val XPower2_result = Math_power.XPower2(Double_value)

                // you can use TextView_Result.setText()
                Textview_Result.text = XPower2_result.toString()

                // show formula in second Textview
                SecondTextview_Result.text = "$Double_value^(2)"
            }
        }

        Button_XPower3.setOnClickListener {
            // TODO : Please repair
            Textview_Result.text = (Textview_Result.text.toString() + "^" + "(3)")
        }

        Button_XFactorial.setOnClickListener {
            // TODO : Please repair
            Textview_Result.text = (Textview_Result.text.toString() + "!")
        }

        Button_root.setOnClickListener {
            // TODO : Please repair
            Textview_Result.text = (Textview_Result.text.toString() + "\u221A")
        }
    }
}