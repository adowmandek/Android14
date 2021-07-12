package com.example.contactsrecycler

import android.os.Bundle
import android.os.PersistableBundle
import android.provider.ContactsContract
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity :AppCompatActivity(){
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DisplayContacts()

    }
    fun  DisplayContacts(){
        var ContactList= listOf(
            Contacts("Mandek","adowmandek@gmail.com","0794764520"),
            Contacts("Aisha","aisha@gmail.com","0724764520"),
            Contacts("Hamdi","hamdi@gmail.com","0754764520"),
            Contacts("wato","wato@gmail.com","0794764420"),
            Contacts("celin","celin@gmail.com","0734764520"),
            Contacts("sarah","sarah@gmail.com","0778764520"),
            Contacts("jasa","jas@gmail.com","0775764520"),

        )
        rvContacts=findViewById(R.id.rvContacts)
        var ContactsAdapter=ContactsAdapter(ContactList)
        rvContacts.adapter=ContactsAdapter
        rvContacts.layoutManager=LinearLayoutManager(baseContext)

    }
}