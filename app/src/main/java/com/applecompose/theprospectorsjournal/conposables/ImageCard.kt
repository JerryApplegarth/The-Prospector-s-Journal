package com.applecompose.theprospectorsjournal.conposables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageCard(
	painter: Painter,
	contentDescription: String,
	title: String,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = Modifier.fillMaxWidth(),
		verticalArrangement = Arrangement.Top,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Card(
			modifier = modifier
				.fillMaxWidth()
				.padding(start = 16.dp, end = 16.dp),
			shape = RoundedCornerShape(36.dp),
			elevation = 6.dp,

			) {
			Box(
				modifier = Modifier
					.height(250.dp)



			) {
				Image(
					modifier = Modifier
						.fillMaxWidth(),
					painter = painter,
					contentDescription = contentDescription,
					contentScale = ContentScale.Crop
				)
				Box(
					modifier = Modifier
						.fillMaxSize()
						.background(
							Brush.verticalGradient(
								colors = listOf(
									Color.Transparent,
									Color.Black
								),
								startY = 300f
							)
						)
				)
				Box(
					modifier = Modifier
						.fillMaxSize()
						.padding(24.dp),
					contentAlignment = Alignment.BottomStart
				) {
					Text(
						text = title,
						color = Color.White,
						fontSize = 16.sp
					)


				}

			}

		}

	}
}


