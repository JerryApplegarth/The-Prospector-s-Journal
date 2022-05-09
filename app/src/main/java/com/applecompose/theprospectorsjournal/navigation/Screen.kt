package com.applecompose.theprospectorsjournal.navigation

sealed class Screen(val route: String) {

	object HomeScreen: Screen("home_screen")
	object GoldPrices: Screen("gold_prices")
	object JournalApp: Screen("journal_app")
	object JournalScreen: Screen("note_screen")
	
}
