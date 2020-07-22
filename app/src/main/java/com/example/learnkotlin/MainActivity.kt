package com.example.learnkotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ExpandableListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listViewAdapter: ExpandableListViewAdapter
    private lateinit var topicList: List<String>
    private lateinit var subTopicList: HashMap<String,List<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showList()

        listViewAdapter = ExpandableListViewAdapter(this,topicList,subTopicList)
        eListView.setAdapter(listViewAdapter)

        eListView.setOnChildClickListener { parent:ExpandableListView, v: View, groupPosition:Int , childPosition:Int, id:Long ->
            val selected: String = listViewAdapter.getChild(groupPosition, childPosition).toString()
            when(selected){
                "Kotlin Hello World"->{
                    val browserIntent = Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=1676actiiME&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=5&t=0s"))
                    startActivity(browserIntent)
                }
            }
            return@setOnChildClickListener true
        }

    }

    private fun showList() {
        topicList = ArrayList()
        subTopicList = HashMap()

        (topicList as ArrayList<String>).add("Kotlin Introduction")
        (topicList as ArrayList<String>).add("Kotlin Flow Control")
        (topicList as ArrayList<String>).add("Kotlin Functions")
        (topicList as ArrayList<String>).add("Kotlin OOP")

        val subtopic1: MutableList<String> = ArrayList()
        subtopic1.add("Kotlin Hello World")
        subtopic1.add("Kotlin Data Types")
        subtopic1.add("Kotlin Operators")
        subtopic1.add("Kotlin Type Conversion")
        subtopic1.add("Kotlin Expression and Statement")
        subtopic1.add("Kotlin Comments")
        subtopic1.add("Kotlin Input/Output")

        val subtopic2: MutableList<String> = ArrayList()
        subtopic2.add("Kotlin if expression")
        subtopic2.add("Kotlin when Expression")
        subtopic2.add("Kotlin while Loop")
        subtopic2.add("Kotlin for Loop")
        subtopic2.add("Kotlin break")
        subtopic2.add("Kotlin continue")

        val subtopic3: MutableList<String> = ArrayList()
        subtopic3.add("Kotlin function")
        subtopic3.add("Infix Function Call")
        subtopic3.add("default and Named Arguments")
        subtopic3.add("Recursion and Tail Recursion")

        val subtopic4: MutableList<String> = ArrayList()
        subtopic4.add("Kotlin Class and Objects")
        subtopic4.add("Kotlin Constructors")
        subtopic4.add("Kotlin Getters and Setters")
        subtopic4.add("Kotlin Inheritance")
        subtopic4.add("Kotlin Visibility Modifiers")
        subtopic4.add("Kotlin Abstract Class")
        subtopic4.add("Kotlin Interface")
        subtopic4.add("Kotlin Nested and Inner Classes")
        subtopic4.add("Kotlin Data Class")
        subtopic4.add("Kotlin Sealed Class")
        subtopic4.add("Kotlin Object")
        subtopic4.add("Kotlin Companion Objects")
        subtopic4.add("Kotlin Extension Function")
        subtopic4.add("Kotlin Operator Overloading")

        subTopicList[topicList[0]] = subtopic1
        subTopicList[topicList[1]] = subtopic2
        subTopicList[topicList[2]] = subtopic3
        subTopicList[topicList[3]] = subtopic4
    }
}