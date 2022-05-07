package com.applecompose.theprospectorsjournal.conposables

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.applecompose.theprospectorsjournal.R
import com.applecompose.theprospectorsjournal.ui.theme.fontColor

@Composable
fun JournalTopTitle() {
	Column(
		modifier = Modifier
			.fillMaxWidth()
			.padding(10.dp),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Top
	) {
		Spacer(modifier = Modifier.height(12.dp))
		Text(
			text = stringResource(R.string.prospectors_journal),
			fontSize = 24.sp,
			fontFamily = FontFamily.Monospace,
			fontWeight = FontWeight.Bold,
			style = TextStyle(color = MaterialTheme.colors.fontColor)
			)
		Text(
			text = stringResource(R.string.great_note_pad),
			fontSize = 16.sp
			)
		
	}

}

@Preview(showBackground = true)
@Composable
fun JournalTopTitlePreview() {
	JournalTopTitle()
}