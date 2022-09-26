package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworld.screens.HomeScreen
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val imagesList = mutableListOf<Int>(
            R.drawable.pizza1,
            R.drawable.pizza2,
            R.drawable.pizza3,
            R.drawable.pizza4,
            R.drawable.pizza5,
            R.drawable.pizza6,
            R.drawable.breakfast2,
            R.drawable.breakfast3,
            R.drawable.breakfast4,
            R.drawable.breakfast5,
            R.drawable.burger1,
            R.drawable.burger2,
            R.drawable.fries,
            R.drawable.sushi,
            R.drawable.taco
        )
        setContent {
            MyApp {
                HomeScreen(imagesList = imagesList)
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit)
{
    content()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val imagesList = mutableListOf<Int>(
        R.drawable.pizza1,
        R.drawable.pizza2,
        R.drawable.pizza3,
        R.drawable.pizza4,
        R.drawable.pizza5,
        R.drawable.pizza6,
        R.drawable.breakfast2,
        R.drawable.breakfast3,
        R.drawable.breakfast4,
        R.drawable.breakfast5,
        R.drawable.burger1,
        R.drawable.burger2,
        R.drawable.fries,
        R.drawable.sushi,
        R.drawable.taco
    )
    HelloWorldTheme {
        HomeScreen(imagesList = imagesList)
    }
}