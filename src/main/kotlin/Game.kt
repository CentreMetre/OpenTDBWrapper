package org.example

import org.example.question.*
import org.example.tdbapi.ApiHandler
import org.example.utils.StringUtils.Companion.decodeHtmlEntities
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
 * @param numberOfQuestions The amount of questions the game has. Default: 10
 * @param category The category the player wants to play. Default: ANY
 * @param difficulty The difficulty of questions the player wants to play. Default: ANY
 * @param type The type of questions the player wants to play. Default: ANY
 * @throws IllegalArgumentException If the request to the API wasn't successful and the list is not populated correctly
 */
class Game(val numberOfQuestions: Int = 10,
           val category: Category = Category.ANY,
           val difficulty: Difficulty = Difficulty.ANY,
           val type: Type = Type.ANY
           /*val questionList: List<Question>*/)
{
    /**
     * The final list for the questions of the game
     */
    public var questions: List<Question> = listOf()

    private var api = ApiHandler()
    private var jsonParser = JsonParser()

    /**
     * [ResponseCode] of the API call
     */
    private var responseCode: ResponseCode

    private var isSuccessful: Boolean = true

    /**
     * Calls API, gets JSON, parses JSON, puts response into
     */
    init
    {
        var json: String = api.callApi(this)
        //json = decodeHtmlEntities(json)
        val response: ParsedResponse = jsonParser.parseIntoParsedResponse(json)
        responseCode = response.responseCode
        setIsSuccessful()
        if (!isSuccessful()) throw IllegalArgumentException("No questions in list. Reason: ${responseCode.toString()}")
        questions = response.results

        //needed since init isnt called
        for (q: Question in questions)
        {
            q.decodeHtml()
        }


    }

    /**
     * Used so that the [] syntax can be used on [questions] since its private
     */
    public operator fun get(index: Int): Question
    {
        return questions[index]
    }

    public fun getResponseCode(): ResponseCode
    {
        return responseCode
    }

    public fun isSuccessful(): Boolean
    {
        return isSuccessful
    }

    private fun setIsSuccessful()
    {
        if (responseCode != ResponseCode.SUCCESS) isSuccessful = false
    }

    private fun decodeHtmlEncodingInQuestions()
    {
        for (q: Question in questions)
        {

        }
    }
}