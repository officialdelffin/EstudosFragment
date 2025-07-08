package com.example.fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.fragment.fragments.ChamadasFragment
import com.example.fragment.fragments.ConversasFragment
import com.example.fragment.fragments.StatusFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // Definindo elementos :
        lateinit var botaoConversas : AppCompatButton
        lateinit var botaoStatus    : AppCompatButton
        lateinit var botaoChamadas  : AppCompatButton

        // Função que de criação :
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Incializando elementos :
        botaoConversas = findViewById(R.id.botaoConversas)
        botaoStatus    = findViewById(R.id.botaoStatus)
        botaoChamadas  = findViewById(R.id.botaoChamas)

        // Definindo clique do botão :
        botaoConversas.setOnClickListener {

            val conversasFragment = ConversasFragment()
            trocaFragment( conversasFragment )

        }

        // Definindo clique do botão :
        botaoStatus.setOnClickListener {

            val statusFragment = StatusFragment()
            trocaFragment( statusFragment )

        }

        // Definindo clique do botão :
        botaoChamadas.setOnClickListener {

            val chamadsFragment = ChamadasFragment()
            trocaFragment( chamadsFragment )

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Função que gerencia a troca de fragments :
    private fun trocaFragment( escolhaFragment : Fragment ) {

        var fragmentEscolhido = escolhaFragment

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerConversas, fragmentEscolhido)
            .commit()

    }
}