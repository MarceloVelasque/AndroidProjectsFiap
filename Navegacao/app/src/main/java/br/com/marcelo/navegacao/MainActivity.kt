package br.com.marcelo.navegacao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
/*import androidx.navigation.compose.composable*/
import androidx.navigation.navArgument
import br.com.marcelo.navegacao.screens.LoginScreen
import br.com.marcelo.navegacao.screens.MenuScreen
import br.com.marcelo.navegacao.screens.PedidosScreen
import br.com.marcelo.navegacao.screens.PerfilScreen
import br.com.marcelo.navegacao.ui.theme.NavegaçãoTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegaçãoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(
                        navController = navController,
                        startDestination = "login",
                        exitTransition = {
                            slideOutOfContainer(towards = AnimatedContentTransitionScope.SlideDirection.End,
                                tween(2000)
                            ) + fadeOut(animationSpec = tween(2000))
                        },
                        enterTransition = {
                            slideIntoContainer(towards = AnimatedContentTransitionScope.SlideDirection.Down,
                                animationSpec = tween(2000)
                            )
                        }
                    ) {
                        composable(route = "login") { LoginScreen(navController = navController) }

                        composable(route = "menu") {
                            MenuScreen(
                                navController = navController
                            )
                        }

                        composable(route = "pedidos") {
                            PedidosScreen(
                                navController = navController
                            )
                        }

                        composable(
                            route = "perfil/{nome}/{idade}",
                            arguments = listOf(
                                navArgument("nome") {
                                    type = NavType.StringType
                                },
                                navArgument("idade") {
                                    type = NavType.IntType
                                }
                            )
                        ) {
                            val nome: String? =
                                it.arguments?.getString(
                                    "nome",
                                    ""
                                )
                            val idade: Int? =
                                it.arguments?.getInt(
                                    "idade",
                                    0
                                )
                            PerfilScreen(
                                navController,
                                nome!!,
                                idade!!
                            )
                        }
                    }

                }

            }
        }
    }
}


