package com.applecompose.theprospectorsjournal.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GoldPrices() {
	Column(
		modifier = Modifier
			.fillMaxWidth(),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Top
	)

	{
		TopAppBar(modifier = Modifier.fillMaxWidth()) {
			Text(
				text = "Top App Bar",
				fontSize = 16.sp
			)

		}
		Text(
			text = "Gold Prices",
			fontSize = 24.sp,
		)
		Spacer(modifier = Modifier.height(16.dp))
		Divider(thickness = 2.dp, color = MaterialTheme.colors.primaryVariant)
		Button(
			onClick = { }) {
			Text(text = "Save")

		}


	}
}