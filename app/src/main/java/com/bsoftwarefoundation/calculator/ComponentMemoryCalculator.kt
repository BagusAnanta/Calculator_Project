package com.bsoftwarefoundation.calculator

class ComponentMemoryCalculator {
    // Memory in calculator = MC : Clear Memory, M + : Add to Memory, M - : Substract from Memory, MR : Recall Memory

    // Default value
    var Memory : Double? = null

    fun GetMemory(X : Double) : Double{
        // Here, must have get value from result
        Memory = X
        return Memory as Double
    }

    fun AddMemory(X : Double) : Double?{
        // Add memory formula : Memory + X (X : New user input Value)
        val result = Memory?.plus(X)
        return result
    }

    fun SubstractMemory(X : Double) : Double?{
        // Substract memory formula : Memory - X (X : New user input Value)
        val result = Memory?.minus(X)
        return result
    }

    fun RecallMemory() : Double?{
        // call back value/number from memory
        return Memory
    }

    // Here, you Clear Memory and return to null
    fun ClearMemory(){Memory = null}




}