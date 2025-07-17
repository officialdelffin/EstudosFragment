package com.example.fragment.fragments

// Imports :
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.fragment.DadosUsuario
import com.example.fragment.MainActivity
import com.example.fragment.R

// Criando uma classe que herda de fragment :
class PerfilFragment : Fragment() {

    // Defininfo os tipos dos elementos :
    private lateinit var editNome      : EditText
    private lateinit var editSobrenome : EditText
    private lateinit var botaoSalvar   : AppCompatButton

    // Função que infla o layout do fragment :
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflando o fragmento e definindo o layout :
        val view = inflater.inflate( R.layout.fragment_perfil, container, false )

        // Inicializando e vinculando os elementos :
        editSobrenome = view.findViewById( R.id.editSobrenome )
        editNome      = view.findViewById( R.id.editNome )
        botaoSalvar   = view.findViewById( R.id.botaoSalvar )

        // Ao clicar o botao salvar :
        botaoSalvar.setOnClickListener {

            // Armazenando os dados dos campos em variaveis :
            var nome      = editNome.text.toString()
            var sobrenome = editSobrenome.text.toString()

            // Recenbendo dados para a variavel que vai transferir os dados :
            var dadosUsuario = DadosUsuario(nome,sobrenome)

            // Enviando dados para a MainActivity :
            var caminhoActivityMain = Intent( activity, MainActivity::class.java )
            caminhoActivityMain.putExtra( "dadosUsuario", dadosUsuario )

        }


        // Retornando a variavel de inflação :
        return view

    }
}