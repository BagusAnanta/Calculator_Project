package com.bsoftwarefoundation.calculator

import android.app.admin.SecurityLog
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import com.bsoftwarefoundation.calculator.Componentcalculator.ComponentDeleteClear
import com.bsoftwarefoundation.calculator.Componentcalculator.ComponentMemoryCalculator
import com.bsoftwarefoundation.calculator.Mathformula.*
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometry
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometryHyperbolic
import org.w3c.dom.Text
import kotlin.properties.Delegates

class Calculator_activity : AppCompatActivity() {

    // TODO: Initiated Degress & Radiant Value
    var DegRad_toggle : Boolean = true

    // TODO: Initiated MathFormula Class
    var Math_power = MathPower()
    var Math_factorial = MathFactorial()
    var Math_root = MathRoot()
    var Math_eular = MathEuler()
    var Math_logaritm = MathLogaritm()
    var Math_absolute = MathAbsolute()
    var Math_trigonometryhyper = MathTrigonometryHyperbolic()
    var Math_trigonometryradiant = MathTrigonometry()
    var Math_trigonometrydegress = MathTrigonometry().MathTrigonometryDegress()
    var Math_pi = MathPi()

    // TODO: Initiated Component Class
    var Component_delete = ComponentDeleteClear()
    var Component_memory = ComponentMemoryCalculator()

    // TODO : Initiated TextView Result
    private lateinit var Textview_Result : TextView
    private lateinit var SecondTextview_Result : TextView
    private lateinit var IndicatorError_Result : TextView
    private lateinit var Degradindicator_result : TextView


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
    private lateinit var Button_Absolute : Button
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
    private lateinit var Button_Derivative : Button
    private lateinit var Button_Pi : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        // set content
        setContentView(R.layout.activity_main)

        // TODO : Declare Button and Textview Calculator

        // Textview Result
        Textview_Result = findViewById(R.id.textViewcalculator)
        SecondTextview_Result = findViewById(R.id.secondtextViewcalculator)
        IndicatorError_Result = findViewById(R.id.indicatorerrorcalculator)


        // Button Symbol
        Button_AC = findViewById(R.id.Clear)
        Button_PlusMinus = findViewById(R.id.Plusminus)
        Button_DEL = findViewById(R.id.Delete)
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

