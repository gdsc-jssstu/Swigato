package com.example.helloworld.screens

import android.graphics.Paint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.helloworld.widgets.FoodTile
import com.example.helloworld.widgets.SearchBar

@Composable
fun HomeScreen(imagesList: List<Int> = mutableListOf<Int>()){
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                SearchBar()
                TodaysSpecial(imagesList.subList(7,11))
                Text(text = "Categories", style = MaterialTheme.typography.h5, modifier = Modifier.padding(start = 10.dp))

                FoodCategory(imagesList = imagesList.subList(11,15))
                Spacer(
                    modifier = Modifier.height(10.dp)
                )
                Text(text = "Food of the day", style = MaterialTheme.typography.h4, modifier = Modifier.padding(start = 10.dp), fontWeight = FontWeight.Bold)
                Spacer(
                    modifier = Modifier.height(10.dp)
                )
                FoodOfTheDay(imagesList = imagesList.subList(1,5))

                Spacer(
                    modifier = Modifier.height(10.dp)
                )

                Text(text = "Pizzas", style = MaterialTheme.typography.h5, modifier = Modifier.padding(start = 10.dp))
                pizzaRow(imagesList.subList(0,6))

            }
    }
}

@Composable
fun FoodCategory(imagesList: List<Int> = mutableListOf<Int>()){
    LazyRow(){
        items(imagesList){ image ->
            FoodTile(modifier = Modifier
                .size(100.dp)
                .padding(start = 10.dp, top = 15.dp),
                imageId = image )
        }
    }
}

@Composable
private fun FoodOfTheDay(imagesList: List<Int>)
{
    LazyRow{
        items(imagesList){ image ->
            Card(
                modifier = Modifier
                    .height(220.dp)
                    .padding(8.dp),
                elevation = 5.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    FoodTile(
                        imageId = image,
                        modifier = Modifier
                            .padding(10.dp)
                            .width(150.dp)
                            .height(130.dp)
                    )
                    Spacer(modifier = Modifier.height(1.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Pizza 1", style = MaterialTheme.typography.h6)
                        Text("$9.99", style = MaterialTheme.typography.caption)
                    }
                }
            }
        }

    }
}

@Composable
fun pizzaRow(imagesList: List<Int> = mutableListOf<Int>()){
    LazyRow{
        items(imagesList){
            image ->
            FoodTile(modifier = Modifier
                .size(130.dp)
                .padding(10.dp)
                .clip(CircleShape), imageId = image )
        }
    }
}


@Composable
fun TodaysSpecial(imagesList: List<Int> = mutableListOf<Int>()){
    LazyRow{
        items(imagesList){
            image ->
            Box(){
                FoodTile(modifier = Modifier
                    .width(330.dp)
                    .height(220.dp)
                    .padding(start = 8.dp, end = 6.dp)
                    .shadow(10.dp), imageId = image)

                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .align(Alignment.BottomStart)
                        .width(312.dp),
                    shape = RoundedCornerShape(10.dp),
                    backgroundColor = Color.Red.copy(alpha = 0.7f)
                )
                {
                    Text("DEALS UPTO 60% OFF", style = MaterialTheme.typography.h6, color = Color.White, textAlign = TextAlign.Center)
                }
            }
        }
    }
}
