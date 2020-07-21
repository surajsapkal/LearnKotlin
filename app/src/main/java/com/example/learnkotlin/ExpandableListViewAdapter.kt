package com.example.learnkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView

class ExpandableListViewAdapter internal constructor(private val context: Context, private val topicList: List<String>,
                                                     private val subTopicList: HashMap<String,List<String>>): BaseExpandableListAdapter(){
    override fun getGroup(groupPosition: Int): Any {
        return topicList[groupPosition]
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        val topicTitle = getGroup(groupPosition) as String

        if (convertView == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.topic_list, null)
        }
        val topicTv = convertView!!.findViewById<TextView>(R.id.tv_topic)
        topicTv.setText(topicTitle)

        return convertView
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.subTopicList[this.topicList[groupPosition]]!!.size
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.subTopicList[this.topicList[groupPosition]]!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        val subTopicTitle = getChild(groupPosition,childPosition) as String

        if (convertView == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.sub_topic_list, null)
        }
        val subTopicTv = convertView!!.findViewById<TextView>(R.id.tv_sub_topic)
        subTopicTv.setText(subTopicTitle)

        return convertView
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getGroupCount(): Int {
        return topicList.size
    }
}