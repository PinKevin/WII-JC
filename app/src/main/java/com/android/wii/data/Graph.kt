package com.android.wii.data

import android.content.Context
import com.android.wii.data.repository.AppRepository

object Graph {
    lateinit var db: AppDatabase
        private set

    val repository by lazy {
        AppRepository(
            warungDao = db.warungDao(),
            mejaDao = db.mejaDao(),
            menuDao = db.menuDao()
        )
    }

    fun provide(context: Context) {
        db = AppDatabase.getDatabase(context)
    }
}