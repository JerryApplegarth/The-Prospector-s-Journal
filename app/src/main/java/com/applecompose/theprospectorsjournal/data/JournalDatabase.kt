package com.applecompose.theprospectorsjournal.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.applecompose.theprospectorsjournal.model.Journal
import com.applecompose.theprospectorsjournal.utils.DataConverter
import com.applecompose.theprospectorsjournal.utils.UUIDConverter

@Database(entities = [Journal::class], version = 1, exportSchema = false)
@TypeConverters(DataConverter::class, UUIDConverter::class)
abstract class JournalDatabase: RoomDatabase() {
	abstract fun journalDao(): JournalDatabaseDao

}