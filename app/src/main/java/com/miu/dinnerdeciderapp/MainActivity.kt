package com.miu.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Collections

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var menus=ArrayList<String>()
        menus.add("Hamburger")
        menus.add("Pizza")
        menus.add("Mexican")
        menus.add("American")
        menus.add("Chinese")
        btnDecide.setOnClickListener {
//            menus.shuffle()
            var index=menus.indices.random()
            displayText.text=menus.get(index)

        }
        addfood.setOnClickListener {
            if(textbox1.text.equals("")){
            

            }
            menus.add(textbox1.text.toString())
            textbox1.setText("")
            displayText.text="Food added succesfully,Press decide Button"
        }


    }


}