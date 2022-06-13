package com.applecompose.theprospectorsjournal.components


import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.applecompose.theprospectorsjournal.R

@Composable
fun AlertDialogBox() {
	MaterialTheme {
		Column {
			val openDialog = remember { mutableStateOf(false)  }
			val removeDialog = remember { mutableStateOf(true) }

			Button(onClick = {
				openDialog.value = true
			}) {
				Text(stringResource(id = R.string.delete_note))
			}

			if (openDialog.value) {

				AlertDialog(
					onDismissRequest = {

						openDialog.value = false
					},
					title = {
						Text(text = stringResource(id = R.string.alert_box))
					},
					text = {
						Text(stringResource(id = R.string.want_to_delete))
					},
					confirmButton = {
						Button(

							onClick = {
								openDialog.value = false

							}) {
							Text("Delete")
						}
					},
					dismissButton = {
						Button(

							onClick = {
								openDialog.value = false
							}) {
							Text("Dismiss")
						}
					}
				)
			}
		}

	}
}

@Preview(showBackground = true)
@Composable
fun AlertDialogBoxPreview() {
	AlertDialogBox()
}