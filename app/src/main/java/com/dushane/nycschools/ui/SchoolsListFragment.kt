package com.dushane.nycschools.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dushane.nycschools.R
import com.dushane.nycschools.databinding.FragmentSchoolsListBinding
import com.dushane.nycschools.ui.viewmodel.SchoolViewModel
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.rxjava3.schedulers.Schedulers

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
@AndroidEntryPoint
class SchoolsListFragment : Fragment(R.layout.fragment_schools_list) {

    private val binding = FragmentSchoolsListBinding.inflate(layoutInflater)
    private val adapter = SchoolListRecyclerViewAdapter(context)
    private val schoolViewModel = viewModels<SchoolViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val data = schoolViewModel.value.schools.observeOn(Schedulers.io()).blockingGet()
        binding.recyclerView.adapter = adapter
        adapter.submitList(data)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}