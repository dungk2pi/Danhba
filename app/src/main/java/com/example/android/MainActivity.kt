package com.example.android

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        var list : ArrayList<Message> = ArrayList<Message>()

        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "10:00 AM"))
        list.add(Message("Vu Minh Dung", "1234", "9:30 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "9:00 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:40 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:30 AM"))
        list.add(Message("Vu Minh Dung", "KẾT NỐI YÊU THƯƠNG và 7 Nhóm khác là các gợi ý mới dành cho bạn", "8:03 AM"))
        list.add(Message("Vu Minh Dung", "Dazy x HyunA | Tôi sinh ra đã là người tạo ra xu hướng!", "8:00 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "9:00 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:40 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:30 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:03 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:00 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "9:00 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:40 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:30 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:03 AM"))
        list.add(Message("Vu Minh Dung", "Chai lieu hdh", "8:00 AM"))


        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = Adapter(list)
    }
}

