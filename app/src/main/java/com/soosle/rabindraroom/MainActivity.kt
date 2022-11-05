package com.soosle.rabindraroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
      lateinit var db: ContactDb;
      lateinit var text:TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide();
        text = findViewById(R.id.textView);
        db = Room.databaseBuilder(applicationContext,ContactDb::class.java,"Contact Db").build();
        GlobalScope.launch {

        db.GetcontactDao().insertContact(Contacts(0,"Rabindra Mohanta","8895125155" ));
        }

    }

    fun textClick(view: View) {

        db.GetcontactDao().getData().observe(this, Observer {
            text.text = it.get(0).name;

        })
    }
}