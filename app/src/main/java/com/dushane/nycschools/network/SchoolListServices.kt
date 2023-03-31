package com.dushane.nycschools.network

import com.dushane.nycschools.model.School
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface SchoolListServices {

    @GET("s3k6-pzi2.json")
    fun getSchoolList(): Single<MutableList<School>>
}