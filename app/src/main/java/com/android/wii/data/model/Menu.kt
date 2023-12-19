package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menu")
data class Menu(
    @PrimaryKey(autoGenerate = true)
    val idMenu: Long = 0,
    val namaMenu: String,
    val kategori: String, // makanan/minuman
    val harga: Double,
    val gambar: String
)
