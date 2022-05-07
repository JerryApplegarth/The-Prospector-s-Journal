package com.applecompose.theprospectorsjournal.utils

import androidx.room.TypeConverter
import java.util.*

class DataConverter {

	@TypeConverter
	fun timeStampFromDate(date: Date): Long {
		return date.time
	}

	@TypeConverter
	fun dateFromTimeStamp(timestamp: Long): Date? {
		return Date(timestamp)
	}
}
