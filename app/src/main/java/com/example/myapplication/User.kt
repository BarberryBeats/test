package com.example.myapplication

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class User(
    val username: String,
    val password: String
)