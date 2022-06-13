package com.applecompose.theprospectorsjournal.screens

import android.util.Log
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.applecompose.theprospectorsjournal.model.Journal
import com.applecompose.theprospectorsjournal.repository.JournalRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import javax.inject.Inject

@OptIn(ExperimentalComposeUiApi::class)
@HiltViewModel
class JournalViewModel @Inject constructor(
	private val repository: JournalRepository
): ViewModel() {

	private val _journalList = MutableStateFlow<List<Journal>>(emptyList())
	val journalList = _journalList.asStateFlow()

	init {
		viewModelScope.launch(Dispatchers.IO) {
			repository.getAllJournals().distinctUntilChanged()
				.collect { listOfJournals ->
					if (listOfJournals.isNullOrEmpty()) {
						Log.d("Empty", ":Empty List ")
					}else {
						_journalList.value = listOfJournals
					}

				}
		}
	}
	fun addJournal(journal: Journal) = viewModelScope.launch { repository.addJournal(journal) }
	fun updateJournal(journal: Journal) = viewModelScope.launch { repository.updateJournal(journal) }
	fun removeJournal(journal: Journal) = viewModelScope.launch { repository.deleteJournal(journal) }
}
