package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menu")
data class Menu(
    @PrimaryKey val idMenu: Long,
    val namaMenu: String,
    val kategori: String, // makanan/minuman
    val harga: Double,
    val gambar: String
)
