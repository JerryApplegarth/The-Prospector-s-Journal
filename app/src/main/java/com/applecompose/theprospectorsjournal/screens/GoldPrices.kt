package com.applecompose.theprospectorsjournal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.applecompose.theprospectorsjournal.R
import com.applecompose.theprospectorsjournal.components.ImageCard
import com.applecompose.theprospectorsjournal.navigation.Screen

@Composable
fun GoldPrices(navController: NavController) {
	Column(
		modifier = Modifier
			.fillMaxWidth()
			.padding(6.dp),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Top
	) {
		val painter = painterResource(id = R.drawable.nugget)
		val description = "picture of large gold nugget"
		val title = "Large nugget from the 4 Apple Claim in Southern Oregon"

		ImageCard(
			painter = painter,
			contentDescription = description,
			title = title
		)
		Column(
			modifier = Modifier
				.padding(6.dp)
		) {
			Spacer(modifier = Modifier.height(12.dp))
			Divider(thickness = 2.dp, color = Color.Black)
			Spacer(modifier = Modifier.height(12.dp))

			Row(
				modifier = Modifier
					.padding(8.dp)
					.fillMaxWidth(),
				horizontalArrangement = Arrangement.SpaceEvenly,
				verticalAlignment = Alignment.CenterVertically
			) {
				Button(
					onClick = {
						navController.navigate(route = Screen.HomeScreen.route)
					}) {
					Text(text = "Home")

				}
				Spacer(modifier = Modifier.width(16.dp))
				Button(
					onClick = {
						navController.navigate(route = Screen.JournalScreen.route)

					}) {
					Text(
						text = "Journal",
						modifier = Modifier
					)
				}

			}
		}

	}
}

