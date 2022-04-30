package com.applecompose.theprospectorsjournal.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.applecompose.theprospectorsjournal.R
import com.applecompose.theprospectorsjournal.conposables.AppLogo
import com.applecompose.theprospectorsjournal.conposables.ImageCard

@Composable
fun MainScreen() {
	Column(
		modifier = Modifier
			.fillMaxWidth()
			.padding(6.dp),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Top
	) {
		val painter = painterResource(id = R.drawable.frances)
		val description = "Working a mining claim"
		val title = "Working the 4 Apple Claim in Southern Oregon"

		ImageCard(
			painter = painter,
			contentDescription = description,
			title = title)
		Column(
			modifier = Modifier
				.padding(6.dp)
		) {
			Spacer(modifier = Modifier.height(12.dp))
			Divider(thickness = 2.dp, color = Color.Black)
			Spacer(modifier = Modifier.height(12.dp))
			Text(
				text = "Prospector's Notes:",
				fontSize = 24.sp,
				fontWeight = FontWeight.Bold,
				fontFamily = FontFamily.Monospace,
				modifier = Modifier
					.clickable {

					}
				)
			Text(text = stringResource(R.string.prospectors_notes))
			Spacer(modifier = Modifier.height(12.dp))
			Text(
				text = "Gold Prices:",
				fontSize = 24.sp,
				fontWeight = FontWeight.Bold,
				fontFamily = FontFamily.Monospace,
				modifier = Modifier
					.clickable {

					}
			)
			Text(text = stringResource(R.string.gold_prices))
			Spacer(modifier = Modifier.height(12.dp))
			Divider(thickness = 2.dp, color = Color.Black)
			Spacer(modifier = Modifier.height(12.dp))
			AppLogo()
		}

	}

}