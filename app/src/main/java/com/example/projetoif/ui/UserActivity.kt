package com.example.projetoif.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.projetoif.R
import com.example.projetoif.databinding.UserMainBinding
import com.example.projetoif.infra.MotivationConstants
import com.example.projetoif.infra.SecurityPreferences

class UserActivity : AppCompatActivity() {
    private lateinit var binding: UserMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.salvar.setOnClickListener {
            handleSave()
        }

        verifyUserName()

    }

    private fun verifyUserName() {
        val intent = Intent(this, MainActivity::class.java)
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        if (name != "") {
            startActivity(intent)

            finish()
        }
    }

    private fun handleSave() {
        val intent = Intent(this, MainActivity::class.java)
        val nome = binding.nome.text.toString()
        if (nome != "") {

            SecurityPreferences(this).storeString(MotivationConstants.KEY.USER_NAME, nome)

            startActivity(intent)

            finish()

        } else {
            Toast.makeText(this, R.string.digite_seu_nome, Toast.LENGTH_LONG).show()
        }
    }


}