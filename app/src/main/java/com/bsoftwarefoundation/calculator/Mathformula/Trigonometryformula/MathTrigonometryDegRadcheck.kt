package com.bsoftwarefoundation.calculator.Mathformula.Trigonometryformula

open class MathTrigonometryDegRadcheck {
    var Math_trigonometryradiant = MathTrigonometry()
    var Math_trigonometrydegress = MathTrigonometry().MathTrigonometryDegress()
    var Math_trigonometryinverseradiant = MathTrigonometryInverse()
    var Math_trigonometryinversedegress = MathTrigonometryInverse().MathTrigonometryInverseDegress()

    open fun trigonometryoperationchecker(
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
                // Indicator Error in here
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
                // indicator Error in here
            }
        }
        return result
    }
}