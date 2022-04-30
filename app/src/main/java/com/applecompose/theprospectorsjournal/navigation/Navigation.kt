package com.applecompose.theprospectorsjournal.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.applecompose.theprospectorsjournal.screens.GoldPrices
import com.applecompose.theprospectorsjournal.screens.NoteScreen

@Composable
fun Navigation() {
	val navController = rememberNavController()
	NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
		composable(Screen.HomeScreen.route) {

		}
		composable(Screen.NoteScreen.route) {
			NoteScreen(navController = navController)
		}
		composable(Screen.GoldPrices.route) {
			GoldPrices(navController = navController)
		}
	}
}