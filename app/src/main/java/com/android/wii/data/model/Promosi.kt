package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "promosi")
data class Promosi(
    @PrimaryKey(autoGenerate = true)
    val idPromosi: Long = 0,
    val namaPromosi: String,
    val deskripsi: String,
    val jumlahPoin: Int,
    val gambar: String
)
