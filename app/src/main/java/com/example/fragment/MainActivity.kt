package com.example.fragment

// Imports :
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.fragment.fragments.ChamadasFragment
import com.example.fragment.fragments.ConversasFragment
import com.example.fragment.fragments.PerfilFragment
import com.example.fragment.fragments.StatusFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Definindo elementos :
        lateinit var imagemPerfil     : ImageView
        lateinit var textoOla         : TextView
        lateinit var textoNomeUsuario : TextView
        lateinit var botaoConversas   : AppCompatButton
        lateinit var botaoStatus      : AppCompatButton
        lateinit var botaoChamadas    : AppCompatButton

        // Função que de criação :
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Incializando elementos :
        imagemPerfil   = findViewById(R.id.imagemPerfil)
        textoOla       = findViewById(R.id.textoOla)
        textoNomeUsuario = findViewById(R.id.textoNomeUsuario)
        botaoConversas = findViewById(R.id.botaoConversas)
        botaoStatus    = findViewById(R.id.botaoStatus)
        botaoChamadas  = findViewById(R.id.botaoChamas)

        // Recenbendo dados da intent :
        var informacaoUsuario = intent.extras

        // Verificando a versao do android :
        if ( Build.VERSION.SDK_INT >= 33 ) {

            // Recebendo selecionando os dados da informacaoUsuario e selecionando a chave
            var nome  = informacaoUsuario?.getParcelable( "dadosUsuario", DadosUsuario::class.java )

            if ( nome != null ) {

                // Fazendo as subistituições de texto :
                textoOla.text = "Olá, "
                textoNomeUsuario.text = nome.nome

            }

        }

        // Definindo clique do botão :
        botaoConversas.setOnClickListener {

            val conversasFragment = ConversasFragment()
            trocaFragmentLayout( conversasFragment )

        }

        // Definindo clique do botão :
        botaoStatus.setOnClickListener {

            val statusFragment = StatusFragment()
            trocaFragmentLayout( statusFragment )

        }

        // Definindo clique do botão :
        botaoChamadas.setOnClickListener {

            val chamadaFragment = ChamadasFragment()
            trocaFragmentLayout( chamadaFragment )

        }

        // Defindo clique da imagem de perfil :
        imagemPerfil.setOnClickListener {

            val perfilFragment = PerfilFragment()
            trocaFragmentLayout ( perfilFragment )

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Função que gerencia a troca de fragments :
    private fun trocaFragmentLayout(escolhaFragment : Fragment ) {

        var fragmentEscolhido = escolhaFragment

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerMain, fragmentEscolhido)
            .commit()

    }
}