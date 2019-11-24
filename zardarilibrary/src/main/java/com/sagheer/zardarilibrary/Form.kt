package com.sagheer.zardarilibrary

import android.content.Context
import android.util.Patterns
import android.widget.Toast

fun isEmailValid(email: String): Boolean{
    return Patterns.EMAIL_ADDRESS.matcher(email).matches()
}

fun isPassLength(pass: String, minLength: Int): Boolean {
    return pass.length >= minLength
}

fun isEmailGmail(pass: String): Boolean {
    return pass.toLowerCase().endsWith("gmail.com")
}

fun isPassAlphaNumeric(pass: String): Boolean {
    return pass.contains(Regex("[a-z]")) && pass.contains(Regex("[0-9]"))
}

fun isPassContainingSmallCapitalAndNumber(pass: String): Boolean {
    return pass.contains(Regex("[a-z]")) && pass.contains(Regex("[A-Z]")) && pass.contains(Regex("[0-9]"))
}

fun shortToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun longToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}