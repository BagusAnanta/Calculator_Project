package com.bsoftwarefoundation.calculator.Componentcalculator

class ComponentMemoryCalculator {
    // Memory in calculator = MC : Clear Memory, M + : Add to Memory, M - : Substract from Memory, MR : Recall Memory

    // Default value Memory
    var Memory : Double = 0.0

    // Pref value Memory
    var PrefMemory : Double = 0.0
        get() = field
        set(X) {
            field = X
        }

    fun SetMemory(X : Double){
        // Here, must have get value from X/result
        Memory = X
    }

    fun GetMemory() : Double{
        return Memory
    }

    fun AddMemory(X : Double) : Double{
        // Add memory formula : Memory + X (X : New user input Value)
        val result = Memory.plus(X)
        return result
    }

    fun SubstractMemory(X : Double) : Double{
        // Substract memory formula : Memory - X (X : New user input Value)
        val result = PrefMemory.minus(X)
        return result
    }

    fun RecallMemory() : Double{
        // call back value/number from memory
        return Memory
    }

    // Here, you Clear Memory and return to null
    fun ClearMemory(){Memory = 0.0}
    fun ClearPrefMemory(){PrefMemory = 0.0}




}