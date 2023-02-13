package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var database: FirebaseFirestore
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ray", "hellow")
       database = FirebaseFirestore.getInstance()
        database.collection("users")
            .add(User("asxdasd", "asdasd"))
            .addOnSuccessListener { documentReference ->
                Log.d("Ray", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("Ray", "Error adding document", e)
            }
        db = Firebase.database.reference
        db.child("users").child("firstuser").setValue(User("asdsad", "asdasd"))
    }
}