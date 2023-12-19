package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time
import java.util.Date

@Entity(tableName = "pelanggan")
data class Pelanggan(
    @PrimaryKey(autoGenerate = true)
    val idPelanggan: Long = 0,
    val namaPelanggan: String,
    val tanggalDaftar: Date,
    val waktuDaftar: Time,
    val poin: Int,
    val status: String
)
