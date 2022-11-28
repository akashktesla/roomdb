package com.example.endsem

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getContacts()
    }

    @SuppressLint("Range")
    fun getContacts(){
       val cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null)
        if(cursor !=null && cursor.moveToFirst()){
            do {
                val name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME))
                Log.d("_log","name"+name)

            }while(cursor.moveToNext())
            cursor.close()


        }


    }



}