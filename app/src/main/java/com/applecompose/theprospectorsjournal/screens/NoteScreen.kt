package com.applecompose.theprospectorsjournal.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.applecompose.theprospectorsjournal.data.Notes

@Composable
fun NoteScreen(navController: NavController) {
	val context = LocalContext.current
	val titleValue = remember { mutableStateOf(TextFieldValue())}
	val coordinatesValue = remember { mutableStateOf(TextFieldValue())}
	val notesValue = remember { mutableStateOf(TextFieldValue())}
	val notes = remember { mutableStateListOf(Notes())}
	val isSaved = remember { mutableStateOf(false)}

	NotesService.getNotes(notes)

	Column(
		modifier = Modifier
			.fillMaxWidth()
			.padding(8.dp)
	) {
		DetailInput(fieldValue = titleValue, label = "Title")
		DetailInput(fieldValue = coordinatesValue, labal = "Coordinates", singleLine = false)
		DetailInput(fieldValue = notesValue, label = "Notes", singleLine = false)
		Spacer(modifier = Modifier.padding(4.dp))
		Button(
			onClick = {
				val notes = Notes(
					title = titleValue.value.text,
					coordinates = coordinatesValue.value.text,
					notes = notesValue.value.text
				)
				db.collection("notes")
					.add(notes)
			}) {


		}

	}


}


fun <T> SnapshotStateList<T>.updateList(newList: List<T>){
	clear()
	addAll(newList)
}

@Composable
fun DetailInput(
	fieldValue: MutableState<TextFieldValue>,
) {


}
