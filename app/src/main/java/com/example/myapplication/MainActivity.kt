package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.Calendario


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                            .verticalScroll(rememberScrollState())
                    )
                    {
                        DiaDaSemanaLinha();
                        DiaDaSemanaColuna();
                        Spacer(modifier = Modifier.height(100.dp))
                        NomeCompleto();
                    }
                }
            }
        }
    }


    @Composable
    fun DiaDaSemanaLinha() {
        val hoje = Calendario().diaDaSemana()
        Row {
            Text(
                text = "Dia 1: $hoje",
                color = Color.Blue,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Dia 2: $hoje",
                color = Color.Green,
                modifier = Modifier
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DiaDaSemanaLinhaPreview() {
        MyApplicationTheme {
            DiaDaSemanaLinha()
        }
    }

    @Composable
    fun DiaDaSemanaColuna() {
        val hoje = Calendario().diaDaSemana()
        Column {
            Text(
                text = "Dia 1: $hoje",
                color = Color.White,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Dia 2: $hoje",
                color = Color.Gray,
                modifier = Modifier
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DiaDaSemanaColunaPreview() {
        MyApplicationTheme {
            DiaDaSemanaColuna()
        }
    }

    @Composable
    fun NomeCompleto(nome:String){
        Text(
            text = "Nome: $nome",
            color = Color.White,
            modifier = Modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun NomeCompleto() {
        MyApplicationTheme {
            NomeCompleto("Vamberto Pereira da Silva Junior")
        }
    }
}