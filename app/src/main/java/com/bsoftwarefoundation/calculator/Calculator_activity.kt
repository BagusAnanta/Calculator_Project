package com.bsoftwarefoundation.calculator

import android.app.admin.SecurityLog
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton
import com.bsoftwarefoundation.calculator.Componentcalculator.ComponentDeleteClear
import com.bsoftwarefoundation.calculator.Componentcalculator.ComponentMemoryCalculator
import com.bsoftwarefoundation.calculator.Componentcalculator.ComponentPlusMinus
import com.bsoftwarefoundation.calculator.Mathformula.*
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometry
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometryHyperbolic
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometryInverse
import com.bsoftwarefoundation.calculator.Mathoperation.Evaluate
import org.w3c.dom.Text
import kotlin.properties.Delegates

class Calculator_activity : AppCompatActivity() {

    // TODO: Initiated Degress & Radiant Value
    // Degress Default
    var DegRad_toggle: Boolean = true

    // TODO: Initiated Invert value default
    var Inverse_toggle: Boolean = false

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
    var Math_trigonometryinverseradiant = MathTrigonometryInverse()
    var Math_trigonometryinversedegress = MathTrigonometryInverse().MathTrigonometryInverseDegress()
    var Math_pi = MathPi()
    var Math_derivative = MathDerivative()

    // TODO: Initiated Component Class
    var Component_delete = ComponentDeleteClear()
    var Component_memory = ComponentMemoryCalculator()
    var Component_plusmin = ComponentPlusMinus()

    // TOD: Initiated Evaluate/Result Component Class
    var Evaluate_result = Evaluate()

    // TODO : Initiated TextView Result
    private lateinit var Textview_Result: TextView
    private lateinit var SecondTextview_Result: TextView
    private lateinit var IndicatorError_Result: TextView
    private lateinit var Degradindicator_result: TextView


    // TODO : Initiated Button Operation Symbol
    private lateinit var Button_AC: Button
    private lateinit var Button_DEL: Button
    private lateinit var Button_PlusMinus: Button
    private lateinit var Button_Divide: Button
    private lateinit var Button_Multiply: Button
    private lateinit var Button_Substract: Button
    private lateinit var Button_Add: Button
    private lateinit var Button_Equals: Button
    private lateinit var Button_Percent: Button
    private lateinit var Button_Decimal: Button

    // TODO : Initiated Button Number
    private lateinit var Button_Zero: Button
    private lateinit var Button_One: Button
    private lateinit var Button_Two: Button
    private lateinit var Button_Three: Button
    private lateinit var Button_Four: Button
    private lateinit var Button_Five: Button
    private lateinit var Button_Six: Button
    private lateinit var Button_Seven: Button
    private lateinit var Button_Eight: Button
    private lateinit var Button_Nine: Button

