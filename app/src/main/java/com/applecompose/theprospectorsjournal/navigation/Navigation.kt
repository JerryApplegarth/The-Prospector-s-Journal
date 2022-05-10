package com.applecompose.theprospectorsjournal.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.applecompose.theprospectorsjournal.model.Journal
import com.applecompose.theprospectorsjournal.screens.GoldPrices
import com.applecompose.theprospectorsjournal.screens.HomeScreen

import com.applecompose.theprospectorsjournal.screens.JournalScreen

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Navigation() {

	val navController = rememberNavController()
	NavHost(
		navController = navController,
		startDestination = Screen.HomeScreen.route) {

		composable(route = Screen.HomeScreen.route) {
			HomeScreen(navController = navController)

		}
		composable(route = Screen.JournalScreen.route) {
			JournalScreen(
				navController = navController,
				journal = listOf(),
				onAddJournal = {},
				onRemoveJournal = {}
			)
		}

		composable(route = Screen.GoldPrices.route) {
			GoldPrices(navController = navController)
		}







//		composable(route = Screen.JournalScreen.route) {
//			JournalScreen(
//				navController = navController,
//				journal = ,
//				onAddJournal = {},
//				onRemoveJournal = {}
//			)
//
//
//		}
	}
}
