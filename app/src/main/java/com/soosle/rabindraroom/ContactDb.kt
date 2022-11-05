package com.soosle.rabindraroom
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Contacts::class],version = 1)
abstract class ContactDb:RoomDatabase() {
    abstract fun GetcontactDao():ContactDao
}