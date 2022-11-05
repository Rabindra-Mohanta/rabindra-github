package com.soosle.rabindraroom

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface  ContactDao {

    @Insert
     suspend  fun insertContact(contacts: Contacts);
    @Update
    suspend fun update(contacts: Contacts);
    @Delete
    suspend  fun delete(contacts: Contacts);

    @Query("select * FrOm Contact ")
     fun getData():LiveData<List<Contacts>>;

}