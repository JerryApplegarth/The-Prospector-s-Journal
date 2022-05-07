package com.applecompose.theprospectorsjournal.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.applecompose.theprospectorsjournal.conposables.JournalTopTitle
import com.applecompose.theprospectorsjournal.navigation.Screen

@Composable
fun JournalScreen(navController: NavController) {
	Column(
				modifier = Modifier
					.fillMaxSize(),
				horizontalAlignment = Alignment.CenterHorizontally,
				verticalArrangement = Arrangement.Top
				)
			{

				JournalTopTitle()
				Spacer(modifier = Modifier.height(16.dp))
				Divider(thickness = 2.dp, color = MaterialTheme.colors.primaryVariant)

				Text(text = "This area will be used for the detail note section")


				Spacer(modifier = Modifier.height(8.dp))
				Row(
					modifier = Modifier.padding(8.dp)
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
							navController.navigate(route = Screen.GoldPrices.route)

						}) {
						Text(
							text = "Gold Prices",
							modifier = Modifier


							)
				}


				}


			}
}
