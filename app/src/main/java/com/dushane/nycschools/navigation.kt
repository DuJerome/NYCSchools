package com.dushane.nycschools

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavigatorProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.dynamicfeatures.DynamicGraphNavigator
import androidx.navigation.dynamicfeatures.DynamicInstallManager
import com.dushane.nycschools.ui.SATScoresListFragment
import com.dushane.nycschools.ui.SchoolsListFragment
import com.google.android.play.core.splitinstall.SplitInstallManager

object destinations {
    const val SCHOOL_LIST_ROUTE = "school_list"
    const val SAT_SCORES_LIST_ROUTE = "sat_scores_list"
}

class navigation(
    context: Context,
    navController: NavHostController = NavHostController(context = context),
) {
    val navigateToSchoolsList: () -> Unit = {
        navController.navigate(destinations.SCHOOL_LIST_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    val navigateToSATScoresList: () -> Unit = {
        navController.navigate(destinations.SAT_SCORES_LIST_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}