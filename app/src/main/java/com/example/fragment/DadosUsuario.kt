package com.example.fragment
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DadosUsuario (var nome : String, var sobrenome : String) : Parcelable


