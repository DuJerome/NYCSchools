package com.dushane.nycschools.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.dushane.nycschools.model.School
import com.dushane.nycschools.repository.SchoolRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

@HiltViewModel
class SchoolViewModel @Inject constructor(
    private val schoolRepository: SchoolRepository
) : ViewModel() {
    val schools: Single<MutableList<School>> = schoolRepository.getSchool()
}