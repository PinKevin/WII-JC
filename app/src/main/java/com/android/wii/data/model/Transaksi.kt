package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Time
import java.util.Date

@Entity(tableName = "transaksi", foreignKeys = [
    ForeignKey(
        entity = Pengguna::class,
        parentColumns = ["idPengguna"],
        childColumns = ["idPengguna"],
        onDelete = ForeignKey.CASCADE
    ),
    ForeignKey(
        entity = Pelanggan::class,
        parentColumns = ["idPelanggan"],
        childColumns = ["idPelanggan"],
        onDelete = ForeignKey.CASCADE,
    ),
    ForeignKey(
        entity = Promosi::class,
        parentColumns = ["idPromosi"],
        childColumns = ["idPromosi"],
        onDelete = ForeignKey.CASCADE,
    ),
])
data class Transaksi(
    @PrimaryKey(autoGenerate = true)
    val idTransaksi: Long,
    val tanggal: Date,
    val waktu: Time,
    val shift: Int,
    val idPengguna: Long, // pengguna
    val idPelanggan: Long?, // pelanggan
    val status: String,
    val kodeMeja: String,
    val namaPelanggan: String,
    val total: Int,
    val metodePembayaran: String,
    val totalDiskon: Float,
    val idPromosi: Long? // promosi
)
