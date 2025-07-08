package com.example.fragment.fragments

// Imports :
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.R

// Criando uma classe que herda de fragment :
class StatusFragment : Fragment() {

    // Criando uma função que infla o layout do fragment :
    override fun onCreateView(

        inflater : LayoutInflater,
        container : ViewGroup?,
        savedInstanceState : Bundle?

    ): View? {

        // Inflando e definindo o layout em um variavel :
        val view = inflater.inflate( R.layout.fragment_status , container , false )

        // Retornando a variavel de inflação :
        return view

    }
}