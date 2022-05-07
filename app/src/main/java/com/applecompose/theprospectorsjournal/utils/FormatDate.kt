package com.applecompose.theprospectorsjournal.utils

import androidx.compose.runtime.Composable
import java.text.SimpleDateFormat
import java.util.*

fun formatDate(time: Long): String {
	val date = Date(time)
	val format = SimpleDateFormat("EEE, d MMM hh:mm aaa",
		Locale.getDefault()
	)
	return format.format(date)
}
