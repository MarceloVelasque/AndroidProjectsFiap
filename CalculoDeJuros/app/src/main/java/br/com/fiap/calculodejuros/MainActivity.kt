package br.com.fiap.calculodejuros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.fiap.calculodejuros.juros.JurosScreen
import br.com.fiap.calculodejuros.juros.JurosScreenViewModel
import br.com.fiap.calculodejuros.ui.theme.CalculoDeJurosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculoDeJurosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JurosScreen(JurosScreenViewModel())
                }
            }
        }
    }
}













// -----------CÓDIGO ANTERIOR VERBOSO,----------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------------
//o que foi feito? foi criado componentes para as caixas de texto em um arquivo aonde tem uma função com os
// parâmetros , assim foi feito para o card também, deixando o código menos verboso
//facilitando amanutenção e agilidade de desenvolvimento, foi pegado toda a função que seria o componente
//pai e foi também criado um arquivo só pra ele




/*
@Composable
fun JurosScreen() {

    var capital by remember { mutableStateOf("") }
    var taxa by remember { mutableStateOf("") }
    var tempo by remember { mutableStateOf("") }
    var juros by remember { mutableStateOf(0.0) }
    var montante by remember { mutableStateOf(0.0) }

    Box(
        modifier = Modifier.padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Text(
                text = "Cálculo de Juros Simples",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 20.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(32.dp))
            // Formulário para entrada de dados
            Card(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Dados do Investimento",
                        fontWeight = FontWeight.Bold
                    )

                    //foi criado um componente caixa de entrada substituindo
                    // todo o código a cima, deixando menos verboso
                    // Caixas de entrada da Aplicação
                    CaixaDeEntrada(
                        value = capital,
                        placeholder = "Quanto deseja investir",
                        label = "Valor do investimento",
                        modifier = Modifier,
                        keyboardType = KeyboardType.Decimal
                    ) {
                        capital = it
                    }
                    CaixaDeEntrada(
                        value = taxa,
                        placeholder = "Qual a taxa de juros mensal?",
                        label = "Taxa de juros mensal",
                        modifier = Modifier,
                        keyboardType = KeyboardType.Decimal
                    ) {
                        taxa = it
                    }
                    CaixaDeEntrada(
                        value = tempo,
                        placeholder = "Qual o período do investimento em meses?",
                        label = "Período em meses",
                        modifier = Modifier,
                        keyboardType = KeyboardType.Decimal
                    ) {
                        tempo = it
                    }

                    Button(
                        onClick = {
                            juros = calcularJuros(
                                capital = capital.toDouble(),
                                taxa = taxa.toDouble(),
                                tempo = tempo.toDouble()
                            )
                            montante = calcularMontante(
                                capital = capital.toDouble(),
                                juros = juros
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 32.dp)
                    ) {
                        Text(text = "CALCULAR")
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            // Resultado da aplicação
            CardResultado(juros, montante)
*/



            /* OutlinedTextField(
               value = capital,
               onValueChange = { capital = it },
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(top = 16.dp),
               placeholder = {
                   Text(text = "Quanto deseja investir?")
               },
               label = {
                   Text(text = "Valor do investimento")
               },
               keyboardOptions = KeyboardOptions(
                   keyboardType = KeyboardType.Decimal
               )
           )*/


            /*    OutlinedTextField(
                    value = taxa,
                    onValueChange = { taxa = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    placeholder = {
                        Text(text = "Qual a taxa de juros mensal?")
                    },
                    label = {
                        Text(text = "Taxa de juros mensal")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Decimal
                    )
                )
                OutlinedTextField(
                    value = tempo,
                    onValueChange = { tempo = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    placeholder = {
                        Text(text = "Qual o tempo em meses?")
                    },
                    label = {
                        Text(text = "Período em meses")
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Decimal
                    )
                )*/

            /*  Button(
                  onClick = {
                      juros = calcularJuros(
                          capital = capital.toDouble(),
                          taxa = taxa.toDouble(),
                          tempo = tempo.toDouble()
                      )
                      montante = calcularMontante(
                          capital = capital.toDouble(),
                          juros = juros
                      )
                  },
                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(top = 32.dp)
              ) {
                  Text(text = "CALCULAR")
              }
          }
      }
      Spacer(modifier = Modifier.height(16.dp))
  */

            /*Card(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF4CAF50)
                )
            ) {
                Column(
                    modifier = Modifier
                        //.fillMaxSize()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Resultado",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Juros",
                            modifier = Modifier.padding(end = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = juros.toString(),
                            modifier = Modifier.padding(end = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Montante",
                            modifier = Modifier.padding(end = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = montante.toString(),
                            modifier = Modifier.padding(end = 8.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }*/
   /*     }
    }
}*/