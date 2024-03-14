package com.example.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layouts.ui.theme.LayoutsTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()

                ) {
                    LayoutScreen()
                    }
                }
            }
        }
    }

@Composable

fun LayoutScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = {}) {
            Text(text = "Botão 1")
        }
        Button(onClick = {}) {
            Text(text = "Botão 2")
        }
        Button(onClick = {}) {
            Text(text = "Botão 3")
        }

        Column() {
            Text(text = "FIAP")
            Text(text = "ANDROID")
            Text(text = "ANDROID STUDIO")
            Row() {
                Button(onClick = {}) {
                    Text(text = "Botão 4")
                }
                Button(onClick = {}) {
                    Text(text = "Botão 5")
                }
                Button(onClick = {}) {
                    Text(text = "Botão 6")
                }
                Column() {
                    Button(onClick = {}) {
                        Text(text = "Botão 7")
                    }
                    Button(onClick = {}) {
                        Text(text = "Botão 8")
                    }
                    Button(onClick = {}) {
                        Text(text = "Botão 9")
                    }
            }
        }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth()
                ){
                Button(onClick = {}) {
                    Text(text = "Botão 7")
                }
                Button(onClick = {}) {
                    Text(text = "Botão 8")
                }
                Button(onClick = {}) {
                    Text(text = "Botão 9")
                }
            }

        }
    }
}



@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview(){
    LayoutScreen()
}


