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

        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()

        topicOne()
        topicTwo()
        topicThree()
        topicFour()

    }

    private fun topicOne(){
        val topic1 = mainList.createNewItem(R.layout.expanding_topic_1)
        topic1.findViewById<TextView>(R.id.topicTitle).text = "Kotlin Introduction"
        topic1.setIndicatorColorRes(R.color.colorRoyalBlue)
        topic1.setIndicatorIconRes(R.drawable.ic_add)
        topic1.createSubItems(8)

        val t1subtopic0 = topic1.getSubItemView(0)
        t1subtopic0.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin SetUp"
        t1subtopic0.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=fwZyfudxnNo&feature=youtu.be"))
            startActivity(intent)
        }
        
        val t1subtopic1 = topic1.getSubItemView(1)
        t1subtopic1.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Hello World"
        t1subtopic1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=1676actiiME&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=5&t=5s"))
            startActivity(intent)
        }

        val t1subtopic2 = topic1.getSubItemView(2)
        t1subtopic2.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Data Types"
        t1subtopic2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=W3CuQ1dvP7A"))
            startActivity(intent)
        }

        val t1subtopic3 = topic1.getSubItemView(3)
        t1subtopic3.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Operators"
        t1subtopic3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=iPdVy8sAzX8&feature=youtu.be"))
            startActivity(intent)
        }

        val t1subtopic4 = topic1.getSubItemView(4)
        t1subtopic4.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Type Conversion"
        t1subtopic4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=I0YfMv_ma3Y&feature=youtu.be"))
            startActivity(intent)
        }

        val t1subtopic5 = topic1.getSubItemView(5)
        t1subtopic5.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Expression & Statement"
        t1subtopic5.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=vCHIXI6zqYc&feature=youtu.be"))
            startActivity(intent)
        }

        val t1subtopic6 = topic1.getSubItemView(6)
        t1subtopic6.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Comments"
        t1subtopic6.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=4CjchnS02ys&feature=youtu.be"))
            startActivity(intent)
        }

        val t1subtopic7 = topic1.getSubItemView(7)
        t1subtopic7.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Input/Otuput"
        t1subtopic7.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=jNPEA88bSFU&feature=youtu.be"))
            startActivity(intent)
        }
    }

    private fun topicTwo(){
        val topic2 = mainList.createNewItem(R.layout.expanding_topic_2)
        topic2.findViewById<TextView>(R.id.topic2Title).text = "Kotlin Flow Control"
        topic2.setIndicatorColorRes(R.color.colorRoyalBlue)
        topic2.setIndicatorIconRes(R.drawable.ic_add)
        topic2.createSubItems(6)

        val t2subtopic0 = topic2.getSubItemView(0)
        t2subtopic0.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin if expression"

        val t2subtopic1 = topic2.getSubItemView(1)
        t2subtopic1.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin when Expression"

        val t2subtopic2 = topic2.getSubItemView(2)
        t2subtopic2.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin while Loop"

        val t2subtopic3 = topic2.getSubItemView(3)
        t2subtopic3.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin for Loop"

        val t2subtopic4 = topic2.getSubItemView(4)
        t2subtopic4.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin break"

        val t2subtopic5 = topic2.getSubItemView(5)
        t2subtopic5.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin continue"

    }

    private fun topicThree(){
        val topic3 = mainList.createNewItem(R.layout.expanding_topic_3)
        topic3.findViewById<TextView>(R.id.topic3Title).text = "Kotlin Functions"
        topic3.setIndicatorColorRes(R.color.colorRoyalBlue)
        topic3.setIndicatorIconRes(R.drawable.ic_add)
        topic3.createSubItems(4)

        val t3subtopic0 = topic3.getSubItemView(0)
        t3subtopic0.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin function"

        val t3subtopic1 = topic3.getSubItemView(1)
        t3subtopic1.findViewById<TextView>(R.id.subTopicTitle).text = "Infix Function Call"

        val t3subtopic2 = topic3.getSubItemView(2)
        t3subtopic2.findViewById<TextView>(R.id.subTopicTitle).text = "Default & Named Arguments"

        val t3subtopic3 = topic3.getSubItemView(3)
        t3subtopic3.findViewById<TextView>(R.id.subTopicTitle).text = "Recursion & Tail Recursion"
    }

    private fun topicFour(){
        val topic4 = mainList.createNewItem(R.layout.expanding_topic_4)
        topic4.findViewById<TextView>(R.id.topic4Title).text = "Kotlin OOP"
        topic4.setIndicatorColorRes(R.color.colorRoyalBlue)
        topic4.setIndicatorIconRes(R.drawable.ic_add)
        topic4.createSubItems(14)

        val t4subtopic0 = topic4.getSubItemView(0)
        t4subtopic0.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Class & Object"

        val t4subtopic1 = topic4.getSubItemView(1)
        t4subtopic1.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Constructors"

        val t4subtopic2 = topic4.getSubItemView(2)
        t4subtopic2.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Getters & Setters"

        val t4subtopic3 = topic4.getSubItemView(3)
        t4subtopic3.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Inheritance"

        val t4subtopic04 = topic4.getSubItemView(4)
        t4subtopic04.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Visibilty Modifiers"

        val t4subtopic5 = topic4.getSubItemView(5)
        t4subtopic5.findViewById<TextView>(R.id.subTopicTitle).text = "Infix Abstract Class"

        val t4subtopic6 = topic4.getSubItemView(6)
        t4subtopic6.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin interfaces"

        val t4subtopic7 = topic4.getSubItemView(7)
        t4subtopic7.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Nested & Inner Classes"

        val t4subtopic8 = topic4.getSubItemView(8)
        t4subtopic8.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Data Class"

        val t4subtopic9 = topic4.getSubItemView(9)
        t4subtopic9.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Sealed Class"

        val t4subtopic10 = topic4.getSubItemView(10)
        t4subtopic10.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Object"

        val t4subtopic11 = topic4.getSubItemView(11)
        t4subtopic11.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Companion Object"

        val t4subtopic12 = topic4.getSubItemView(12)
        t4subtopic12.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Extension Function"

        val t4subtopic13 = topic4.getSubItemView(13)
        t4subtopic13.findViewById<TextView>(R.id.subTopicTitle).text = "Kotlin Object"
    }
}