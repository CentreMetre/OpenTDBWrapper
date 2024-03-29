package org.example

import com.google.gson.annotations.SerializedName
import org.example.question.Question
import org.example.tdbapi.ResponseCode

/*
Code 0: Success Returned results successfully.
Code 1: No Results Could not return results. The API doesn't have enough questions for your query. (Ex. Asking for 50 Questions in a Category that only has 20.)
Code 2: Invalid Parameter Contains an invalid parameter. Arguments passed in aren't valid. (Ex. Amount = Five)
Code 3: Token Not Found Session Token does not exist.
Code 4: Token Empty Session Token has returned all possible questions for the specified query. Resetting the Token is necessary.
Code 5: Rate Limit Too many requests have occurred. Each IP can only access the API once every 5 seconds.
 */

/**
 * Holds the information from the api response: the response code and the list of questions
 * @param responseCode The response code from the api
 * @param results The questions from the results list of the json returned
 */
class ParsedResponse(
    @SerializedName("response_code")
    val responseCode : ResponseCode,
    val results: List<Question>
) {}