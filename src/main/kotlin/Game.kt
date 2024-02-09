package org.example

import org.example.Question.*

/**
 * Holds all data related to questions and players game
 * @param questionCount The amount of questions
 */
class Game(val questionCount: Int, val questionList: List<Question>)
{
    //private val EMPTY_QUESTION = Question(Type.BOOLEAN, Difficulty.EASY, Category.ANY, "", "", listOf(""))

    private var score: Int = 0
    private var currentQuestion: Question? = null
    //private val questions = listOf(questionCount) {null}

    init
    {

    }

    private fun setQuestions()
    {
        for (i: Question in questionList)
        {
            //questions[i] = questionList[i]
        }
    }
}