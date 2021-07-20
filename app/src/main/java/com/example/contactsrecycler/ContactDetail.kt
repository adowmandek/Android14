package com.example.contactsrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class ContactDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)
        var name=intent.getStringExtra("Name")
        var nameintent=intent.getStringExtra("name")
        var emailintent=intent.getStringExtra("email")
        var phoneintent=intent.getStringExtra("phoneNumber")
        var imageintent=intent.getStringExtra("image").toString()

        var tvName=findViewById<TextView>(R.id.tvName)
        var tvPhone=findViewById<TextView>(R.id.tvPhoneNumber)
        var tvemail=findViewById<TextView>(R.id.tvEmail)
        var tvimage=findViewById<ImageView>(R.id.ivContact)
        Toast.makeText(baseContext,name, Toast.LENGTH_LONG).show()


        tvName.text=nameintent
        tvPhone.text=phoneintent
        tvemail.text=emailintent
        Picasso.get()
            .load(imageintent)
            .into(tvimage)




    }
}