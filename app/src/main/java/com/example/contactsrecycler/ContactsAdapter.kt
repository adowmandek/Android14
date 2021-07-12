package com.example.contactsrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var  ContactList:List<Contacts>):RecyclerView.Adapter<contactsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.list_contacts,parent,false)
        return  contactsViewHolder((itemView))

    }

    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
        var currentContact=ContactList.get(position)
        holder.tvName.text=currentContact.Name
        holder.tvEmail.text=currentContact.Email
        holder.tvPhoneNumber.text=currentContact.PhoneNumber




    }

    override fun getItemCount(): Int {
        return ContactList.size

    }




}
class  contactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)


}