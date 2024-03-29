package org.example.tdbapi

import okhttp3.*
import org.example.Game

/*

 */
class ApiHandler {

    /**
     * Calls the URL with the given parameters
     * @param game Gets the parameters for the URL API call
     * @return Json in the form of a string
     */
    fun callApi(game: Game): String
    {
        val httpResponse = requestQuestions(game)
        val json = httpResponseToUrlContent(httpResponse)
        return json
    }

    /**
     * @return the okhttp3 HTTP response
     */
    fun requestQuestions(game: Game): Response
    {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(urlBuilder(game))
            .build()

        val call = client.newCall(request).execute()
        //apiHandler.requestQuestions(game).

        return call
    }

    private fun httpResponseToUrlContent(response: Response): String
    {
        return response.body!!.string()
    }

    /**
     * Builds the URL to call from the [Game] object passed
     * @param game Contains the parameters the function uses
     */
    private fun urlBuilder(game: Game): String
    {
        val baseURL = "https://opentdb.com/api.php?"
        var finalURL = baseURL
        //val gameParameters = listOf(numberOfQuestions, category, difficulty, type)
        val amountURL = "amount="

        finalURL = finalURL + amountURL + game.numberOfQuestions + game.category.urlName + game.difficulty.urlName + game.type.urlName
        return finalURL
    }
}