package org.example

import org.example.Question.*

/*
 * Order:
 * Number of Questions
 * Category
 * Difficulty
 * Type (multiple choice or true/false
 * encoding
 */

/**
 * Holds all data related to questions and players game
 * @param numberOfQuestions The amount of questions the game has
 * @param category The category the player wants to play
 * @param difficulty The difficulty of questions the player wants to play
 * @param type The type of questions the player wants to play
 */
class Game(val numberOfQuestions: Int,
           val category: Category,
           val difficulty: Difficulty,
           val type: Type
           /*val questionList: List<Question>*/)
{
    private val emptyQuestion = Question(Type.BOOLEAN, Difficulty.EASY, Category.ANY, "", "", listOf(""))

    private var score: Int = 0
    private var currentQuestion: Question? = null
    private val questions = MutableList(numberOfQuestions) {emptyQuestion}

    init
    {

    }

    private fun callApi()
    {

    }

    /**
     * Builds the URL needed for the api call using the parameters of the class creation
     */


    private fun setQuestions(questionList: List<Question>)
    {
        for (i in questionList.indices)
        {
            questions[i] = questionList[i]
        }
    }

    fun addQuestion(question: Question)
    {
            questions.add(question)
    }
}