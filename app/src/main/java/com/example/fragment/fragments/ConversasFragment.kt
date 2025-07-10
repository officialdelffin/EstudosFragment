package com.example.fragment.fragments

// Imports :
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.R

// Criando uma classe que herda de fragment :
class ConversasFragment : Fragment() {

    // Chamando a função que associa o fragment com a activity :
    override fun onAttach(context: Context) {

        super.onAttach(context)
        Log.i("Ciclo de vida", "onAttach")

    }

    // Chamando a função que cria o fragment :
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Log.i("Ciclo de vida", "onCreate")
    }

    // Chamando uma função que infla o layout do fragment :
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

    // Chamando  a função que podemos implementar algo assim que o layout é criado :
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        Log.i("Ciclo de vida", "onViewCreated")

    }

    //  Chamando a função quando é visivel mas não tem interação com o usuário :
    override fun onStart() {

        super.onStart()
        Log.i("Ciclo de vida", "onStart")


    }

    // Chamando a função depois que ela esta visivel e interativa
    override fun onResume() {

        super.onResume()
        Log.i("Ciclo de vida", "onResume")

    }

    // Chamando a função quando o fragment não esta sendo utilizado mas ainda é visivel :
    override fun onPause() {

        super.onPause()
        Log.i("Ciclo de vida", "onPause")

    }

    // Chamando a função quando o fragment não é mais visivel :
    override fun onStop() {

        super.onStop()
        Log.i("Ciclo de vida", "onStop")

    }

    // Chamando a função quando a view do fragment é destruida mas ainda exixte o fragment :
    override fun onDestroyView() {

        super.onDestroyView()
        Log.i("Ciclo de vida", "onDestroyView")

    }

    // Chamando a função quando o fragment esta sendo destruido :
    override fun onDestroy() {

        super.onDestroy()
        Log.i("Ciclo de vida", "onDestroy")

    }

    // Chamando a função que desanexa o fragment da activity :
    override fun onDetach() {

        super.onDetach()
        Log.i("Ciclo de vida", "onDetach")

    }
}