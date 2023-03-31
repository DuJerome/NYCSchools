package com.dushane.nycschools

sealed class Screen(val route: String){
    object SchoolListScreen: Screen ("school_list")
    object SATScores: Screen ("sat_scores")
}
