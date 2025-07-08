package com.example.fragment.fragments

// Imports :
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.R

// Criando uma classe que herda de fragment :
class ConversasFragment : Fragment() {

    // Criando uma função que infla o layout do fragment :
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflando o fragmento e definindo o layout :
        val view = inflater.inflate(

            R.layout.fragment_conversas,
            container,
            false

        )

        // Retornando a variavel de inflação :
        return view

    }

}