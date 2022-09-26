package com.example.helloworld.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun FoodTile(modifier: Modifier, imageId: Int)
{
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(10.dp)
    ) {
        Image(painter = painterResource(id = imageId), contentDescription = "Pictures", contentScale = ContentScale.Crop)
    }
}