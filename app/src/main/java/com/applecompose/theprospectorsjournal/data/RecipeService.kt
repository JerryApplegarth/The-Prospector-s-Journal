package com.applecompose.theprospectorsjournal.data

import androidx.compose.runtime.snapshots.SnapshotStateList
import com.applecompose.theprospectorsjournal.screens.updateList
import com.google.firebase.firestore.FirebaseFirestore

object RecipeService {

	private val db = FirebaseFirestore.getInstance()
	fun getNotes(notes: SnapshotStateList<Notes>) {
		db.collection("Notes").get().addOnSuccessListener {
			notes.updateList(it.toObjects(Notes::class.java))
		}.addOnFailureListener {
			notes.updateList(listOf())
		}
	}
}