package com.soosle.rabindraroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contact")
data class Contacts(

     @PrimaryKey(autoGenerate = true)
    val id:Long,
    var name:String,
    val number:String

)
