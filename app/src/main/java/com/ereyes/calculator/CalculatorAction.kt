package com.ereyes.calculator

/****
 * Project: Calculator
 * From: com.ereyes.calculator
 * Created by Edgar Reyes Gonzalez on 12/10/2023 at 12:37 PM
 * All rights reserved 2023.
 ****/
sealed class CalculatorAction{
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
