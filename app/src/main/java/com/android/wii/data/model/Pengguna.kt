package com.android.wii.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "pengguna", foreignKeys = [
    ForeignKey(
        entity = Role::class,
        parentColumns = ["idRole"],
        childColumns = ["idRole"],
        onDelete = ForeignKey.CASCADE
    )
])
data class Pengguna(
    @PrimaryKey(autoGenerate = true)
    val idPengguna: Long = 0,
    val username: String,
    val password: String,
    val namaPengguna: String,
    val idRole: Long,
    val status: String,
    val foto: String
)
