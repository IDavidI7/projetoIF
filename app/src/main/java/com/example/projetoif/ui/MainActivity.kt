package com.example.projetoif.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.example.projetoif.R
import com.example.projetoif.data.Mock
import com.example.projetoif.infra.MotivationConstants
import com.example.projetoif.infra.SecurityPreferences
import com.example.projetoif.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var categorhId = MotivationConstants.CATEGORY.tablet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        handleFilter(binding.tablet)

        handlePhrase()

        eventOfClick()

        hangleUserName()
    }

    @SuppressLint("SetTextI18n")
    private fun hangleUserName() {
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        val olaPerson = "${getString(R.string.hello)}, $name"
        binding.nome.text = olaPerson
    }

    private fun handleFilter(branco: ImageView) {

        val colorPurple = ContextCompat.getColor(this, R.color.purple_imgs)
        val colorWhite = ContextCompat.getColor(this, R.color.white)

        binding.basquet.setColorFilter(colorPurple)
        binding.tablet.setColorFilter(colorPurple)
        binding.touch.setColorFilter(colorPurple)

        branco.setColorFilter(colorWhite)
    }

    private fun eventOfClick() {
        binding.basquet.setOnClickListener {
            handleFilter(binding.basquet)
            categorhId = MotivationConstants.CATEGORY.basketball
        }
        binding.touch.setOnClickListener {
            handleFilter(binding.touch)
            categorhId = MotivationConstants.CATEGORY.touch
        }
        binding.tablet.setOnClickListener {
            handleFilter(binding.tablet)
            categorhId = MotivationConstants.CATEGORY.tablet
        }
        binding.botao.setOnClickListener {
            handlePhrase()
        }
    }

    private fun handlePhrase() {
        binding.frase.text = Mock().getPhrase(categorhId, Locale.getDefault().language)
    }
}