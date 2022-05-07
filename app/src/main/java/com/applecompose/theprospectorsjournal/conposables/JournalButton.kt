package com.applecompose.theprospectorsjournal.conposables

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun JournalButton(
	modifier: Modifier = Modifier,
	text: String,
	onClick: () -> Unit,
	enabled: Boolean = true
) {
	Button(onClick = {
		onClick.invoke()
	},
		shape = RectangleShape,
		enabled = enabled,
		modifier = modifier
		) {
		Text(text = text)



	}

}

@Preview(showBackground = true)
@Composable
fun JournalButtonPreview() {
	JournalButton(
		text = "Save",
		onClick = {}
	)
}