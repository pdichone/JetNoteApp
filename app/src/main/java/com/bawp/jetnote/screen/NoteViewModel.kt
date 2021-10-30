package com.bawp.jetnote.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.bawp.jetnote.data.NotesDataSource
import com.bawp.jetnote.model.Note

class NoteViewModel : ViewModel() {
    private var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NotesDataSource().loadNotes())
    }
    fun addNote(note: Note) {
        noteList.add(note)

    }

    fun removeNote(note: Note) {
        noteList.remove(note)
    }
    fun getAllNotes(): List<Note> {
        return noteList
    }

}