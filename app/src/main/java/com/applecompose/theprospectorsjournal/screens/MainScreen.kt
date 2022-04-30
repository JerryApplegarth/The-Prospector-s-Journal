package com.applecompose.theprospectorsjournal.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.applecompose.theprospectorsjournal.R
import com.applecompose.theprospectorsjournal.conposables.ImageCard

@Composable
fun MainScreen() {
	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(6.dp),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Top
	) {
		val painter = painterResource(id = R.drawable.frances)
		val description = "Working a mining claim"
		val title = "Working the 4 Apple Claim in Southern Oregon"

		ImageCard(painter = , contentDescription = , title = )

	}

}