package com.example.cooky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var  button = findViewById<Button>(R.id.button)
        var tv = findViewById<TextView>(R.id.tv)
        var login = findViewById<EditText>(R.id.login)
        var password = findViewById<EditText>(R.id.password)




        button.setOnClickListener{

         intent= Intent(this, ChooseActivity::class.java)
            intent.putExtra("parol","${password.text.toString()}")
            intent.putExtra("login","${login.text.toString()}")
        startActivity(intent)
    }


        var userList = mutableListOf<User>()

        val gson = Gson()
        val type = object :TypeToken<List<User>>(){}.type

        var shared = getSharedPreferences("regisrt", MODE_PRIVATE)
        var e = shared.edit()



//
//        button.setOnClickListener {
//            var un = login.text.toString()
//            var up = password.text.toString()
//            var s = shared.getString("users","")
//            if (s==""){
//                userList = mutableListOf<User>()
//                tv.text="Bo'sh"
//                return@setOnClickListener
//            }else{
//                userList = gson.fromJson(s,type)
//            }
//            for (i in userList.indices){
//                if (un.equals(userList[i].name) && up.equals(userList[i].password)){
//                    tv.text = "Ushbu foydalanuvchi mavjud "
//                }
//            }
//        }
//        button.setOnClickListener {
//            var un = login.text.toString()
//            var up = password.text.toString()
//            var s = shared.getString("users","")
//            if (s==""){
//                userList = mutableListOf<User>()
//                tv.text="Bo'sh"
//                return@setOnClickListener
//            }else{
//                userList = gson.fromJson(s,type)
//            }
//            userList.add(User(un,up))
//            var g = gson.toJson(userList)
//            e.putString("users",g).apply()
//        }
//

    }
}