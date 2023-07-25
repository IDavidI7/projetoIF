package com.example.projetoif.data

import com.example.projetoif.infra.MotivationConstants
import kotlin.random.Random

class Phrase (val description: String, val categoryId: Int)


class Mock {
    private val tablet = MotivationConstants.CATEGORY.tablet
    private val basquet = MotivationConstants.CATEGORY.basquet
    private val touch = MotivationConstants.CATEGORY.touch


    private val mListPhrase = listOf(
        Phrase("Eu não sou baixo, sou em escala de basquete!", basquet),
        Phrase("Por que o basquete foi para a academia? Para melhorar seus arremessos!", basquet),
        Phrase("O basquete é como a matemática: se você não acerta os cálculos, não marca pontos!", basquet),
        Phrase("O basquete é um jogo justo. A bola sobe, a bola desce, e ninguém reclama de gravidade!", basquet),
        Phrase("O basquete é o único lugar onde você pode faltar todos os arremessos e ainda ser considerado um 'arremessador'.", basquet),
        Phrase("Minha única habilidade no basquete é fazer cestas... de roupa suja no cesto!", basquet),
        Phrase("Não sou ruim no basquete, apenas aro-dinâmico!", basquet),
        Phrase("Por que o jogador de basquete não saía do banco? Ele estava preso no 'reservatório'!", basquet),
        Phrase("O técnico me chamou de pivô... mas não sei o que isso significa, só sei que não posso fazer 'pivô' no meio do jogo!", basquet),
        Phrase("Meu melhor movimento de basquete? Convencer os amigos a fazer o trabalho sujo enquanto eu arremesso de fora!", basquet),

        Phrase("Por que o tablet não saiu de casa? Ele estava sem bateria!", tablet),
        Phrase("Meu tablet é tão velho que ainda usa 'escrita cuneiforme'!", tablet),
        Phrase("Qual é o tablet favorito dos pássaros? O iPad-água!", tablet),
        Phrase("Eu amo meu tablet, mas ele não corresponde às minhas mensagens de amor!", tablet),
        Phrase("O tablet não sabe contar piadas... É muito 'quadradão'!", tablet),
        Phrase("Meu tablet acredita que é uma mesa. Sempre se recusa a sair da superfície plana!", tablet),
        Phrase("Por que o tablet foi para a escola? Para melhorar suas 'telinhas'!", tablet),
        Phrase("Meu tablet está de dieta, só consome dados magros!", tablet),
        Phrase("Qual é o prato favorito do tablet? Macarronada digital!", tablet),
        Phrase("O tablet não pode ser jogador de futebol... ele não consegue chutar nada!", tablet),

        Phrase("Meu toque de Midas é transformar qualquer tela em rachada!", touch),
        Phrase("Por que o smartphone não quis ser chamado para o filme? Ele não queria ficar 'touchado' com as emoções!", touch),
        Phrase("Sou tão ruim com o touch que meu smartphone acha que estou falando em código morse!", touch),
        Phrase("Meu toque na tela é tão suave que os aplicativos acham que estou fazendo carinho!", touch),
        Phrase("O touch da minha tela parece o Faroeste: um tiroteio de toques sem precisão!", touch),
        Phrase("Meu dedo é tão pesado no touch que já considero um exercício de musculação!", touch),
        Phrase("O touch do meu smartphone está tão viciado que toda vez que desbloqueio, ele diz 'Oi, vício!'", touch),
        Phrase("Meu toque é tão rápido que o touch fica com medo de não acompanhar!", touch),
        Phrase("Meu smartphone não me respeita. Quando eu toco, ele insiste em dar zoom!", touch),
        Phrase("O touch da minha tela tem personalidade própria. Sempre toca onde bem entende!", touch)

    )

    fun getPhrase(value: Int): String {

        val filtered = mListPhrase.filter { it.categoryId == value }
        val index = Random.nextInt(filtered.size)
        return filtered[index].description
    }
}