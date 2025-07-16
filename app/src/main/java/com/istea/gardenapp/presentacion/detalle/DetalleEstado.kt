package com.istea.gardenapp.presentacion.detalle

import com.istea.gardenapp.repository.Cuidado
import com.istea.gardenapp.repository.Planta

sealed class DetalleEstado {
    data object Vacio: DetalleEstado()
    data object Cargando: DetalleEstado()
    data class Resultado( val planta: Planta) :DetalleEstado()
    data class Error(val mensaje: String): DetalleEstado()
}