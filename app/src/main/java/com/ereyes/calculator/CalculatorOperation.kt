package com.ereyes.calculator

/****
 * Project: Calculator
 * From: com.ereyes.calculator
 * Created by Edgar Reyes Gonzalez on 12/10/2023 at 12:35 PM
 * All rights reserved 2023.
 ****/
sealed class CalculatorOperation(val symbol: String){
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
}
