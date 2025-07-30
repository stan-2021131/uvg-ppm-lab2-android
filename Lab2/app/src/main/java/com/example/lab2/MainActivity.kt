package com.example.lab2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab2.ui.theme.Lab2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab2Theme {
                var count: Int = 0
                val context = LocalContext.current
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Programa de prueba",
                            modifier =Modifier.padding(top = 50.dp),
                            fontSize = 30.sp
                        )
                        Card(
                            modifier = Modifier
                                .padding(top = 100.dp)
                                .padding(horizontal = 16.dp)
                                .fillMaxWidth(),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 20.dp
                            )
                        ){
                            Column(
                                modifier = Modifier
                                    .padding(vertical = 20.dp, horizontal = 25.dp)
                            ) {
                                Text(text = "Prueba el botón")
                                Button(
                                    onClick = {
                                        count++
                                        Toast.makeText(context, "Hola Mundo $count", Toast.LENGTH_LONG).show()
                                    }
                                ) { Text(text="Presioname")}
                            }
                        }
                    }
                }
            }
        }
    }
}