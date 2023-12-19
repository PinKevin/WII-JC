package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "role")
data class Role(
    @PrimaryKey(autoGenerate = true)
    val idRole: Long = 0,
    val role: String,
    val status: String
)
