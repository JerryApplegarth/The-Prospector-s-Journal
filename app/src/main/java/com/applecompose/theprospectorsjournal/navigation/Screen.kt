package com.applecompose.theprospectorsjournal.navigation

sealed class Screen(val route: String) {

	object HomeScreen: Screen("home_screen")
	object MainScreen: Screen("main_screen")
	object GoldPrices: Screen("gold_prices")
	object JournalScreen: Screen("note_screen")
	
}
