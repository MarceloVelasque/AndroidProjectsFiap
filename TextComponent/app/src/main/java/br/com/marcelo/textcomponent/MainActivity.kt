package br.com.marcelo.textcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.marcelo.textcomponent.ui.theme.Kablammo
import br.com.marcelo.textcomponent.ui.theme.TextComponentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextComponentTheme {
                Surface( modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ){
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(modifier = Modifier.background(Color(146,36,105, 255))
            .border(border = BorderStroke(1.dp, color = Color.Blue))
            .padding(vertical = 32.dp)
           /* .width(200.dp)*/
            .align(Alignment.CenterHorizontally)
            .fillMaxWidth(),
            text = "Estudando programação android",
            fontSize = 12.sp,
            color = Color(0xFFE7C05C),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            letterSpacing = 4.sp,
            fontFamily = Kablammo
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Greeting()


}