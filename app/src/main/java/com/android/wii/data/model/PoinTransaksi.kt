package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Time
import java.util.Date

@Entity(tableName = "poin_transaksi", foreignKeys = [
    ForeignKey(
        entity = Pelanggan::class,
        parentColumns = ["idPelanggan"],
        childColumns = ["idPelanggan"],
        onDelete = ForeignKey.CASCADE
    )
])
data class PoinTransaksi(
    @PrimaryKey(autoGenerate = true)
    val idPoinTransaksi: Long = 0,
    val tanggal: Date,
    val waktu: Time,
    val idPelanggan: Long,
    val jumlahPoin: Int,
    val status: String,
    val poinAwal: Int,
    val poinAkhir: Int,
    val sumber: String
)
