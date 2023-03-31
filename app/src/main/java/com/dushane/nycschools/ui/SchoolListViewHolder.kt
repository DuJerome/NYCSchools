package com.dushane.nycschools.ui

import android.view.View
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.dushane.nycschools.databinding.ListItemSchoolItemBinding
import com.dushane.nycschools.model.School

class SchoolListViewHolder(view: View) : ViewHolder(view){
    val binding: ListItemSchoolItemBinding = ListItemSchoolItemBinding.bind(view)
}