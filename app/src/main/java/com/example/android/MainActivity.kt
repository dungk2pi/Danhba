package com.example.android

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.PopupMenu
import androidx.activity.ComponentActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    var listData: ArrayList<Contact> = ArrayList<Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        var list: ArrayList<Contact> = dataList()
        listData = list

        val myAdapter: ContactAdapter = ContactAdapter(list, this)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = myAdapter



        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        myAdapter.setOnClickListener(object :
            ContactAdapter.OnClickListener {
            override fun onClick(position: Int, model: Contact) {
                val intent = Intent(this@MainActivity, ContactDetail::class.java)
                // Passing the data to the
                // EmployeeDetails Activity
                intent.putExtra("NAME_DETAIL", model.name)
                intent.putExtra("ID_DETAIL", model.ID )
                intent.putExtra("EMAIL_DETAIL", model.email)
                intent.putExtra("PHONE_DETAIL", model.phone)
                startActivity(intent)
            }
        })




    }


    fun dataList() : ArrayList<Contact>{
        var list: ArrayList<Contact> = ArrayList<Contact>()
        list.add(Contact("Vũ Minh Dũng", "0000001", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000002", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0009703", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000004", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000005", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000006", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000007", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000008", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000009", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000010", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000011", "dungk2pi@gmail.com", "0855243588"))
        list.add(Contact("Vũ Minh Dũng", "0000012", "dungk2pi@gmail.com", "0855243588"))
        return list
    }

}

