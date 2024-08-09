package com.example.field_injection_compose

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){

    fun saveUser(user:String,email:String){
        Log.d("tagdaggerhilt", "user saved in DB")
    }
}