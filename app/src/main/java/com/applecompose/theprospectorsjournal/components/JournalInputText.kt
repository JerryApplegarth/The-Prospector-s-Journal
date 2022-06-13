package com.applecompose.theprospectorsjournal.components

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import com.applecompose.theprospectorsjournal.ui.theme.newBackgroundColor

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun JournalInputText(
	modifier: Modifier = Modifier,
	text: String,
	label: String,
	maxLines: Int = 1,
	onTextChange: (String) -> Unit,
	onImeAction: () -> Unit = {}
) {
	val keyboardController = LocalSoftwareKeyboardController.current
	OutlinedTextField(
		value = text,
		onValueChange = onTextChange,
		colors = TextFieldDefaults.textFieldColors(
			backgroundColor = MaterialTheme.colors.newBackgroundColor
		),
		maxLines = maxLines,
		label = {
			Text(text = label)

		},
		keyboardOptions = KeyboardOptions.Default.copy(
			imeAction = ImeAction.Done
		),
		keyboardActions = KeyboardActions(onDone = {
			onImeAction()
			keyboardController?.hide()
		}),
		modifier = modifier
		)

}