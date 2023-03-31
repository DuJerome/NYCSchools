package com.dushane.nycschools

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dushane.nycschools.ui.SATScoresListFragment
import com.dushane.nycschools.ui.SchoolsListFragment
import com.dushane.nycschools.ui.viewmodel.SchoolViewModel
import javax.inject.Inject

@Composable
fun navgraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = destinations.SCHOOL_LIST_ROUTE
) {
    NavHost(
        navController = navController,
        startDestination
    ){
        composable(destinations.SCHOOL_LIST_ROUTE) {
            val schoolViewModel = viewModelFactory {
                InitializerViewModelFactoryBuilder().build().create(SchoolViewModel::class.java)
            }
            SchoolsListFragment()
        }

        composable(destinations.SAT_SCORES_LIST_ROUTE) {
            val schoolViewModel = viewModelFactory {
                InitializerViewModelFactoryBuilder().build().create(SchoolViewModel::class.java)
            }
            SATScoresListFragment()
        }
    }
}