package com.example.atividadecalculadora

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class Calculo() {
    var n1 by mutableStateOf("")
    var n2 by mutableStateOf("")
    var total by mutableStateOf("0")
    var operacao by mutableStateOf("")

    fun adicionarNumero(digito: String) {
        if (operacao.isEmpty()) {
            n1 += digito
        } else {
            n2 += digito
        }
    }

    fun selecionarOperacao(op: String) {
        if (n1.isNotEmpty()) {
            operacao = op
        }
    }

    fun calcular() {
        if (n1.isNotEmpty() && n2.isNotEmpty() && operacao.isNotEmpty()) {
            val num1 = n1.toInt()
            val num2 = n2.toInt()
            total = when (operacao) {
                "+" -> (num1 + num2).toString()
                "-" -> (num1 - num2).toString()
                "*" -> (num1 * num2).toString()
                "/" -> if (num2 != 0) (num1 / num2).toString() else "0"
                else -> "0"
            }
            n1 = total
            n2 = ""
            operacao = ""
        }
    }
    fun clear(){
        n1 = ""
        n2 = ""
        total = "0"
        operacao = ""
    }

}