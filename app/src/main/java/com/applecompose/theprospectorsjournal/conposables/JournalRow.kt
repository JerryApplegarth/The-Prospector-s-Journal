package com.applecompose.theprospectorsjournal.conposables


import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.applecompose.theprospectorsjournal.model.Journal
import com.applecompose.theprospectorsjournal.ui.theme.newBackgroundColor
import com.applecompose.theprospectorsjournal.utils.formatDate

@Composable
fun JournalRow(
	modifier: Modifier = Modifier,
	journal: Journal,
	onNoteClick: (Journal) -> Unit
) {
	Surface(
		modifier
			.padding(4.dp)
			.clip(
				RoundedCornerShape(
					topEnd = 16.dp,
					topStart = 16.dp,
					bottomEnd = 16.dp,
					bottomStart = 16.dp
				)
			)
			.fillMaxWidth(),
		color = MaterialTheme.colors.newBackgroundColor,
		elevation = 6.dp
	) {
		val openDialog = remember { mutableStateOf(false) }
		val scrollState = rememberScrollState()
		Column(
			modifier
				.padding(4.dp)
				.padding(horizontal = 14.dp, vertical = 6.dp)
				.verticalScroll(scrollState)

		) {
			Text(
				text = journal.title,
				style = MaterialTheme.typography.h5
			)

			Text(
				text = journal.location,
				style = MaterialTheme.typography.subtitle1
			)
			Text(
				text = journal.ownership,
				style = MaterialTheme.typography.h5
			)

			Text(
				text = journal.comments,
				style = MaterialTheme.typography.subtitle1
			)

			Text(
				text = formatDate(journal.entryDate.time),
				style = MaterialTheme.typography.caption
			)
			Spacer(modifier = Modifier.height(6.dp))
			Button(onClick = {
				openDialog.value = true
			}) {
				AlertDialog(
					onDismissRequest = {
						// Dismiss the dialog when the user clicks outside the dialog or on the back
						// button. If you want to disable that functionality, simply use an empty
						// onCloseRequest.
						openDialog.value = false
					},
					title = {
						Text(text = "Dialog Title")
					},
					text = {
						Text("Are you sure you want to delete this note? ")
					},
					confirmButton = {
						Button(

							onClick = {
								onNoteClick(journal)

								openDialog.value = false
							}) {
							Text("Confirm")
						}
					},
					dismissButton = {
						Button(

							onClick = {
								openDialog.value = false
							}) {
							Text("Dismiss")
						}
					})

			}

		}

	}

}