    // TODO : Initiated Button Scientific Calculator Symbol
    private lateinit var Button_OpenParentheses: Button
    private lateinit var Button_CloseParentheses: Button
    private lateinit var Button_MC: Button
    private lateinit var Button_MPlus: Button
    private lateinit var Button_MMinus: Button
    private lateinit var Button_MR: Button
    private lateinit var Button_XPower2: Button
    private lateinit var Button_XPower3: Button
    private lateinit var Button_XPowery: Button
    private lateinit var Button_XFactorial: Button
    private lateinit var Button_root: Button
    private lateinit var Button_PowerY_UnderRootX: Button
    private lateinit var Button_1DivideX: Button
    private lateinit var Button_e: Button
    private lateinit var Button_ePowerX: Button
    private lateinit var Button_In: Button
    private lateinit var Button_log: Button
    private lateinit var Button_Absolute: Button
    private lateinit var Button_Radian: Button
    private lateinit var Button_Sin: Button
    private lateinit var Button_Cos: Button
    private lateinit var Button_Tan: Button
    private lateinit var Button_Inverse: ToggleButton
    private lateinit var Button_10PowerX: Button
    private lateinit var Button_Degress: Button
    private lateinit var Button_Sinh: Button
    private lateinit var Button_Cosh: Button
    private lateinit var Button_Tanh: Button
    private lateinit var Button_Derivative: Button
    private lateinit var Button_Pi: Button


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
            Textview_Result.text = (Textview_Result.text.toString() + "-")
        }

        Button_Multiply.setOnClickListener {
            val string: String = Textview_Result.text.toString()
            try{
            if (!string.get(index = string.length - 1).equals("*")) { // StringIndexOutOfBoundException
                Textview_Result.text = (Textview_Result.text.toString() + "*")
               }
            } catch (E : StringIndexOutOfBoundsException){
                Textview_Result.setText("")
            }
        }

        Button_Equals.setOnClickListener {
            // TODO: Convert into string and call Evaluate class in here
            val value : String = Textview_Result.text.toString()
            val result : Double = Evaluate_result.evaluate(value) as Double
            // TODO: Convert into string
            val convert_result = result.toString()
            // TODO: Show in at Textview_result and Second_result
            Textview_Result.setText(convert_result)
            SecondTextview_Result.text = value
        }

        //TODO: Component Calculator AC/Del/+/-
        Button_DEL.setOnClickListener {
            // if SecondTextview isNotEmpty, we mush delete it!!! and if IndicatorErrorResult isNotEmpty we must delete to
            if (SecondTextview_Result.text.toString()
                    .isNotEmpty() || IndicatorError_Result.text.isNotEmpty()
            ) {
                SecondTextview_Result.setText("0")
                IndicatorError_Result.visibility = View.INVISIBLE
            }
            // component_delete call if Button_del pressed
            Component_delete.Delete(Textview_Result)
        }

        Button_AC.setOnClickListener {
            Component_delete.ClearAll(Textview_Result, SecondTextview_Result)
            IndicatorError_Result.visibility = View.INVISIBLE
        }

        Button_PlusMinus.setOnClickListener {
            // NumberformatException if Textview_Result empty
            try {
                if (Textview_Result.text.isEmpty()) {
                    val defaultnumber = 0.0
                    val defaultplusminus = Component_plusmin.PlusMinusOperation(defaultnumber)
                    Textview_Result.text = defaultplusminus.toString()
                } else {
                    val resultconvert = Textview_Result.text.toString().toDouble()
                    val plusminusconvert = Component_plusmin.PlusMinusOperation(resultconvert)
                    Textview_Result.text = plusminusconvert.toString()
                }
            } catch (Exception: NumberFormatException) {
                Log.e("PlusMinusException", Exception.toString())
            }
        }

        // TODO: Repair This (Add percent text result)
        Button_Percent.setOnClickListener {
            val value = Textview_Result.text.toString().toDouble()
            val result = value/100
            Textview_Result.text = result.toString()
            SecondTextview_Result.text = "$value%"
        }

        // TODO:Landscape/scientific calculator configuration
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //TODO: Memory calculator (Check This!)
            Button_MC.setOnClickListener {
                // if get memory value = 0.0/ no have value
                if (Component_memory.GetMemory() == 0.0 || Component_memory.PrefMemory == 0.0) {
                    // Indicator warning show
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Memori kosong")
                    Textview_Result.text = "0"
                } else {
                    // Memory and PrefMemory value must delete or 0 value
                    Component_memory.ClearMemory()
                    Component_memory.ClearPrefMemory()
                }
            }

            // TODO: Repair this and check this!
            Button_MPlus.setOnClickListener {
               try{
                   // if result convert is empty, set value default 0.0
                   val resultconvert = Textview_Result.text.toString().toDouble()
                   // if Memory is empty/0.0 we must get memory and replace a result into Prevmemory
                   if (Component_memory.GetMemory() == 0.0) {
                       // set first value in memory
                       Component_memory.SetMemory(resultconvert)
                   } else {
                       // if a GetMemory() have a value or != 0.0 we must add with resultconvert and replace a new value into Prevmemory
                       val addmem = Component_memory.AddMemory(resultconvert)
                       Component_memory.PrefMemory = addmem
                       Textview_Result.text = addmem.toString()
                   }
               } catch (E : NumberFormatException){
                   IndicatorError_Result.setText("Nilai kosong")
               }

            }

            // TODO: Repair this and check this!
            Button_MMinus.setOnClickListener {
               try{
                   val resultconvert = Textview_Result.text.toString().toDouble()
                   // same like M+ but, use SubstractMemory()
                   // check before if memory empty/0.0 we must set memory  or if a prefmemory have a value before we use prefmemory
                   if (Component_memory.GetMemory() == 0.0) {
                       Component_memory.SetMemory(resultconvert)
                   } else if(!Component_memory.GetMemory().equals(0.0)) { // if PrefMemory != 0.0 or have value
                       val substractmem = Component_memory.SubstractMemory(resultconvert)
                       // place value result into Prefmemory
                       Component_memory.PrefMemory = substractmem
                       Textview_Result.text = substractmem.toString()
                   }
               } catch (E : NumberFormatException){
                   IndicatorError_Result.setText("Nilai kosong")
               }
            }

            Button_MR.setOnClickListener {
                // show Pref value before
                // if component_memory in PrefMemory is 0.0
                if (Component_memory.PrefMemory == 0.0) {
                    // we get PrefMemory value from Memory value and show in Pref memory
                    Component_memory.PrefMemory = Component_memory.GetMemory()
                    Textview_Result.text = Component_memory.PrefMemory.toString()
                } else if (Component_memory.GetMemory() == 0.0) {
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
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    // Text "kesalahan" invisible
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
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "^" + "(3)")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val XPower3_result = Math_power.XPower3(value)
                    Textview_Result.text = XPower3_result.toString()
                    SecondTextview_Result.text = "$value^(3)"
                }
            }

            // TODO: Repair later
            Button_XPowery.setOnClickListener {
                // TODO: I recommend use edittext because, this operation must have 2 input
                val variable_X = Textview_Result.text.toString().toDouble()
                val power_y = Textview_Result.text.toString().toDouble()
                val Xpowery = Math_power.XPowerY(variable_X, power_y)
                Textview_Result.text = Xpowery.toString()
                SecondTextview_Result.text = "$variable_X^($power_y)"

            }

            Button_XFactorial.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "X" + "!")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else {
                    val value = Textview_Result.text.toString().toInt()
                    val Factorial = Math_factorial.Factorial(value)
                    Textview_Result.text = Factorial.toString()
                    SecondTextview_Result.text = "$value!"
                }
            }

            Button_root.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "\u221A" + "X")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else {
                    val value = Textview_Result.toString().toDouble()
                    val Squareroot = Math_root.SquareRoot(value)
                    Textview_Result.text = Squareroot.toString()
                    SecondTextview_Result.text = "$value\u221A"
                }
            }

            // TODO: Repair later
            Button_PowerY_UnderRootX.setOnClickListener {
                // TODO: I recommend use edittext because, this operation must have 2 input
                val power_y = Textview_Result.text.toString().toDouble()
                val root_X = Textview_Result.text.toString().toDouble()
                val PowerYunderrootX = Math_root.YunderrootX(power_y, root_X)
                Textview_Result.text = PowerYunderrootX.toString()
            }

            Button_1DivideX.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "^" + "(-1)")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
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
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "e" + "^" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Eular_powerx = Math_eular.EulerPowerX(value)
                    Textview_Result.text = Eular_powerx.toString()
                    SecondTextview_Result.text = "e^($value)"
                }
            }

            Button_In.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "In" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val In = Math_logaritm.ln(value)
                    Textview_Result.text = In.toString()
                    SecondTextview_Result.text = "In($value)"
                }
            }

            Button_log.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "log()")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Logaritm = Math_logaritm.Logaritm(value)
                    Textview_Result.text = Logaritm.toString()
                    SecondTextview_Result.text = "log($value)"
                }
            }

            Button_Absolute.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "|X|")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Absolute = Math_absolute.Absolute(value)
                    Textview_Result.text = Absolute.toString()
                    SecondTextview_Result.text = "| $value |"
                }
            }

            Button_Radian.setOnClickListener {
                DegRad_toggle = false
                Degradindicator_result.setText("Rad")
            }

            Button_Inverse.setOnCheckedChangeListener { compoundButton, isChecked ->
                if (isChecked) {
                    Button_Sin.setText(R.string.invsin_sym)
                    Button_Cos.setText(R.string.invcos_sym)
                    Button_Tan.setText(R.string.invtan_sym)
                    // Inverse toggle equals true because in parameters "isInverse" true value
                    Inverse_toggle = true
                } else {
                    Button_Sin.setText(R.string.sin_sym)
                    Button_Cos.setText(R.string.cos_sym)
                    Button_Tan.setText(R.string.tan_sym)
                    // Non inverse toggle equals false (if user 2x press button) and back to normal trigonometry operation
                    Inverse_toggle = false
                }
            }

            // for sin,cos,tan Degress/Radiant function
            Button_Sin.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "sin" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (Textview_Result.text.toString().isNotEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val result = Textview_Result.text.toString().toDouble()
                    val sinusoperation = trigonometryoperationchecker(
                        Inverse_toggle,
                        result,
                        isSin = true,
                        checkDegRad = DegRad_toggle
                    )
                    Textview_Result.text = sinusoperation.toString()
                    SecondTextview_Result.text = "sin($result)"

                }
            }

            Button_Cos.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "cos" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (Textview_Result.text.toString().isNotEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val result = Textview_Result.text.toString().toDouble()
                    val cosinusoperation = trigonometryoperationchecker(
                        Inverse_toggle,
                        result,
                        isCos = true,
                        checkDegRad = DegRad_toggle
                    )
                    Textview_Result.text = cosinusoperation.toString()
                    SecondTextview_Result.text = "cos($result)"
                }
            }

            Button_Tan.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "tan" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (Textview_Result.text.toString().isNotEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val result = Textview_Result.text.toString().toDouble()
                    val tangenoperation = trigonometryoperationchecker(
                        Inverse_toggle,
                        result,
                        isTan = true,
                        checkDegRad = DegRad_toggle
                    )
                    Textview_Result.text = tangenoperation.toString()
                    SecondTextview_Result.text = "tan($result)"
                }
            }

            Button_10PowerX.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "^" + "(10")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Tenpowerx = Math_power.TenPowerx(value)
                    Textview_Result.text = Tenpowerx.toString()
                    SecondTextview_Result.text = "$value^(10)"
                }
            }

            Button_Degress.setOnClickListener {
                DegRad_toggle = true
                Degradindicator_result.setText("Deg")
            }

            Button_Sinh.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "sinh" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Sinh = Math_trigonometryhyper.SinusHyperbolic(value)
                    Textview_Result.text = Sinh.toString()
                    SecondTextview_Result.text = "sinh($value)"
                }
            }

            Button_Cosh.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "cosh" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Cosh = Math_trigonometryhyper.CosinusHyperbolic(value)
                    Textview_Result.text = Cosh.toString()
                    SecondTextview_Result.text = "cosh($value)"
                }
            }

            Button_Tanh.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "tanh" + "(")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Tanh = Math_trigonometryhyper.CosinusHyperbolic(value)
                    Textview_Result.text = Tanh.toString()
                    SecondTextview_Result.text = "tanh($value)"
                }
            }

            Button_Derivative.setOnClickListener {
                if (Textview_Result.text.toString().isEmpty()) {
                    Textview_Result.text = (Textview_Result.text.toString() + "X^(n-1)")
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText("Kesalahan")
                } else if (!Textview_Result.text.toString().isEmpty()) {
                    IndicatorError_Result.visibility = View.INVISIBLE
                    val value = Textview_Result.text.toString().toDouble()
                    val Yderivative = Math_derivative.Derivative(value)
                    Textview_Result.text = "$value X^($Yderivative)"
                    SecondTextview_Result.text = "$value X^($Yderivative-1)"
                }
            }

            Button_Pi.setOnClickListener {
                val Pi_equation = Math_pi.Pi()
                Textview_Result.text = Pi_equation
                SecondTextview_Result.text = "\u03C0"
            }
        }
    }

    private fun trigonometryoperationchecker(
        isInverse: Boolean,
        value: Double = 0.0,
        isSin: Boolean = false,
        isCos: Boolean = false,
        isTan: Boolean = false,
        checkDegRad: Boolean = false
    ): Double {
        // default value result
        var result = 0.0

        if (isInverse) {
            // change to Inverse Trigonometry function
            if (isSin) {
                val SinInverse = if (checkDegRad) Math_trigonometryinversedegress.SinusInverseDegress(value) else Math_trigonometryinverseradiant.SinusInverseRadiant(value)
                    result = SinInverse
            } else if (isCos) {
                val CosInverse = if (checkDegRad) Math_trigonometryinversedegress.CosinusInverseDegress(value) else Math_trigonometryinverseradiant.CosinusInverseRadiant(value)
                    result = CosInverse
            } else if (isTan) {
                val TanInverse = if (checkDegRad) Math_trigonometryinversedegress.TangenInverseDegress(value) else Math_trigonometryinverseradiant.TangeInverseRadiant(value)
                    result = TanInverse
            } else {
                IndicatorError_Result.setText("Kesalahan")
            }

        } else {
            // here, you must change to normal sin/cos/tan
            if (isSin) {
                val Sinus = if (checkDegRad) Math_trigonometrydegress.SinusDegress(value) else Math_trigonometryradiant.SinusRadiant(value)
                    result = Sinus
            } else if (isCos) {
                val Cosinus = if (checkDegRad) Math_trigonometrydegress.CosinusDegress(value) else Math_trigonometryradiant.CosinusRadiant(value)
                    result = Cosinus
            } else if (isTan) {
                val Tangent = if (checkDegRad) Math_trigonometrydegress.TangenDegress(value) else Math_trigonometryradiant.TangenRadiant(value)
                    result = Tangent
            } else {
                IndicatorError_Result.setText("Kesalahan")
            }
        }
        return result
    }

    fun showresult(TextviewettextSoal : TextView,Mathresult : Double,Secondtextview : TextView){
        // Test this before you implement this function
        if (Textview_Result.text.toString().isEmpty()) {
            Textview_Result.text = TextviewettextSoal.toString()
            IndicatorError_Result.visibility = View.VISIBLE
            IndicatorError_Result.setText("Kesalahan")
        } else if (Textview_Result.text.toString().isNotEmpty()) {
            IndicatorError_Result.visibility = View.INVISIBLE
            Textview_Result.text = Mathresult.toString()
            SecondTextview_Result.text = Secondtextview.toString()
        }
    }
}