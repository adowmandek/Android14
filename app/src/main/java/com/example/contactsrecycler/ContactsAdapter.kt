package com.example.contactsrecycler

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter(var  ContactList:List<Contacts>,var context: Context):RecyclerView.Adapter<contactsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.list_contacts,parent,false)
        return  contactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
        var currentContact=ContactList.get(position)
        holder.tvName.text=currentContact.Name
        holder.tvEmail.text=currentContact.Email
        holder.tvPhoneNumber.text=currentContact.PhoneNumber
        holder.cvCard.setOnClickListener {
                var intent = Intent(context, ContactDetail::class.java)
                intent.putExtra("Name", currentContact.Name)
                intent.putExtra("email",currentContact.Email)
                intent.putExtra("phone",currentContact.PhoneNumber)
                intent.putExtra("imageUrl",currentContact.imageUrl)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

                context.startActivity(intent)


        }
//        holder.tvimage.setOnClickListener {
//            Toast.makeText(context,"click on my face",Toast.LENGTH_LONG).show()
//        }

Picasso.get()
    .load(currentContact.imageUrl)
    .resize(80,80)
    .centerCrop()
    .into(holder.ivContact)
    }

    override fun getItemCount(): Int {
        return ContactList.size

    }




}
class  contactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var ivContact=itemView.findViewById<ImageView>(R.id.ivContact)
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var cvCard=itemView.findViewById<CardView>(R.id.cvCard)


}