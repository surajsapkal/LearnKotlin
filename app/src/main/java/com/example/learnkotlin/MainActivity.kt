package com.example.learnkotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.diegodobelo.expandingview.ExpandingItem
import com.diegodobelo.expandingview.ExpandingList
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.subtopic.*
import kotlinx.android.synthetic.main.subtopic.view.*
import kotlinx.android.synthetic.main.topic.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainList = findViewById<ExpandingList>(R.id.mainList)
        topicOne()
        topicTwo()
        topicThree()
        topicFour()

        subTopicTitle.setOnClickListener {
            when(subTopicTitle.text){
                "Kotlin Hello World"->{
                    val intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/watch?v=1676actiiME&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=5&t=5s"))
                    startActivity(intent)
                }
            }
        }


    }

    private fun topicOne(){
        val topic1:ExpandingItem = mainList.createNewItem(R.layout.expanding_topic_1)
        topic1.findViewById<TextView>(R.id.topicTitle).text = "Kotlin Introduction"
        topic1.setIndicatorColorRes(R.color.colorOrange)
        topic1.setIndicatorIconRes(R.drawable.ic_add)
        topic1.createSubItems(7)

        val t1subtopic0: View = topic1.getSubItemView(0)
        t1subtopic0.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Hello World"

        val t1subtopic1: View = topic1.getSubItemView(1)
        t1subtopic1.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Data Types"

        val t1subtopic2: View = topic1.getSubItemView(2)
        t1subtopic2.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Operators"

        val t1subtopic3: View = topic1.getSubItemView(3)
        t1subtopic3.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Type Conversion"

        val t1subtopic4: View = topic1.getSubItemView(4)
        t1subtopic4.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Expression & Statement"

        val t1subtopic5: View = topic1.getSubItemView(5)
        t1subtopic5.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Comments"

        val t1subtopic6: View = topic1.getSubItemView(6)
        t1subtopic6.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Input/Otuput"
    }

    private fun topicTwo(){
        val topic2:ExpandingItem = mainList.createNewItem(R.layout.expanding_topic_2)
        topic2.findViewById<TextView>(R.id.topic2Title).text = "Kotlin Flow Control"
        topic2.setIndicatorColorRes(R.color.colorRed)
        topic2.setIndicatorIconRes(R.drawable.ic_add)
        topic2.createSubItems(6)

        val t2subtopic0: View = topic2.getSubItemView(0)
        t2subtopic0.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin if expression"

        val t2subtopic1: View = topic2.getSubItemView(1)
        t2subtopic1.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin when Expression"

        val t2subtopic2: View = topic2.getSubItemView(2)
        t2subtopic2.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin while Loop"

        val t2subtopic3: View = topic2.getSubItemView(3)
        t2subtopic3.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin for Loop"

        val t2subtopic4: View = topic2.getSubItemView(4)
        t2subtopic4.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin break"

        val t2subtopic5: View = topic2.getSubItemView(5)
        t2subtopic5.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin continue"
    }

    private fun topicThree(){
        val topic3:ExpandingItem = mainList.createNewItem(R.layout.expanding_topic_3)
        topic3.findViewById<TextView>(R.id.topic3Title).text = "Kotlin Functions"
        topic3.setIndicatorColorRes(R.color.colorYellow)
        topic3.setIndicatorIconRes(R.drawable.ic_add)
        topic3.createSubItems(4)

        val t3subtopic0: View = topic3.getSubItemView(0)
        t3subtopic0.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin function"

        val t3subtopic1: View = topic3.getSubItemView(1)
        t3subtopic1.findViewById<TextView>(R.id.subTopicTitle).text = "Infix Function Call"

        val t3subtopic2: View = topic3.getSubItemView(2)
        t3subtopic2.findViewById<TextView>(R.id.subTopicTitle).text = "Default & Named Arguments"

        val t3subtopic3: View = topic3.getSubItemView(3)
        t3subtopic3.findViewById<TextView>(R.id.subTopicTitle).text = "Recursion & Tail Recursion"
    }

    private fun topicFour(){
        val topic4:ExpandingItem = mainList.createNewItem(R.layout.expanding_topic_4)
        topic4.findViewById<TextView>(R.id.topic4Title).text = "Kotlin OOP"
        topic4.setIndicatorColorRes(R.color.colorGreen)
        topic4.setIndicatorIconRes(R.drawable.ic_add)
        topic4.createSubItems(14)

        val t4subtopic0: View = topic4.getSubItemView(0)
        t4subtopic0.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin function"

        val t4subtopic1: View = topic4.getSubItemView(1)
        t4subtopic1.findViewById<TextView>(R.id.subTopicTitle).text = "Infix Function Call"

        val t4subtopic2: View = topic4.getSubItemView(2)
        t4subtopic2.findViewById<TextView>(R.id.subTopicTitle).text = "Default & Named Arguments"

        val t4subtopic3: View = topic4.getSubItemView(3)
        t4subtopic3.findViewById<TextView>(R.id.subTopicTitle).text = "Recursion & Tail Recursion"

        val t4subtopic04: View = topic4.getSubItemView(4)
        t4subtopic04.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin function"

        val t4subtopic5: View = topic4.getSubItemView(5)
        t4subtopic5.findViewById<TextView>(R.id.subTopicTitle).text = "Infix Function Call"

        val t4subtopic6: View = topic4.getSubItemView(6)
        t4subtopic6.findViewById<TextView>(R.id.subTopicTitle).text = "Default & Named Arguments"

        val t4subtopic7: View = topic4.getSubItemView(7)
        t4subtopic7.findViewById<TextView>(R.id.subTopicTitle).text = "Recursion & Tail Recursion"

        val t4subtopic8: View = topic4.getSubItemView(8)
        t4subtopic8.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin function"

        val t4subtopic9: View = topic4.getSubItemView(9)
        t4subtopic9.findViewById<TextView>(R.id.subTopicTitle).text = "Infix Function Call"

        val t4subtopic10: View = topic4.getSubItemView(10)
        t4subtopic10.findViewById<TextView>(R.id.subTopicTitle).text = "Default & Named Arguments"

        val t4subtopic11: View = topic4.getSubItemView(11)
        t4subtopic11.findViewById<TextView>(R.id.subTopicTitle).text = "Recursion & Tail Recursion"

        val t4subtopic12: View = topic4.getSubItemView(12)
        t4subtopic12.findViewById<TextView>(R.id.subTopicTitle).text = "Default & Named Arguments"

        val t4subtopic13: View = topic4.getSubItemView(13)
        t4subtopic13.findViewById<TextView>(R.id.subTopicTitle).text = "Recursion & Tail Recursion"
    }
}