        // use this if a screen orientation Landscape
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            // Scientific Math Calculator Symbol
            // TODO: Null Pointer Exception Problem (Because after screen orientation landscape, findViewById() not detected a id component)
            Degradindicator_result = findViewById(R.id.degradnotif)
            Button_OpenParentheses = findViewById(R.id.Openparentheses)
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
            Button_Absolute = findViewById(R.id.Absolute)
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
            Button_Derivative = findViewById(R.id.Derivative)
            Button_Pi = findViewById(R.id.pi)

        }

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
            Textview_Result.text = (Textview_Result.text.toString() + ".")
        }

        Button_Add.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "+")
        }

        Button_Divide.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString() + "/")
        }

        Button_Substract.setOnClickListener {
            val string: String = Textview_Result.text.toString()
            if (!string.get(index = string.length - 1).equals("-")) {
                Textview_Result.text = (Textview_Result.toString() + "-")
            }
        }

        Button_Multiply.setOnClickListener {
            val string: String = Textview_Result.text.toString()
            if (!string.get(index = string.length - 1).equals("*")) {
                Textview_Result.text = (Textview_Result.text.toString() + "*")
            }
        }

        //TODO: Component Calculator
        Button_DEL.setOnClickListener {
            Component_delete.Delete(Textview_Result)
            // if SecondTextview isNotEmpty, we mush delete it!!!
            SecondTextview_Result.text = ""
        }

        Button_AC.setOnClickListener {
            Component_delete.ClearAll(Textview_Result,SecondTextview_Result)

        }

        // TODO:Landscape/scientific calculator configuration
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //TODO: Memory calculator (Check This!)
            Button_MC.setOnClickListener {
                // if get memory value = 0.0/ no have value
                if(Component_memory.GetMemory() == 0.0 || Component_memory.PrefMemory == 0.0){
                    // Indicator warning show
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Memori kosong")
                } else {
                    // Memory and PrefMemory value must delete or 0 value
                    Component_memory.ClearMemory()
                    Component_memory.ClearPrefMemory()
                }
            }

            // TODO: Repair this and check this!
            Button_MPlus.setOnClickListener {
                val resultconvert = Textview_Result.text.toString().toDouble()
                // if Memory is empty/0.0 we must get memory and replace a result into Prevmemory
                if(Component_memory.GetMemory() == 0.0){
                    // set first value in memory
                    Component_memory.SetMemory(resultconvert)
                } else {
                    // if a GetMemory() have a value or != 0.0 we must add with resultconvert and replace a new value into Prevmemory
                    val addmem = Component_memory.AddMemory(resultconvert)
                    Component_memory.PrefMemory = addmem
                }

            }

            // TODO: Repair this and check this!
            Button_MMinus.setOnClickListener {
                val resultconvert = Textview_Result.text.toString().toDouble()
                // same like M+ but, use SubstractMemory()
                // check before if memory empty/0.0 we must set memory  or if a prefmemory have a value before we use prefmemory
                if(Component_memory.GetMemory() == 0.0){
                    Component_memory.SetMemory(resultconvert)
                } else if(!Component_memory.PrefMemory.equals(0.0)){ // if PrefMemory != 0.0 or have value
                    val substractmem = Component_memory.SubstractMemory(resultconvert)
                    // place value result into Prefmemory
                    Component_memory.PrefMemory = substractmem
                }
            }

            Button_MR.setOnClickListener {
                // show Pref value before
                // if component_memory in PrefMemory is 0.0
                if(Component_memory.PrefMemory == 0.0){
                    // we get PrefMemory value from Memory value and show in Pref memory
                    Component_memory.PrefMemory = Component_memory.GetMemory()
                    Textview_Result.text = Component_memory.PrefMemory.toString()
                } else if(Component_memory.GetMemory() == 0.0) {
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Memori kosong")
                } else {
                    // if prefmemory is exist/ != 0.0 we get memory data
                    Textview_Result.text = Component_memory.PrefMemory.toString()
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

                if (Textview_Result.text.toString().isEmpty()) {
                    // If Textview_Result is empty/ = 0, show text "Kesalahan"
                    Textview_Result.text = (Textview_Result.text.toString() + "^" + "(2)")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()) {
                    // Text kesalahan invisible
                    IndicatorError_Result.visibility = View.INVISIBLE
                    // for tester if correct you can left, if have problem please correct it after
                    val value = Textview_Result.text.toString().toDouble()

                    // call function power in here!!! and set result in here
                    val XPower2_result = Math_power.XPower2(value)

                    // you can use TextView_Result.setText()
                    Textview_Result.text = XPower2_result.toString()

                    // show formula in second Textview
                    SecondTextview_Result.text = "$value^(2)"
                }
            }

            Button_XPower3.setOnClickListener {
                // TODO : Please repair
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "^" + "(3)")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val XPower3_result = Math_power.XPower3(value)
                    Textview_Result.text = XPower3_result.toString()
                    SecondTextview_Result.text = "$value^(3)"
                }

            }

            // Repair later
            Button_XPowery.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "^" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                }
            }

            Button_XFactorial.setOnClickListener {
               val value = Textview_Result.text.toString().toInt()
               val Factorial =  Math_factorial.Factorial(value)
               Textview_Result.text = Factorial.toString()
               SecondTextview_Result.text = "$value!"
            }

            Button_root.setOnClickListener {
                //TODO: NumberFormatException
                val value = Textview_Result.toString().toDouble()
                val Squareroot = Math_root.SquareRoot(value)
                Textview_Result.text = Squareroot.toString()
                SecondTextview_Result.text = "$value\u221A"
            }

            // Repair later
            Button_PowerY_UnderRootX.setOnClickListener {

            }

            Button_1DivideX.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "^" + "(-1)")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Onedividex = Math_power.Dividebyone(value)
                    Textview_Result.text = Onedividex.toString()
                    SecondTextview_Result.text = "$value^(-1)"
                }
            }

            Button_e.setOnClickListener {
                val Eular_equation = Math_eular.Euler()
                Textview_Result.text = Eular_equation
                SecondTextview_Result.text = "e"
            }

            Button_ePowerX.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "e" + "^" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Eular_powerx = Math_eular.EulerPowerX(value)
                    Textview_Result.text = Eular_powerx.toString()
                    SecondTextview_Result.text = "e^($value"
                }
            }

            Button_In.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "In" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val In = Math_logaritm.ln(value)
                    Textview_Result.text = In.toString()
                    SecondTextview_Result.text = "In + ($value"
                }
            }

            Button_Absolute.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "|" + "|")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Absolute = Math_absolute.Absolute(value)
                    Textview_Result.text = Absolute.toString()
                    SecondTextview_Result.text = "| $value |"
                }
            }

            Button_10PowerX.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "^" + "(10")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Tenpowerx = Math_power.TenPowerx(value)
                    Textview_Result.text = Tenpowerx.toString()
                    SecondTextview_Result.text = "$value + ^ + (10) "
                }
            }

            Button_Sinh.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "sinh"+ "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Sinh = Math_trigonometryhyper.SinusHyperbolic(value)
                    Textview_Result.text = Sinh.toString()
                    SecondTextview_Result.text = "sinh($value"
                }
            }

            Button_Cosh.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "cosh"+ "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Cosh = Math_trigonometryhyper.CosinusHyperbolic(value)
                    Textview_Result.text = Cosh.toString()
                    SecondTextview_Result.text = "cosh($value"
                }
            }

            Button_Tanh.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "tanh"+ "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Tanh = Math_trigonometryhyper.CosinusHyperbolic(value)
                    Textview_Result.text = Tanh.toString()
                    SecondTextview_Result.text = "tanh($value"
                }
            }

            Button_Pi.setOnClickListener {
                val Pi_equation = Math_pi.Pi()
                Textview_Result.text = Pi_equation
                SecondTextview_Result.text = "\u03C0"
            }

            Button_Radian.setOnClickListener {
                DegRad_toggle = true
                Degradindicator_result.setText("Rad")
            }

            Button_Degress.setOnClickListener {
                DegRad_toggle = false
                Degradindicator_result.setText("Deg")
            }

            // for sin,cos,tan Degress/Radiant function
            Button_Sin.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "sin"+ "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val result = Textview_Result.text.toString().toDouble()
                    val checkdegrad =  if(DegRad_toggle) Math_trigonometryradiant.SinusRadiant(result) else Math_trigonometrydegress.SinusDegress(result)
                    Textview_Result.text = checkdegrad.toString()
                    SecondTextview_Result.text = "sin($result"

                }
            }

            Button_Cos.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "cos"+ "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val result = Textview_Result.text.toString().toDouble()
                    val checkdegrad =  if(DegRad_toggle) Math_trigonometryradiant.CosinusRadiant(result) else Math_trigonometrydegress.CosinusDegress(result)
                    Textview_Result.text = checkdegrad.toString()
                    SecondTextview_Result.text = "cos($result"
                }
            }

            Button_Tan.setOnClickListener {
                if(Textview_Result.text.toString().isEmpty()){
                    Textview_Result.text = (Textview_Result.text.toString() + "tan"+ "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if(!Textview_Result.text.toString().isEmpty()){
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val result = Textview_Result.text.toString().toDouble()
                    val checkdegrad =  if(DegRad_toggle) Math_trigonometryradiant.TangenRadiant(result) else Math_trigonometrydegress.TangenDegress(result)
                    Textview_Result.text = checkdegrad.toString()
                    SecondTextview_Result.text = "tan($result"
                }
            }

        }
    }
}