package com.example.tarjetadecumpleanos_kenerfonseca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetadecumpleanos_kenerfonseca.ui.theme.TarjetaDeCumpleanosKenerFonsecaTheme
import androidx.compose.ui.Alignment



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDeCumpleanosKenerFonsecaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting( message ="Feliz Cumpleaños Kener!",  from ="atte: Jose")
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String, from: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier.padding(16.dp).align(alignment = Alignment.End),
            textAlign = TextAlign.End
        )
    }
}


@Preview(showBackground = true,
    showSystemUi = true,
    )
@Composable
fun GreetingPreview() {
    TarjetaDeCumpleanosKenerFonsecaTheme {
        Greeting(message = "Feliz Cumpleaños Kener", from ="Atte: Jose")
    }
}