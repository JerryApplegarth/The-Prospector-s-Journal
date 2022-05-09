package com.applecompose.theprospectorsjournal.data

import androidx.compose.runtime.Composable
import androidx.room.*
import com.applecompose.theprospectorsjournal.model.Journal
import kotlinx.coroutines.flow.Flow

@Dao
interface JournalDatabaseDao {

	@Query("SELECT * FROM journal_table")
	fun getJournals(): Flow<List<Journal>>

	@Query("SELECT * FROM journal_table WHERE id = :id")
	suspend fun getJournalById(id: String): Journal

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	suspend fun insert(journal: Journal)

	@Update(onConflict = OnConflictStrategy.REPLACE)
	suspend fun update(journal: Journal)

	@Query("DELETE FROM journal_table")
	suspend fun deleteAll()

	@Delete
	suspend fun deleteJournal(journal: Journal)
}