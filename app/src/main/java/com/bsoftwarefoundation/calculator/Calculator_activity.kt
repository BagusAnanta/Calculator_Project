package com.bsoftwarefoundation.calculator

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton
import com.bsoftwarefoundation.calculator.Componentcalculator.*
import com.bsoftwarefoundation.calculator.Mathformula.*
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometry
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometryHyperbolic
import com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula.MathTrigonometryInverse
import com.bsoftwarefoundation.calculator.Mathoperation.Evaluate
import com.bsoftwarefoundation.calculator.Mathoperation.Operation

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
    var Operation = Operation()

    // TODO: Initiated Evaluate/Result Component Class
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
    private lateinit var Button_XPowerX: Button
    private lateinit var Button_XFactorial: Button
    private lateinit var Button_root: Button
    private lateinit var Button_PowerY_UnderRootY: Button
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
            Button_XPowerX = findViewById(R.id.Xpowerx)
            Button_XFactorial = findViewById(R.id.Factorial)
            Button_root = findViewById(R.id.Root)
            Button_PowerY_UnderRootY = findViewById(R.id.Yunderrooty)
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
            // check this if oke change more
            Textview_Result.text = (Textview_Result.text.toString().plus("1"))
        }

        Button_Two.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("2"))
        }

        Button_Three.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("3"))
        }

        Button_Four.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("4"))
        }

        Button_Five.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("5"))
        }

        Button_Six.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("6"))
        }

        Button_Seven.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("7"))
        }

        Button_Eight.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("8"))
        }

        Button_Nine.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("9"))
        }

        Button_Zero.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("0"))
        }

        // TODO: Button Symbol
        Button_Decimal.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("."))
        }

        Button_Add.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("+"))
        }

        Button_Divide.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("/"))
        }

        Button_Substract.setOnClickListener {
            Textview_Result.text = (Textview_Result.text.toString().plus("-"))
        }

        Button_Multiply.setOnClickListener {
            val string: String = Textview_Result.text.toString()
            try{
            if (!string.get(index = string.length - 1).equals("*")) {
                Textview_Result.text = (Textview_Result.text.toString().plus("*"))
               }
            } catch (E : StringIndexOutOfBoundsException){
                Textview_Result.setText("")
            }
        }

        Button_Equals.setOnClickListener {
            /*
            * TODO:
            *  Kesel aku cok mati terus ni laptop dah, jadi mau ngoding males gua :(, jadi gini
            *  cara ngitung untuk scientific equation (sin() + sin()) atau etc kita ubah dulu mereka kedalam nilai baru dihitung
            *  Ex: sin(0) + sin(30) nanti kita ubah dulu ke nilainya jadi sin(0) = 0 dan sin(30) = 0,5 jadi nanti 0 + 0,5 = 0,5
            *  sin(0) + sin(30) ->  0 + 0,5 -> = 0,5
            */

            /*
            * TODO: Yang perlu diperbaiki adalah letak nilai yang harus diambil yang akan dijadikan hasilnya
            *  */

            // TODO: Convert into string and call Evaluate class in here
            val value : String = Textview_Result.text.toString()
           /* // val result : Double = Evaluate_result.evaluate(value) as Double
            // TODO: Convert into string
            val convert_result = result.toString()*/
            val result = Operation.operation(value)
            // TODO: Show in at Textview_result and Second_result
            Textview_Result.setText(result)
            SecondTextview_Result.text = value
        }

        //TODO: Component Calculator AC/Del/+/-
        Button_DEL.setOnClickListener {
            // if SecondTextview isNotEmpty, we mush delete it!!! and if IndicatorErrorResult isNotEmpty we must delete to
            if (SecondTextview_Result.text.toString().isNotEmpty() || IndicatorError_Result.text.isNotEmpty()) {
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

        Button_Percent.setOnClickListener {
            val result = funvalue()/100
            setcontentresult("%",result.toString(),"${funvalue()}%")
        }

        // TODO:Landscape/scientific calculator configuration
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //TODO: Memory calculator (Check This!)
            Button_MC.setOnClickListener {
                // if get memory value = 0.0/ no have value
                if (Component_memory.GetMemory() == 0.0 || Component_memory.PrefMemory == 0.0) {
                    // Indicator warning show
                    IndicatorError_Result.visibility = View.VISIBLE
                    IndicatorError_Result.setText(R.string.empty_sign)
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
                   IndicatorError_Result.setText(R.string.empty_sign)
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
                   IndicatorError_Result.setText(R.string.empty_sign)
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
                    IndicatorError_Result.setText(R.string.empty_sign)
                } else {
                    // if prefmemory is exist/ != 0.0 we get memory data
                    Textview_Result.text = Component_memory.PrefMemory.toString()
                }
            }

            //TODO : Scientific Calculator Symbol
            Button_OpenParentheses.setOnClickListener {
                Textview_Result.text = (Textview_Result.text.toString().plus("("))
            }

            Button_CloseParentheses.setOnClickListener {
                Textview_Result.text = (Textview_Result.text.toString().plus(")"))
            }

            Button_XPower2.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "^(2)")
                val XPower2_result = Math_power.XPower2(funvalue()).toString()
                val secondtextformula = "${funvalue()}^(2)"
                setcontentresult(formulatext,XPower2_result,secondtextformula)
            }
            Button_XPower3.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "^(3)")
                val XPower3_result = Math_power.XPower3(funvalue()).toString()
                val secondtextformula = "${funvalue()}^(3)"
                setcontentresult(formulatext,XPower3_result,secondtextformula)
            }

            Button_XPowerX.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "X^(x)")
                val Xpowerx = Math_power.XPowerx(funvalue()).toString()
                val secondtextformula = "${funvalue()}^(${funvalue()})"
                setcontentresult(formulatext,Xpowerx,secondtextformula)
            }

            Button_XFactorial.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "X!")
                val Factorial = Math_factorial.Factorial(funvalue().toInt()).toString()
                val secondtextformula = "${funvalue()}!"
                setcontentresult(formulatext,Factorial,secondtextformula)
            }

            Button_root.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "\u221A" + "X")
                val Squareroot = Math_root.SquareRoot(funvalue()).toString()
                val secondtextformula = "√${funvalue()}"
                setcontentresult(formulatext,Squareroot,secondtextformula)
            }

            Button_PowerY_UnderRootY.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "Y√y")
                val PowerYunderrooty = Math_root.Yunderrooty(funvalue()).toString()
                val secondtextformula = "^${funvalue()}√${funvalue()}"
                setcontentresult(formulatext,PowerYunderrooty,secondtextformula)
            }

            Button_1DivideX.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "^(-1)")
                val Onedividex = Math_power.Dividebyone(funvalue()).toString()
                val secondtextformula = "${funvalue()}^(-1)"
                setcontentresult(formulatext,Onedividex,secondtextformula)
            }

            Button_e.setOnClickListener {
                setcontentresult("e",Math_eular.Euler(),"e")
            }

            Button_ePowerX.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "e^()")
                val Eular_powerx = Math_eular.EulerPowerX(funvalue()).toString()
                val secondtextformula = "e^(${funvalue()})"
                setcontentresult(formulatext,Eular_powerx,secondtextformula)
            }

            Button_In.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "In()")
                val In = Math_logaritm.ln(funvalue()).toString()
                val secondtextformula = "In(${funvalue()})"
                setcontentresult(formulatext,In,secondtextformula)
            }

            Button_log.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "log()")
                val Logaritm = Math_logaritm.Logaritm(funvalue()).toString()
                val secondtextformula = "log(${funvalue()})"
                setcontentresult(formulatext,Logaritm,secondtextformula)
            }

            Button_Absolute.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "|X|")
                val Absolute = Math_absolute.Absolute(funvalue()).toString()
                val secondtextformula = "| ${funvalue()} |"
                setcontentresult(formulatext,Absolute,secondtextformula)
            }

            Button_Radian.setOnClickListener {
                // Radiant component
                DegRad_toggle = false
                Degradindicator_result.setText(R.string.radian_sym)
            }

            Button_Inverse.setOnCheckedChangeListener { compoundButton, isChecked ->
                Inverse_toggle = if (isChecked) {
                    Button_Sin.setText(R.string.invsin_sym)
                    Button_Cos.setText(R.string.invcos_sym)
                    Button_Tan.setText(R.string.invtan_sym)
                    // Inverse toggle equals true because in parameters "isInverse" true value
                    true
                } else {
                    Button_Sin.setText(R.string.sin_sym)
                    Button_Cos.setText(R.string.cos_sym)
                    Button_Tan.setText(R.string.tan_sym)
                    // Non inverse toggle equals false (if user 2x press button) and back to normal trigonometry operation
                    false
                }
            }

            // for sin,cos,tan Degress/Radiant function
            // TODO: Please repair this because secondtextresult show in Kotlin.Unit on textview/secondtextresult
            Button_Sin.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "sin()")
                val Sinusoperation = trigonometryoperationchecker(Inverse_toggle, funvalue(), isSin = true, checkDegRad = DegRad_toggle).toString()
                val secondtextformula = if(Inverse_toggle) "sin^-1(${funvalue()})" else "sin(${funvalue()})"
                setcontentresult(formulatext,Sinusoperation,secondtextformula)
            }

            Button_Cos.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "cos()")
                val cosinusoperation = trigonometryoperationchecker(Inverse_toggle, funvalue(), isCos = true, checkDegRad = DegRad_toggle).toString()
                val secondtextformula = if(Inverse_toggle) "cos^-1(${funvalue()})" else "cos(${funvalue()})"
                setcontentresult(formulatext,cosinusoperation,secondtextformula)
            }

            Button_Tan.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "tan()")
                val tangenoperation = trigonometryoperationchecker(Inverse_toggle, funvalue(), isTan = true, checkDegRad = DegRad_toggle).toString()
                val secondtextformula = if(Inverse_toggle) "tan^-1(${funvalue()})" else "tan(${funvalue()})"
                setcontentresult(formulatext,tangenoperation,secondtextformula)
            }

            Button_10PowerX.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "^(10)")
                val Tenpowerx = Math_power.TenPowerx(funvalue()).toString()
                val secondtextformula = "${funvalue()}^(10)"
                setcontentresult(formulatext,Tenpowerx,secondtextformula)
            }

            Button_Degress.setOnClickListener {
                DegRad_toggle = true
                Degradindicator_result.setText(R.string.degress_sym)
            }

            Button_Sinh.setOnClickListener {
                // TODO: If use plus() function same like concatenation at kotlin
                val formulatext = (Textview_Result.text.toString().plus("sinh()"))
                val Sinh = Math_trigonometryhyper.SinusHyperbolic(funvalue()).toString()
                val secondtextformula = "sinh(${funvalue()})"
                setcontentresult(formulatext,Sinh,secondtextformula)
            }

            Button_Cosh.setOnClickListener {
                // TODO: test it now if work, change now ( after evaluation
                val formulatext = ("cosh(" + Textview_Result.text.toString())
                val Cosh = Math_trigonometryhyper.CosinusHyperbolic(funvalue()).toString()
                val secondtextformula = "cosh(${funvalue()})"
                setcontentresult(formulatext,Cosh,secondtextformula)
            }

            Button_Tanh.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "tanh()")
                val Tanh = Math_trigonometryhyper.TangenHyperbolic(funvalue()).toString()
                val secondtextformula = "tanh(${funvalue()})"
                setcontentresult(formulatext,Tanh,secondtextformula)
            }

            Button_Derivative.setOnClickListener {
                val formulatext = (Textview_Result.text.toString() + "X^(n-1)")
                val resultcalculation = "${funvalue()} X^(${Math_derivative.Derivative(funvalue())})"
                val secondtextformula = "${funvalue()} X^(${funvalue()}-1)"
                setcontentresult(formulatext,resultcalculation,secondtextformula)
            }

            Button_Pi.setOnClickListener {
                setcontentresult("π",Math_pi.Pi(),"π")
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
                IndicatorError_Result.setText(R.string.error_sign)
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
                IndicatorError_Result.setText(R.string.error_sign)
            }
        }
        return result
    }

    private fun setcontentresult(ErrtextviewResult : String,LastOperationShow : String,FormulaShow : String){
        if (Textview_Result.text.toString().isEmpty()) {
            Textview_Result.text = ErrtextviewResult
            IndicatorError_Result.visibility = View.VISIBLE
            IndicatorError_Result.setText(R.string.error_sign)
        } else if (Textview_Result.text.toString().isNotEmpty()) {
            IndicatorError_Result.visibility = View.INVISIBLE
            Textview_Result.text = LastOperationShow
            SecondTextview_Result.text = FormulaShow
        }
    }

    private fun funvalue() : Double{
       var value = 0.0
       try{
           value = Textview_Result.text.toString().toDouble()
           // check value if have Exception and catch this exception
       } catch (E : Exception){
           // set default value == 0 on textview_result
          Textview_Result.text = "0"
       }
        return value
    }

}
