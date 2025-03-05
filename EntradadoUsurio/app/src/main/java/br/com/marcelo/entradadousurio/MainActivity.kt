package br.com.marcelo.entradadousurio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.marcelo.entradadousurio.ui.theme.EntradaDoUsuárioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EntradaDoUsuárioTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Greeting()


                }
            }
        }
    }
}
//PAREI NO INICIO MAIS CORES PARA TEXTFIELD
@Composable
fun Greeting() {

    var textos by remember {
        mutableStateOf("")
    }

    var idade by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var kotlin by remember {
        mutableStateOf(false)
    }

    var java by remember {
        mutableStateOf(false)
    }

    var cSharp by remember {
        mutableStateOf(false)
    }

   /* var cor by remember {
        mutableStateOf(Color.White)
    }*/
Column(modifier = Modifier.fillMaxWidth()) {
    Column(modifier = Modifier.padding(32.dp)) {
        TextField(
            value = idade,
            onValueChange = { letra ->
                idade = letra
            },
            shape = RoundedCornerShape(topStart = 32.dp, bottomEnd = 32.dp),
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Qual o seu nome?")
            },
            placeholder = {
                Text(text = "Digite o nome e sobrenome")
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_ac_unit_24),
                    contentDescription = "ícone de configuração"
                )
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.person_24),
                    contentDescription = "ícone de configuração"
                )
            },
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Words)


        )
        TextField(
            value = textos,
            onValueChange = { letra ->
                textos = letra
            },

            modifier = Modifier.fillMaxWidth().padding(top = 32.dp),
            label = {
                Text(text = "Qual sua idade?")
            },
            placeholder = {
                Text(text = "Digite um número")
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "ícone home"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            textStyle = TextStyle(
                /* color = Color.Red,*/
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End
            ),
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.Magenta,
                unfocusedTextColor = Color.Gray,
                cursorColor = Color.Red
            ),
            shape = RoundedCornerShape(topStart = 32.dp, bottomEnd = 32.dp)

        )
        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            email, onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            label = {
                Text(text = "Qual seu e-mail?")
            },
            placeholder = {
                Text(text = "Digite o seu e-mail.")
            },
            shape = RoundedCornerShape(topStart = 32.dp, bottomEnd = 32.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Magenta,
                unfocusedBorderColor = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(32.dp))


        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = kotlin, onCheckedChange = { isSelected ->
                    kotlin = isSelected
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Magenta
                )
            )
            Text(text = "Kotlin")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = java, onCheckedChange = {
                    java = it

                },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Magenta
                )
            )
            Text(text = "Java")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = cSharp, onCheckedChange = { isSelected ->
                    cSharp = isSelected

                }, colors = CheckboxDefaults.colors(
                    checkedColor = Color.Blue,
                    uncheckedColor = Color.Magenta
                )
            )
            Text(text = "C#")
        }
        Spacer(modifier = Modifier.height(32.dp))


        var linguagemSelecionada by remember {
            mutableStateOf(0)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                linguagemSelecionada == 0, onClick = { linguagemSelecionada = 0 },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Blue,
                    unselectedColor = Color.Magenta
                )
            )
            Text(text = "Windows")

            RadioButton(
                linguagemSelecionada == 1, onClick = {
                    linguagemSelecionada = 1
                },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Blue,
                    unselectedColor = Color.Magenta
                )
            )
            Text(text = "Linux")

            RadioButton(
                linguagemSelecionada == 2, onClick = {
                    linguagemSelecionada = 2
                },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Blue,
                    unselectedColor = Color.Magenta
                )
            )
            Text(text = "MacOS")
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { }, // para mudar a cor onClick = { cor = Color.Red }
                modifier = Modifier.size(width = 150.dp, height = 150.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
                border = BorderStroke(4.dp, Color.Magenta),
                shape = CircleShape
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Text(text = "Avançar")
                  /*  Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "Check")*/
                }

            }
           /* OutlinedButton(onClick = { cor = Color.Cyan }) {
                Text(text = "Avançar")
            }*/
        }

    }
}


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EntradaDoUsuárioTheme {
        Greeting()
    }
}