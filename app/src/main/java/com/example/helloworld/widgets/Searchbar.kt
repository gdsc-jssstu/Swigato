package com.example.helloworld.widgets

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SearchBar() {
    Card(
        modifier = Modifier
            .padding(20.dp)
            .height(50.dp)
            .fillMaxWidth(),
        elevation = 4.dp,
        shape = RoundedCornerShape(20.dp)

    ){
        Column(
            verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Search", style = MaterialTheme.typography.h5)
        }
    }
}