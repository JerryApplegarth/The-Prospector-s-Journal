package com.applecompose.theprospectorsjournal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import com.applecompose.theprospectorsjournal.navigation.Navigation
import com.applecompose.theprospectorsjournal.ui.theme.TheProspectorsJournalTheme
import dagger.hilt.android.AndroidEntryPoint

@OptIn(ExperimentalComposeUiApi::class)
@AndroidEntryPoint
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
					Navigation()


				}
			}
		}
	}
}





