package com.applecompose.theprospectorsjournal.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.*

@Entity(tableName = "journal_table")
data class Journal(
	@PrimaryKey
	val id: UUID = UUID.randomUUID(),

	@ColumnInfo(name = "prospect_name")
	val title: String,

	@ColumnInfo(name = "location")
	val location: String,

	@ColumnInfo(name = "ownership")
	val ownership: String,

	@ColumnInfo(name = "comments")
	val comments: String,

	@ColumnInfo(name = "journal_entry_date")
	val entryDate: Date = Date.from(Instant.now())

)