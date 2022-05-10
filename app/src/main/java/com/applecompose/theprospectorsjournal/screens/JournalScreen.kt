package com.applecompose.theprospectorsjournal.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.applecompose.theprospectorsjournal.conposables.JournalButton
import com.applecompose.theprospectorsjournal.conposables.JournalInputText
import com.applecompose.theprospectorsjournal.conposables.JournalRow
import com.applecompose.theprospectorsjournal.conposables.JournalTopTitle
import com.applecompose.theprospectorsjournal.model.Journal
import com.applecompose.theprospectorsjournal.navigation.Screen




@Composable
fun JournalScreen(
	navController: NavController,
	journal: List<Journal>,
	onAddJournal: (Journal) -> Unit,
	onRemoveJournal: (Journal) -> Unit
) {
	var title by remember { mutableStateOf("") }
	var location by remember { mutableStateOf("") }
	var ownership by remember { mutableStateOf("") }
	var comments by remember { mutableStateOf("") }

	val context = LocalContext.current
	val focusManager = LocalFocusManager.current


	val scrollState = rememberScrollState()


	Column(
		modifier = Modifier
			.fillMaxSize()
			.verticalScroll(scrollState),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Top
	)
	{
		if (scrollState.isScrollInProgress) {
			Text("scrolling")
		}


		JournalTopTitle()
		Spacer(modifier = Modifier.height(16.dp))
		Divider(thickness = 2.dp, color = MaterialTheme.colors.primaryVariant)

		JournalInputText(
			modifier = Modifier
				.padding(top = 9.dp, bottom = 8.dp),
			text = title,
			label = "Title",
			onTextChange = {
				title = it
			})
		JournalInputText(
			modifier = Modifier
				.padding(top = 9.dp, bottom = 8.dp),
			text = location,
			label = "Location Coordinates",
			onTextChange = {
				location = it
			})
		JournalInputText(
			modifier = Modifier
				.padding(top = 9.dp, bottom = 8.dp),
			text = ownership,
			label = "Ownership of Land",
			onTextChange = {
				ownership = it
			})
		JournalInputText(
			modifier = Modifier
				.padding(top = 9.dp, bottom = 8.dp),
			text = comments,
			label = "Detailed Comments",
			onTextChange = {
				comments = it
			})
		Spacer(modifier = Modifier.height(6.dp))
		Row() {

			JournalButton(
				text = "Save",
				onClick = {
					if (title.isNotEmpty()
						&& location.isNotEmpty()
						&& ownership.isNotEmpty()
						&& comments.isNotEmpty()
					) {
						onAddJournal(
							Journal(
								title = title,
								location = location,
								ownership = ownership,
								comments = comments
							)
						)
						title = ""
						location = ""
						ownership = ""
						comments = ""
						Toast.makeText(context, "Note Added", Toast.LENGTH_SHORT).show()
					}
				})

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


	Divider(modifier = Modifier.padding(10.dp))
	LazyColumn{
		items(journal) {journal ->
			JournalRow(
				journal = journal,
				onNoteClick = {
					onRemoveJournal(journal)
				})
		}
	}
}
