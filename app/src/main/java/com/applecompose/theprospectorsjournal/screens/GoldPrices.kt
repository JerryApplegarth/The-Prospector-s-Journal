package com.applecompose.theprospectorsjournal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.applecompose.theprospectorsjournal.navigation.Screen

@Composable
fun GoldPrices(navController: NavController) {
	Column(
		modifier = Modifier
			.fillMaxWidth(),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Top
	)

	{

		Text(
			text = "Gold Prices",
			fontSize = 24.sp,
		)
		Spacer(modifier = Modifier.height(16.dp))
		Divider(thickness = 2.dp, color = MaterialTheme.colors.primaryVariant)
		Button(
			onClick = {
				navController.navigate(route = Screen.HomeScreen.route)
			}) {
			Text(text = "Home")

		}
	}


}
