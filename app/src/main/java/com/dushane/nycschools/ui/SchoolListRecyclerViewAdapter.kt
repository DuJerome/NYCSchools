package com.dushane.nycschools.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.dushane.nycschools.R
import com.dushane.nycschools.model.School

class SchoolListRecyclerViewAdapter constructor(
    private val context: Context?
): ListAdapter<School, SchoolListViewHolder>(DiffUtilCallback) {
    object DiffUtilCallback : DiffUtil.ItemCallback<School>() {

        override fun areContentsTheSame(oldItem: School, newItem: School): Boolean {
            return oldItem == newItem
        }

        override fun areItemsTheSame(oldItem: School, newItem: School): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolListViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_school_item, parent, false)
        return SchoolListViewHolder(view)
    }

    override fun onBindViewHolder(holder: SchoolListViewHolder, position: Int) {
        val itemData = getItem(position)
        holder.binding.schoolName.text = itemData.school_name
        holder.binding.borough.text = itemData.borough
        holder.binding.location.text = itemData.location
        holder.binding.overviewParagraph.text = itemData.overview_paragraph
    }
}