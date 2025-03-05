package br.com.marcelo.columnserows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.marcelo.columnserows.ui.theme.ColumnsERowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnsERowsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                    ) {
                    LayoutScreen()
                    }
            }
        }
    }
}

@Composable
fun LayoutScreen(){
    // Column principal
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize() // Para ocupar toda a tela
    ) {
        // Cabeçalho
        Column(
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(150.dp)
                .border(2.dp, Color.Black) // Borda para destaque
                .shadow(4.dp) // Sombra para profundidade
        ) {
            Text(
                text = "Bem-vindo à Tela Criativa",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )
        }

        // Seção com imagem e texto
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.Green)
                .padding(16.dp)
        ) {
            // Substitua R.drawable.sua_imagem pelo ID da sua imagem real
            Image(
                painter = painterResource(id = android.R.drawable.ic_menu_gallery),
                contentDescription = "Imagem de destaque",
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(8.dp)) // Bordas arredondadas
            )
            Spacer(modifier = Modifier.width(16.dp)) // Espaço entre imagem e texto
            Text(
                text = "Explore algo novo!",
                color = Color.White,
                fontSize = 18.sp,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        // Seção com duas colunas
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.Yellow)
        ) {
            // Coluna vermelha
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.3f) // Proporção de 30% da largura
                    .padding(8.dp)
                    .background(Color.Red)
            ) {
                Text(
                    text = "Destaque 1",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }
            // Coluna azul com botão
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.7f) // Proporção de 70% da largura
                    .padding(8.dp)
                    .background(Color.Blue)
            ) {
                Text(
                    text = "Destaque 2",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(8.dp)
                )
                Button(
                    onClick = { /* Adicione sua ação aqui */ },
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text("Clique Aqui")
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun LayoutScreenPreview() {
    
}