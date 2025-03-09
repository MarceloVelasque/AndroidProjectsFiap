package br.com.marcelo.navegacao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.marcelo.navegacao.screens.LoginScreen
import br.com.marcelo.navegacao.screens.MenuScreen
import br.com.marcelo.navegacao.screens.PedidosScreen
import br.com.marcelo.navegacao.screens.PerfilScreen
import br.com.marcelo.navegacao.ui.theme.NavegaçãoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegaçãoTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController, startDestination = "login"
                    ) {
                        composable(route = "login") { LoginScreen(navController = navController) }

                        composable(route = "menu") { MenuScreen(
                            navController = navController
                        ) }

                        composable(route = "pedidos") { PedidosScreen(
                            navController = navController
                        ) }

                        composable(route = "perfil") { PerfilScreen(
                            navController = navController
                        ) }
                    }

                }

                }
            }
        }
    }


