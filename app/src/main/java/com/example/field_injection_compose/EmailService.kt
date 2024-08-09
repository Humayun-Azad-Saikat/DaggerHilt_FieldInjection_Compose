package com.example.field_injection_compose

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){

    fun sentEmail (to:String,from:String,body:String){
        Log.d("tagdaggerhilt", "email sent")
    }
}