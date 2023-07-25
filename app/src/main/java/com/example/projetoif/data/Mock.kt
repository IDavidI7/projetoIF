package com.example.projetoif.data

import com.example.projetoif.infra.MotivationConstants
import kotlin.random.Random

class Phrase (val description: String, val categoryId: Int, val lang: String)


class Mock {
    private val language = MotivationConstants.LANGUAGE

    private val tablet = MotivationConstants.CATEGORY.tablet
    private val basketball = MotivationConstants.CATEGORY.basketball
    private val touch = MotivationConstants.CATEGORY.touch

    private val pt = language.PORTUGUESE
    private val en = language.ENGLISH
    private val ar = language.ARABC
    private val fr = language.FRANCE


    private val mListPhrase = listOf(
        Phrase("Eu não sou baixo, sou em escala de basquete!", basketball, pt),
        Phrase("Por que o basquete foi para a academia? Para melhorar seus arremessos!", basketball, pt),
        Phrase("O basquete é como a matemática: se você não acerta os cálculos, não marca pontos!", basketball, pt),
        Phrase("O basquete é um jogo justo. A bola sobe, a bola desce, e ninguém reclama de gravidade!", basketball, pt),
        Phrase("O basquete é o único lugar onde você pode faltar todos os arremessos e ainda ser considerado um 'arremessador'.", basketball, pt),
        Phrase("Minha única habilidade no basquete é fazer cestas... de roupa suja no cesto!", basketball, pt),
        Phrase("Não sou ruim no basquete, apenas aro-dinâmico!", basketball, pt),
        Phrase("Por que o jogador de basquete não saía do banco? Ele estava preso no 'reservatório'!", basketball, pt),
        Phrase("O técnico me chamou de pivô... mas não sei o que isso significa, só sei que não posso fazer 'pivô' no meio do jogo!", basketball, pt),
        Phrase("Meu melhor movimento de basquete? Convencer os amigos a fazer o trabalho sujo enquanto eu arremesso de fora!", basketball, pt),

        Phrase("Por que o tablet não saiu de casa? Ele estava sem bateria!", tablet, pt),
        Phrase("Meu tablet é tão velho que ainda usa 'escrita cuneiforme'!", tablet, pt),
        Phrase("Qual é o tablet favorito dos pássaros? O iPad-água!", tablet, pt),
        Phrase("Eu amo meu tablet, mas ele não corresponde às minhas mensagens de amor!", tablet, pt),
        Phrase("O tablet não sabe contar piadas... É muito 'quadradão'!", tablet, pt),
        Phrase("Meu tablet acredita que é uma mesa. Sempre se recusa a sair da superfície plana!", tablet, pt),
        Phrase("Por que o tablet foi para a escola? Para melhorar suas 'telinhas'!", tablet, pt),
        Phrase("Meu tablet está de dieta, só consome dados magros!", tablet, pt),
        Phrase("Qual é o prato favorito do tablet? Macarronada digital!", tablet, pt),
        Phrase("O tablet não pode ser jogador de futebol... ele não consegue chutar nada!", tablet, pt),

        Phrase("Meu toque de Midas é transformar qualquer tela em rachada!", touch, pt),
        Phrase("Por que o smartphone não quis ser chamado para o filme? Ele não queria ficar 'touchado' com as emoções!", touch, pt),
        Phrase("Sou tão ruim com o touch que meu smartphone acha que estou falando em código morse!", touch, pt),
        Phrase("Meu toque na tela é tão suave que os aplicativos acham que estou fazendo carinho!", touch, pt),
        Phrase("O touch da minha tela parece o Faroeste: um tiroteio de toques sem precisão!", touch, pt),
        Phrase("Meu dedo é tão pesado no touch que já considero um exercício de musculação!", touch, pt),
        Phrase("O touch do meu smartphone está tão viciado que toda vez que desbloqueio, ele diz 'Oi, vício!'", touch, pt),
        Phrase("Meu toque é tão rápido que o touch fica com medo de não acompanhar!", touch, pt),
        Phrase("Meu smartphone não me respeita. Quando eu toco, ele insiste em dar zoom!", touch, pt),
        Phrase("O touch da minha tela tem personalidade própria. Sempre toca onde bem entende!", touch, pt),



        //English
        Phrase("I'm not short, I'm basketball-scale!", basketball, en),
        Phrase("Why did the basketball go to the gym? To improve its shots!", basketball, en),
        Phrase("Basketball is like math: if you don't get the calculations right, you don't score points!", basketball, en),
        Phrase("Basketball is a fair game. The ball goes up, the ball goes down, and nobody complains about gravity!", basketball, en),
        Phrase("Basketball is the only place where you can miss all the shots and still be considered a 'shooter'.", basketball, en),
        Phrase("My only skill in basketball is making baskets... of dirty laundry in the bin!", basketball, en),
        Phrase("I'm not bad at basketball, just hoop-dynamic!", basketball, en),
        Phrase("Why didn't the basketball player leave the bench? He was stuck in the 'reservoir'!", basketball, en),
        Phrase("The coach called me a pivot... but I don't know what that means, I just know I can't pivot in the middle of the game!", basketball, en),
        Phrase("My best basketball move? Convincing friends to do the dirty work while I shoot from outside!", basketball, en),

        Phrase("Why didn't the tablet leave home? It was out of battery!", tablet, en),
        Phrase("My tablet is so old, it still uses 'cuneiform writing'!", tablet, en),
        Phrase("What's the birds' favorite tablet? The iPad-water!", tablet, en),
        Phrase("I love my tablet, but it doesn't respond to my love messages!", tablet, en),
        Phrase("The tablet can't tell jokes... It's too 'square'!", tablet, en),
        Phrase("My tablet thinks it's a table. Always refuses to leave the flat surface!", tablet, en),
        Phrase("Why did the tablet go to school? To improve its 'screens'!", tablet, en),
        Phrase("My tablet is on a diet, only consumes lean data!", tablet, en),
        Phrase("What's the tablet's favorite dish? Digital macaroni!", tablet, en),
        Phrase("The tablet can't be a soccer player... it can't kick anything!", tablet, en),

        Phrase("My Midas touch is turning any screen into cracked!", touch, en),
        Phrase("Why didn't the smartphone want to be called for the movie? It didn't want to be 'touched' by emotions!", touch, en),
        Phrase("I'm so bad with touch that my smartphone thinks I'm speaking in Morse code!", touch, en),
        Phrase("My touch on the screen is so gentle that apps think I'm caressing them!", touch, en),
        Phrase("The touch on my screen looks like the Wild West: a shootout of inaccurate touches!", touch, en),
        Phrase("My finger is so heavy on touch that I consider it a weightlifting exercise!", touch, en),
        Phrase("My smartphone's touch is so addicted that every time I unlock it, it says 'Hi, addiction!'", touch, en),
        Phrase("My touch is so fast that the touch screen gets scared it can't keep up!", touch, en),
        Phrase("My smartphone doesn't respect me. When I touch it, it insists on zooming!", touch, en),
        Phrase("The touch on my screen has a mind of its own. It always touches wherever it pleases!", touch, en),



        //Frances
        Phrase("Je ne suis pas petit, je suis à l'échelle du basketball !", basketball, fr),
        Phrase("Pourquoi le basketball est allé à la salle de sport ? Pour améliorer ses tirs !", basketball, fr),
        Phrase("Le basketball, c'est comme les mathématiques : si vous ne faites pas les calculs correctement, vous ne marquez pas de points !", basketball, fr),
        Phrase("Le basketball est un jeu équitable. Le ballon monte, le ballon descend, et personne ne se plaint de la gravité !", basketball, fr),
        Phrase("Le basketball est le seul endroit où vous pouvez rater tous les tirs et être quand même considéré comme un 'shooter'.", basketball, fr),
        Phrase("Ma seule compétence en basketball est de faire des paniers... de linge sale dans le panier !", basketball, fr),
        Phrase("Je ne suis pas mauvais en basketball, juste « cintre-dynamique » !", basketball, fr),
        Phrase("Pourquoi le joueur de basketball n'a-t-il pas quitté le banc ? Il était coincé dans le 'réservoir' !", basketball, fr),
        Phrase("L'entraîneur m'a appelé un pivot... mais je ne sais pas ce que cela signifie, je sais seulement que je ne peux pas pivoter en plein milieu du jeu !", basketball, fr),
        Phrase("Mon meilleur mouvement au basketball ? Convaincre les amis de faire le sale boulot pendant que je tire de l'extérieur !", basketball, fr),

        Phrase("Pourquoi la tablette n'est-elle pas sortie de la maison ? Elle était à court de batterie !", tablet, fr),
        Phrase("Ma tablette est si vieille qu'elle utilise encore l'« écriture cunéiforme » !", tablet, fr),
        Phrase("Quelle est la tablette préférée des oiseaux ? L'iPad-eau !", tablet, fr),
        Phrase("J'adore ma tablette, mais elle ne répond pas à mes messages d'amour !", tablet, fr),
        Phrase("La tablette ne peut pas raconter de blagues... Elle est trop 'carrée' !", tablet, fr),
        Phrase("Ma tablette pense qu'elle est une table. Elle refuse toujours de quitter la surface plane !", tablet, fr),
        Phrase("Pourquoi la tablette est-elle allée à l'école ? Pour améliorer ses 'écrans' !", tablet, fr),
        Phrase("Ma tablette est au régime, elle ne consomme que des données maigres !", tablet, fr),
        Phrase("Quel est le plat préféré de la tablette ? Les macaronis numériques !", tablet, fr),
        Phrase("La tablette ne peut pas être un joueur de football... elle ne peut rien frapper !", tablet, fr),

        Phrase("Mon toucher de Midas transforme n'importe quel écran en écran fissuré !", touch, fr),
        Phrase("Pourquoi le smartphone ne voulait-il pas être appelé pour le film ? Il ne voulait pas être 'touché' par les émotions !", touch, fr),
        Phrase("Je suis tellement nul en toucher que mon smartphone pense que je parle en code morse !", touch, fr),
        Phrase("Mon toucher sur l'écran est si doux que les applications pensent que je les caresse !", touch, fr),
        Phrase("Le toucher sur mon écran ressemble à l'Ouest sauvage : une fusillade de touches imprécises !", touch, fr),
        Phrase("Mon doigt est si lourd sur le toucher que je le considère comme un exercice d'haltérophilie !", touch, fr),
        Phrase("Le toucher de mon smartphone est si addictif qu'à chaque fois que je le déverrouille, il dit 'Salut, addiction !'", touch, fr),
        Phrase("Mon toucher est si rapide que l'écran tactile a peur de ne pas suivre !", touch, fr),
        Phrase("Mon smartphone ne me respecte pas. Quand je le touche, il insiste pour zoomer !", touch, fr),
        Phrase("Le toucher de mon écran a sa propre personnalité. Il touche toujours où bon lui semble !", touch, fr),



    //Arabe
        Phrase("أنا لست قصيرًا، أنا في مقياس كرة السلة!", basketball, ar),
        Phrase("لماذا ذهبت كرة السلة إلى الصالة الرياضية؟ لتحسين طلقاتها!", basketball, ar),
        Phrase("كرة السلة مثل الرياضيات: إذا لم تحسب الحسابات بشكل صحيح، فلن تحصل على نقاط!", basketball, ar),
        Phrase("كرة السلة لعبة عادلة. الكرة تصعد والكرة تنزل، ولا أحد يشتكي من الجاذبية!", basketball, ar),
        Phrase("كرة السلة هي المكان الوحيد الذي يمكنك فيه أن تفوت كل الطلقات ومع ذلك يعتبرونك 'مُسدد'.", basketball, ar),
        Phrase("مهارتي الوحيدة في كرة السلة هي صنع سلال... من الملابس القذرة في السلة!", basketball, ar),
        Phrase("أنا لست سيء في كرة السلة، فقط دائري الشكل!", basketball, ar),
        Phrase("لماذا لم يغادر لاعب كرة السلة مقعده؟ كان عالقًا في 'خزان'!", basketball, ar),
        Phrase("دعاني المدرب بأنني محور... ولكنني لا أعرف ماذا يعني ذلك، أعلم فقط أنني لا أستطيع الاستدارة في منتصف المباراة!", basketball, ar),
        Phrase("أفضل حركة لدي في كرة السلة؟ إقناع الأصدقاء بالقيام بالعمل الشاق بينما أنا أطلق النار من الخارج!", basketball, ar),

        Phrase("لماذا لم تغادر الجهاز اللوحي المنزل؟ كان بدون بطارية!", tablet, ar),
        Phrase("جهازي اللوحي قديم جداً، لا يزال يستخدم 'الكتابة المسمارية'!", tablet, ar),
        Phrase("ما هو جهاز اللوحي المفضل للطيور؟ آيباد الماء!", tablet, ar),
        Phrase("أنا أحب جهازي اللوحي، ولكنه لا يستجيب لرسائل الحب مني!", tablet, ar),
        Phrase("الجهاز اللوحي لا يمكنه أن يقدم نكات... إنه 'مربع' جدًا!", tablet, ar),
        Phrase("يعتقد جهاز اللوحي أنه طاولة. يرفض دائمًا المغادرة من السطح المستوي!", tablet, ar),
        Phrase("لماذا ذهب الجهاز اللوحي إلى المدرسة؟ لتحسين 'الشاشات'!", tablet, ar),
        Phrase("جهازي اللوحي في حمية، يستهلك فقط بيانات نحيلة!", tablet, ar),
        Phrase("ما هو الطبق المفضل لجهاز اللوحي؟ معكرونة رقمية!", tablet, ar),
        Phrase("لا يمكن لجهاز اللوحي أن يكون لاعب كرة قدم... لا يمكنه تسديد أي شيء!", tablet, ar),

        Phrase("مساسي بالمس هو تحويل أي شاشة إلى مكسورة!", touch, ar),
        Phrase("لماذا لم يرغب الهاتف الذكي في أن يُدعى لمشاهدة الفيلم؟ لأنه لم يكن يرغب في أن يكون 'لمس' بالعواطف!", touch, ar),
        Phrase("أنا سيء جداً في المس. يعتقد هاتفي الذكي أنني أتحدث بالشيفرة المورسية!", touch, ar),
        Phrase("مساسي على الشاشة ناعم جداً حتى أن التطبيقات تعتقد أنني أحتضنها!", touch, ar),
        Phrase("مساسي بالشاشة يشبه القصف الناري في الغرب الأمريكي: إطلاق نار من مساسات غير دقيقة!", touch, ar),
        Phrase("إصبعي ثقيل على اللمس حتى أعتبره تمرين لرفع الأثقال!", touch, ar)

    )

    fun getPhrase(value: Int, lang: String): String {

        val filtered = mListPhrase.filter { it.categoryId == value && it.lang == lang }
        val index = Random.nextInt(filtered.size)
        return filtered[index].description
    }
}