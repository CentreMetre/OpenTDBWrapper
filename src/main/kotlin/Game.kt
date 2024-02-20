package org.example

import org.example.question.Question
import org.example.question.Type
import org.example.question.Difficulty
import org.example.question.Category
import org.example.tdbapi.ApiHandler
import org.example.tdbapi.ResponseCode

/*
 * Order:
 * Number of Questions
 * Category
 * Difficulty
 * Type (multiple choice or true/false
 * encoding
 */

/*
Everything is contained within game. So game would call the API classes etc.
So a user only needs to interact with the game class
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
    private val emptyQuestion = Question(Type.BOOLEAN,
        Difficulty.EASY,
        Category.ANY,
        "",
        "",
        listOf(""))

    var score: Int = 0
    var currentQuestion: Question? = null
    private var questions = List(numberOfQuestions) {emptyQuestion}

    private var api = ApiHandler()
    private val jsonParser = JsonParser()
    public var apiResponse = ParsedResponse(ResponseCode.SUCCESS, listOf(emptyQuestion))

    init
    {
        var json = api.callApi(this)
        apiResponse = jsonParser.parseIntoParsedResponse(json)
        questions = apiResponse.results
    }

    private fun callApi()
    {

    }
}