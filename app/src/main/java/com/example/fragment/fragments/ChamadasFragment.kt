package com.example.fragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.R

// Criando uma classe que herda de Fragment :
class ChamadasFragment : Fragment() {

    //Criando a função que infla o layout do fragment :
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflando o frangment e armazenando em uma variavel :
        val view = inflater.inflate( R.layout.fragment_chamadas , container , false )

        // Retornando a variavel de inflação :
        return view

    }

}