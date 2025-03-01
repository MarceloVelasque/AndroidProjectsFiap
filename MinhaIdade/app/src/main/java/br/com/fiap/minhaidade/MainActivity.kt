package br.com.fiap.minhaidade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.media3.common.util.Log
import br.com.fiap.minhaidade.ui.theme.MinhaIdadeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MinhaIdadeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MeuComponente()

                }
            }
        }
    }
}


@Composable
fun MeuComponente() {

    var idade = remember {
        mutableStateOf(value = 0)
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){

        Text(text = "Qual sua idade?", color = Color.Red, fontSize = 24.sp,
            fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth() )

        Text(text = "Pressione os Botões para informar sua idade",
            fontSize = 12.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center,
           // modifier = Modifier.fillMaxWidth()
            )
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text = "${idade.value}", fontSize = 48.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,
            //modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(25.dp))

        Row(horizontalArrangement = Arrangement.Center
            ,modifier = Modifier.fillMaxWidth()) {

            Button(onClick = {
                idade.value--
                Log.i("FIAP","MeuComponente ${idade.value}")}
            ,
                modifier = Modifier.size(84.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(color = 0xFF88c6a5)),
                shape = RectangleShape
            ){
                Text(text = "-")
            }
            Spacer(modifier = Modifier.width(25.dp))
            Button(onClick = { idade.value++
                             Log.i("FIAP","MeuComponente ${idade.value}")},
                modifier = Modifier.size(84.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(color = 0xFF88c6a5)),
                shape = RectangleShape) {
                Text(text = "+")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MeuComponentePReview() {
    MeuComponente()
    
}