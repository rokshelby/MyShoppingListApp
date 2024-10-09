package com.example.myshoppinglistapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myshoppinglistapp.ui.theme.MyShoppingListAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyShoppingListAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    val numbers = listOf(1,2,3)
//                    val doubled = numbers.map{it *3}
//                    for (i in 0..doubled.size-1){
//                        Log.i("mapExample",doubled.get(i).toString())
//                    }
//                    val blueRoseVase = Vase(color = "Blue", design = "Rose")
//                    val redRoseVase = blueRoseVase.copy(color = "Red")
//                    Log.i("mapExample",redRoseVase.color)
//
//                    val name : String? = "Ella"
//                    name?.let{
//                        Log.i("mapExample", it.toUpperCase())
//                    }
                    ShoppingListApp()

                }
            }
        }
    }
}

