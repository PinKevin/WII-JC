package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Timestamp
import java.util.Date

@Entity(tableName = "aktivitas_pengguna", foreignKeys = [
    ForeignKey(
        entity = Pengguna::class,
        parentColumns = ["idPengguna"],
        childColumns = ["idPengguna"],
        onDelete = ForeignKey.CASCADE
    )
])
data class AktivitasPengguna(
    @PrimaryKey(autoGenerate = true)
    val idAktivitas: Long = 0,
    val tanggal: Date,
    val waktu: Timestamp,
    val idPengguna: Long,
    val aktivitas: String
)
