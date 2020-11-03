package com.liid.model

import java.io.Serializable

data class Course (
    val title: String = "Ideación ágil sobre innovación educativa en ambientes virtuales y a distancia",
    val start_date : String = "Del 8 al 20 de marzo",
    val duration : String = "8 horas"
) : Serializable