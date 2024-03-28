package com.example.toolbox

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ActivityReference_ASCII : AppCompatActivity() {

    private lateinit var newRecyclerView : RecyclerView
    private lateinit var newArrayList : ArrayList<Ascii_dataClass>
    lateinit var decArr : Array<String>
    lateinit var hexArr : Array<String>
    lateinit var codeArr : Array<String>
    lateinit var descArr : Array<String>


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reference_ascii)



        //Set the title to be displayed at the top of this activity
        title = "ASCII Chart"



        decArr = arrayOf("1","2","3","4","5","6","7","8","9","10","11","12","13")
        hexArr = arrayOf("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen")
        codeArr = arrayOf("asfd","asfd","asfd","asfhfd","asfhgfd","asfgfd","ashhfd","as53fd","fasfd","asfd","asfsfdfdd","asfd","asfdsff")
        descArr = arrayOf("D1","D2","asfd","asfhfd","asfhgfd","asfgfd","ashhfd","as53fd","fasfd","asfd","asfsfdfdd","asfd","asfdsff")

        newRecyclerView = findViewById(R.id.asciiRecyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Ascii_dataClass>()

        getUserData()


    }

    private fun getUserData() {

        for( i in decArr.indices){
            val asciiTable = Ascii_dataClass(decArr[i], hexArr[i], codeArr[i], descArr[i])
            newArrayList.add(asciiTable)

        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }






}


