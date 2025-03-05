package br.com.marcelo.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.marcelo.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutsTheme {
                Surface(
                    modifier = Modifier.size(width = 200.dp, height = 200.dp),
                    color = Color.Green,
                    shape = RoundedCornerShape(topEnd = 32.dp, bottomStart = 32.dp),
                    shadowElevation = 4.dp,
                    border = BorderStroke(width = 4.dp, color = Color.Black)
                ) {
                    Box(
                        contentAlignment = Alignment.Center

                    ){

                        Button(onClick = {}) {
                            Text(text = "Clique-me")
                        }
                        Text(text = "FIAP",
                            modifier = Modifier.align(Alignment.BottomCenter))
                    }
                }

                }
            }
        }
    }

