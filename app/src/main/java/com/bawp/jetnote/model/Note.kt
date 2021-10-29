package com.bawp.jetnote.model

import java.time.LocalDateTime
import java.util.*

data class Note(
      val id: UUID = UUID.randomUUID(),
      val title: String,
      val description: String,
      val entryDate: LocalDateTime = LocalDateTime.now()
               )
