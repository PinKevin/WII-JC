package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "meja", foreignKeys = [
    ForeignKey(
        entity = Warung::class,
        parentColumns = ["idWarung"],
        childColumns = ["idWarung"],
        onDelete = ForeignKey.CASCADE
    )
])
data class Meja(
    @PrimaryKey val idMeja: Long,
    val idWarung: Long,
    val kodeMeja: String
)
