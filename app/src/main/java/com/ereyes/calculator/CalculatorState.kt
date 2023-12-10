package com.ereyes.calculator

/****
 * Project: Calculator
 * From: com.ereyes.calculator
 * Created by Edgar Reyes Gonzalez on 12/10/2023 at 12:42 PM
 * All rights reserved 2023.
 ****/

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)