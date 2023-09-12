package com.example.akillerapp2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.akillerapp2.ui.theme.Akillerapp2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val pageCall = findViewById<Button>(R.id.page)
        pageCall.setOnClickListener {
            Toast.makeText(this, "Page Clicked", Toast.LENGTH_SHORT).show()
        }

        val identifyCall = findViewById<Button>(R.id.identify)
        identifyCall.setOnClickListener {
            Toast.makeText(this, "Identify Clicked", Toast.LENGTH_SHORT).show()
        }

        val trackCall = findViewById<Button>(R.id.track)
        trackCall.setOnClickListener {
            Toast.makeText(this, "Track Clicked", Toast.LENGTH_SHORT).show()
        }
        super.onCreate(savedInstanceState)
        setContent {
            Akillerapp2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Akhil")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) {
        Text(
            text = "Hello my name is $name!",
            modifier = modifier.padding(24.dp)
        )


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Akillerapp2Theme {
        Greeting("Android")
    }
}