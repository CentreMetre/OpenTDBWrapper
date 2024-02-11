package org.example

import org.example.Question.*

/**
 * Holds all data related to questions and players game
 * @param questionCount The amount of questions
 */
class Game(val questionCount: Int, val questionList: List<Question>)
{
    private val emptyQuestion = Question(Type.BOOLEAN, Difficulty.EASY, Category.ANY, "", "", listOf(""))

    private var score: Int = 0
    private var currentQuestion: Question? = null
    private val questions = MutableList(questionCount) {emptyQuestion}

    init
    {

    }

    private fun setQuestions()
    {
        for (i in questionList.indices)
        {
            questions[i] = questionList[i]
        }
    }
}