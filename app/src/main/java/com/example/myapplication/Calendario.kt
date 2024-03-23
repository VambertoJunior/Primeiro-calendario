package com.example.myapplication

import java.util.Calendar

class Calendario {
    private var data: Calendar = Calendar.getInstance()

    fun diaDaSemana(): String{
        val dias = arrayListOf("DOMINGO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SÁBADO")

        return dias[this.data.get(Calendar.DAY_OF_WEEK_IN_MONTH)]
    }
}