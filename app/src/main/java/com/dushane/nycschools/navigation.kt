package com.dushane.nycschools

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.navigation.NavController
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

@Composable
fun navigation(
    navController: NavHostController = rememberNavController(),
    startDestination: String = "school_list"
) {

    NavHost(
        navController,
        startDestination = Screen.SchoolListScreen.route
    ) {
        composable(
            route = Screen.SchoolListScreen.route
        ) {
            SchoolsListFragment()
        }

        composable(route = Screen.SATScores.route) {
            SATScoresListFragment()
        }
    }
}

@Composable
fun SchoolListScreen(
    onNavigateToSATScore: () -> Unit
) {
    Button(onClick = onNavigateToSATScore)
}