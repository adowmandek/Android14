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
            Contacts("Mandek","adowmandek@gmail.com","0794764520","https://cdn.pixabay.com/photo/2016/02/19/11/36/microphone-1209816_960_720.jpg"),
            Contacts("Aisha","aisha@gmail.com","0724764520","https://cdn.pixabay.com/photo/2015/06/22/08/38/siblings-817369_960_720.jpg"),
            Contacts("Hamdi","hamdi@gmail.com","0754764520","https://media.istockphoto.com/photos/happy-siblings-jumping-on-sofa-picture-id1221273504?s=612x612"),
            Contacts("wato","wato@gmail.com","0794764420","https://cdn.pixabay.com/photo/2015/05/18/16/21/babies-772439_960_720.jpg"),
            Contacts("celin","celin@gmail.com","0734764520","https://cdn.pixabay.com/photo/2018/01/17/07/06/laptop-3087585_960_720.jpg"),
            Contacts("sarah","sarah@gmail.com","0778764520","https://cdn.pixabay.com/photo/2014/05/02/21/49/laptop-336373_960_720.jpg"),
            Contacts("jasa","jas@gmail.com","0775764520","https://cdn.pixabay.com/photo/2016/01/19/01/42/library-1147815_960_720.jpg"),

        )
        rvContacts=findViewById(R.id.rvContacts)
        var ContactsAdapter=ContactsAdapter(ContactList,baseContext)
        rvContacts.adapter=ContactsAdapter
        rvContacts.layoutManager=LinearLayoutManager(baseContext)

    }
}