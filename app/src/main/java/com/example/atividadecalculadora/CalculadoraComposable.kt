package com.example.atividadecalculadora

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Resultado(calculo: Calculo){
    Column{
        Text(
            text = "${calculo.total}",
            fontSize = 40.sp
        )
    }
}

@Composable
fun Operacao(calculo: Calculo){
    Column {
        Text(
            text = "${calculo.n1} ${calculo.operacao} ${calculo.n2}",
            fontSize = 30.sp,
            color = Color.Gray,
        )
    }
}


@Composable
fun Calculadora(calculo: Calculo){
    Column {
        Row {
            Button(onClick = {calculo.adicionarNumero("1")}, modifier = Modifier.weight(1f)) {

                Text(text= "1", fontSize = 20.sp)
            }
            Button(onClick = {calculo.adicionarNumero("2")}, modifier = Modifier.weight(1f)) {
                Text(text= "2", fontSize = 20.sp)
            }
            Button(onClick = {calculo.adicionarNumero("3")}, modifier = Modifier.weight(1f)) {
                Text(text= "3", fontSize = 20.sp)
            }
            Button(onClick = {calculo.selecionarOperacao("+")}, modifier = Modifier.weight(1f)) {
                Text(text= "+", fontSize = 20.sp)
            }
        }
        Row {
            Button(onClick = {calculo.adicionarNumero("4")}, modifier = Modifier.weight(1f)) {

                Text(text= "4", fontSize = 20.sp)
            }
            Button(onClick = {calculo.adicionarNumero("5")}, modifier = Modifier.weight(1f)) {
                Text(text= "5", fontSize = 20.sp)
            }
            Button(onClick = {calculo.adicionarNumero("6")}, modifier = Modifier.weight(1f)) {
                Text(text= "6", fontSize = 20.sp)
            }
            Button(onClick = {calculo.selecionarOperacao("-")}, modifier = Modifier.weight(1f)) {
                Text(text= "-", fontSize = 20.sp)
            }
        }
        Row {
            Button(onClick = {calculo.adicionarNumero("7")}, modifier = Modifier.weight(1f)) {

                Text(text= "7", fontSize = 20.sp)
            }
            Button(onClick = {calculo.adicionarNumero("8")}, modifier = Modifier.weight(1f)) {
                Text(text= "8", fontSize = 20.sp)
            }
            Button(onClick = {calculo.adicionarNumero("9")}, modifier = Modifier.weight(1f)) {
                Text(text= "9", fontSize = 20.sp)
            }
            Button(onClick = {calculo.selecionarOperacao("*")}, modifier = Modifier.weight(1f)) {
                Text(text= "*", fontSize = 20.sp)
            }
        }
        Row {
            Button(onClick = {calculo.clear()}, modifier = Modifier.weight(1f)) {
                Text(text= "C", fontSize = 20.sp)
            }
            Button(onClick = {calculo.adicionarNumero("0")}, modifier = Modifier.weight(1f)) {
                Text(text= "0", fontSize = 20.sp)
            }
            Button(onClick = {calculo.calcular()}, modifier = Modifier.weight(1f)) {
                Text(text= "=", fontSize = 20.sp)
            }
            Button(onClick = {calculo.selecionarOperacao("/")}, modifier = Modifier.weight(1f)) {
                Text(text= "/", fontSize = 20.sp)
            }
        }
    }

}




@Composable
fun CalculadoraView(calculo1: Calculo){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 6.dp, end = 16.dp),
            horizontalArrangement = Arrangement.End
        ){
            Resultado(calculo1)
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 27.dp, end = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Operacao(calculo1)
        }
        Row (
            horizontalArrangement = Arrangement.Center
        ) {
            Calculadora(calculo1)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun CalculadorePreview(){
    val calculo1 = Calculo()
    CalculadoraView(calculo1)
}