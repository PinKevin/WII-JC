package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "detail_transaksi", foreignKeys = [
    ForeignKey(
        entity = Menu::class,
        parentColumns = ["idMenu", "namaMenu"],
        childColumns = ["idMenu", "namaMenu"],
        onDelete = ForeignKey.CASCADE
    )
])
data class DetailTransaksi(
    @PrimaryKey(autoGenerate = true)
    val idTransaksi: Long = 0,
    val idMenu: Long, // menu
    val namaMenu: String, // menu
    val harga: Int,
    val jumlah: Int,
    val subTotal: Int,
    val status: String
)
