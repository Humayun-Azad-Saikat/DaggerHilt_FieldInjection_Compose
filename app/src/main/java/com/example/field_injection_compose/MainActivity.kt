package com.example.field_injection_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.field_injection_compose.ui.theme.Field_Injection_composeTheme
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var userResistaionService: UserResistaionService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Field_Injection_composeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {

                    val component = DaggerConsumerComponent.builder().build()
                    component.injectmain_ac(this)
                    userResistaionService.resisterUser("codedash00@gmail.com","12345")


                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Field_Injection_composeTheme {

    }
}