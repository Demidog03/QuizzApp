package com.example.quizzapp

object Constance {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val q1 = Question(1,  "Let’s begin with an easy question, who is the Pokemon Anime’s main character?",
            R.drawable.img_1,
            "Ash", "Misty", "Pikachu", "Light", 1)

        questionsList.add(q1)

        val q2 = Question(2,  "A girl searches for magical objects to fulfill her wish, which is the anime?",
            R.drawable.img,
            "One Piece", "Dragon Ball", "Fairy tail", "Naruto", 2)

        questionsList.add(q2)

        val q3 = Question(3,  "What kind of wizard is Lucy in “Fairy Tail” anime?",
            R.drawable.img_2,
            "Ice Wizard", "Sky Wizard", "Celestial Wizard", "Fire Wizard", 3)

        questionsList.add(q3)

        val q4 = Question(4,  "Who is he?",
            R.drawable.img_3,
            "Vegeta", "Goku", "Ash", "Pikachu", 2)

        questionsList.add(q4)

        val q5 = Question(5,  "Naruto has different types of modes. Do you know what is the name of this mode?",
            R.drawable.img_4,
            "Kurama chakra mode", "six paths sage mode", "tailed beast ball Rasen shuriken", "none of them", 2)

        questionsList.add(q5)

        val q6 = Question(6,  "He is Light Yagami. He is the main character of ….. anime.",
            R.drawable.img_5,
            "One piece", "Fairy Tail", "Death Note", "Dragon Balls", 3)

        questionsList.add(q6)

        val q7 = Question(7,  "This picture is from which one of these famous animes?",
            R.drawable.img_6,
            "My Neighbour Totoro", "Spirited Away", "Pokemon", "Fairy tail", 2)

        questionsList.add(q7)

        val q8 = Question(8,  "Do you know what kind of person Naruto is?",
            R.drawable.img_7,
            "A Ninja", "A knight", "A samurai", "A tree surgeon", 1)

        questionsList.add(q8)

        val q9 = Question(9,  "Who is he?",
            R.drawable.img_8,
            "Rorona Zoro", "Nami", "Nico Robin", "Usopp", 1)

        questionsList.add(q9)

        val q10 = Question(10,  "Do you know this couple is from which one of these animes?",
            R.drawable.img_9,
            "Deku and Ochako", "Vegeta and Bulma", "Goku and ChiChi", "Kirito and Asuna", 4)

        questionsList.add(q10)
        return questionsList
    }
}