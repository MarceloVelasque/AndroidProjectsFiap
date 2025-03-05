package br.com.marcelo.live18_02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.marcelo.live18_02.screens.BmiScreen
import br.com.marcelo.live18_02.screens.HomeScreen
import br.com.marcelo.live18_02.ui.theme.Live1802Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Live1802Theme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "home"
                ){
                    composable(route = "home"){ HomeScreen(navController) }
                    composable(route = "bmi"){ BmiScreen(navController) }
                    composable(route = "result"){}
                }



            }
        }
    }
}

