package com.applecompose.theprospectorsjournal.repository

import android.provider.ContactsContract
import com.applecompose.theprospectorsjournal.data.JournalDatabaseDao
import com.applecompose.theprospectorsjournal.model.Journal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class JournalRepository @Inject constructor(
	private val journalDatabaseDao: JournalDatabaseDao
) {
	suspend fun addJournal(journal: Journal) = journalDatabaseDao.insert(journal)
	suspend fun updateJournal(journal: Journal) = journalDatabaseDao.update(journal)
	suspend fun deleteJournal(journal: Journal) = journalDatabaseDao.deleteNote(journal)
	suspend fun deleteAllJournal() = journalDatabaseDao.deleteAll()

	fun getAllJournals(): Flow<List<Journal>> =
		journalDatabaseDao.getJournals().flowOn(Dispatchers.IO).conflate()
}