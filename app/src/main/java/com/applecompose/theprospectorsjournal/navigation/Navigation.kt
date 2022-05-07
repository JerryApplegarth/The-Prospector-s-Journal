package com.applecompose.theprospectorsjournal.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.applecompose.theprospectorsjournal.screens.GoldPrices
import com.applecompose.theprospectorsjournal.screens.HomeScreen
import com.applecompose.theprospectorsjournal.screens.JournalScreen

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
			JournalScreen(navController = navController)
		}
		composable(route = Screen.GoldPrices.route) {
			GoldPrices(navController = navController)
		}
	}
}