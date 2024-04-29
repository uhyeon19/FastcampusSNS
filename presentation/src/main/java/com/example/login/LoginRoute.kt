package com.example.login

sealed class LoginRoute(val name: String) {
    object WelcomeScreen: LoginRoute("WelcomeScreen")
    object LoginScreen: LoginRoute("LoginScreen")
    object SignUpScreen: LoginRoute("SignUpScreen")
}