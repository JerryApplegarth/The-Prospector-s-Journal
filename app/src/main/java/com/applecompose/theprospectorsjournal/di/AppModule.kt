package com.applecompose.theprospectorsjournal.di

import androidx.room.Room
import com.applecompose.theprospectorsjournal.data.JournalDatabase
import com.applecompose.theprospectorsjournal.data.JournalDatabaseDao

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

	@Singleton
	@Provides
	fun providesJournalDao(journalDatabase: JournalDatabase): JournalDatabaseDao =
		journalDatabase.journalDao()

	@Singleton
	@Provides
	fun provideAppDatabase(@ApplicationContext context: android.content.Context):
			JournalDatabase =
		Room.databaseBuilder(
			context,
			JournalDatabase::class.java,
			"journal_db"
		)
			.fallbackToDestructiveMigration()
			.build()
}