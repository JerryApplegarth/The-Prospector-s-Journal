package com.applecompose.theprospectorsjournal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.applecompose.theprospectorsjournal.navigation.Navigation
import com.applecompose.theprospectorsjournal.navigation.Screen
import com.applecompose.theprospectorsjournal.screens.HomeScreen
import com.applecompose.theprospectorsjournal.ui.theme.TheProspectorsJournalTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			TheProspectorsJournalTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colors.background
				) {
					val context = LocalContext.current
					HomeScreen(navController = NavController(context))

				}
			}
		}
	}
}

