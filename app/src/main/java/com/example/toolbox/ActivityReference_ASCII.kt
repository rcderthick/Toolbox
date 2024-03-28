package com.example.toolbox

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
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



        decArr = arrayOf("0","1","2","3","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30",
            "31","32","33","34","35","36","37","38","39","40",
            "41","42","43","44","45","46","47","48","49","50",
            "51","52","53","54","55","56","57","58","59","60",
            "61","62","63","64","65","66","67","68","69","70",
            "71","72","73","74","75","76","77","78","79","80",
            "81","82","83","84","85","86","87","88","89","90",
            "91","92","93","94","95","96","97","98","99","100",
            "101","102","103","104","105","106","107","108","109","110",
            "111","112","113","114","115","116","117","118","119","120",
            "121","122","123","124","125","126","127")

        for (i in decArr.indices){
            Log.d("DEBUG MESSAGE:",decArr[i].toString())
        }


        hexArr = arrayOf("00","01","02","03","04","05","06","07","08","09","0A","0B","0C","0D","0E","0F",
            "10","11","12","13","14","15","16","17","18","19","1A","1B","1C","1D","1E","1F",
            "20","21","22","23","24","25","26","27","28","29","2A","2B","2C","2D","2E","2F",
            "30","31","32","33","34","35","36","37","38","39","3A","3B","3C","3D","3E","3F",
            "40","41","42","43","44","45","46","47","48","49","4A","4B","4C","4D","4E","4F",
            "50","51","52","53","54","55","56","57","58","59","5A","5B","5C","5D","5E","5F",
            "60","61","62","63","64","65","66","67","68","69","6A","6B","6C","6D","6E","6F",
            "70","71","72","73","74","75","76","77","78","79","7A","7B","7C","7D","7E","7F")

        codeArr = arrayOf("NUL","SOH","STX","ETX","EOT","ENQ","ACK","BEL","BS","TAB","LF","VT","FF",
            "CR","SO","SI","DLE","DCI","DC2","DC3","DC4","NAK","SYN","ETB","CAN","EM","SUB","ESC",
            "FS","GS","RS","US","   ","!","\"","#","$","%","&","'","(",")","*","+",",","-",
            ".","/","0","1","2","3","4","5","6","7","8","9",":",";","<","=",">","?","@",
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U",
            "V","W","X","Y","Z","[","\\","]","^","_","`","a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","{","|","}","~","DEL")

        descArr = arrayOf("NULL","START OF HEADING","START OF TEXT","END OF TEXT","END OF TRANSMISSION",
            "ENQUIRY","ACKNOWLEDGE","BELL","BACKSPACE","HORIZONTAL TAB","LINE FEED","VERTICAL TAB",
            "FORM FEED","CARRIAGE RETURN","SHIFT OUT","SHIFT IN","DATA LINK ESCAPE",
            "DEVICE CONTROL 1","DEVICE CONTROL 2","DEVICE CONTROL 3","DEVICE CONTROL 4",
            "NEGATIVE ACK","SYNCHRONOUS IDLE","END OF TRANSMISSION BLOCK","CANCEL",
            "END OF MEDIUM","SUBSTITUTE","ESCAPE","FILE SEPARATOR","GROUP SEPARATOR",
            "RECORD SEPARATOR","UNIT SEPARATOR","SPACE","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","","","","","","","",
            "","","","","","","","","","","","","","","","","","","","","","","","","","","DEL")


        newRecyclerView = findViewById(R.id.asciiRecyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Ascii_dataClass>()

        getUserData()


    }

    private fun getUserData() {

        for( i in decArr.indices + 1){
            val asciiTable = Ascii_dataClass(decArr[i], hexArr[i], codeArr[i], descArr[i])
            newArrayList.add(asciiTable)

        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }






}


