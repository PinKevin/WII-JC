package com.android.wii.data.repository

import com.android.wii.data.dao.MejaDao
import com.android.wii.data.dao.MenuDao
import com.android.wii.data.dao.WarungDao

class AppRepository(
    private val warungDao: WarungDao,
    private val mejaDao: MejaDao,
    private val menuDao: MenuDao
) {
    val warung = warungDao.getAllWarung()
    val meja = mejaDao.getAllMeja()
    val menu = menuDao.getAllMenu()
}