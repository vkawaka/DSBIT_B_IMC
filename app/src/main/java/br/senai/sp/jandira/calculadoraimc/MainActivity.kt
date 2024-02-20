package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            colors = CardDefaults.cardColors(Color(0xFFF9536B)),
            shape = RectangleShape
        ) {
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.imc),
                    contentDescription = "",
                    modifier = Modifier
                        .size(width = 90.dp, height = 90.dp)
                        .padding(top = 16.dp),
                    )
                Text(
                    text = "Calculadora IMC",
                    color = Color(0xffffffff),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
        }

        Card (
            modifier = Modifier
                .size(width = 280.dp, height = 380.dp)
                .offset(
                    x = 55.dp,
                    y = (-36.dp)
                ),
            colors = CardDefaults.cardColors(Color(0xFFE9E6E6)),
            elevation = CardDefaults.cardElevation(10.dp)

        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Seus dados",
                    color = Color(0xFFF9536B),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                        .padding(top =20.dp)
                    )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                ) {
                    Text(
                        text = "Seu peso",
                        color = Color(0xFFF9536B),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 6.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(46.dp),
                        placeholder = {
                            Text(
                                text = "Seu peso em kg",
                                fontSize = 11.sp,
                                color = Color.Gray
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFFFFFFF),
                            unfocusedBorderColor = Color(0xFFF9536B),
                            focusedTextColor = Color(0xFF2C2B2E),
                            unfocusedTextColor = Color(0xFF000000),
                            focusedContainerColor = Color(0xFFA7A4A4),
                            unfocusedContainerColor = Color.White
                        ),
                        )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                ) {
                    Text(
                        text = "Sua altura",
                        color = Color(0xFFF9536B),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 6.dp)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(46.dp),
                        placeholder = {
                            Text(
                                text = "Sua altura em cm",
                                fontSize = 11.sp,
                                color = Color.Gray
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFFFFFFFF),
                            unfocusedBorderColor = Color(0xFFF9536B),
                            focusedTextColor = Color(0xFF2C2B2E),
                            unfocusedTextColor = Color(0xFF000000),
                            focusedContainerColor = Color(0xFFA7A4A4),
                            unfocusedContainerColor = Color.White
                        ),
                        )
                }




                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(6.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFF9536B)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp)
                        .padding(bottom = 22.dp)
                        .height(50.dp)
                    ) {
                    Text(text = "CALCULAR")
                }
            }
        }

        Card (
            modifier = Modifier
                .size(width = 280.dp, height = 140.dp)
                .offset(
                    x = 55.dp,
                    y = 0.dp
                ),
            colors = CardDefaults.cardColors(Color(0xEE478F44)),
            border = BorderStroke(1.dp, Color(0xFFF9536B)),
            elevation = CardDefaults.cardElevation(6.dp)
        ){
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(22.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column (
                    modifier = Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "Resultado",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Peso ideal",
                        color = Color.White,
                        fontSize = 26.sp
                    )
                }
                Text(
                    text = "21.3",
                    fontSize = 48.sp,
                    color = Color.White
                )
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraImcTheme {
        Greeting()
    }
}