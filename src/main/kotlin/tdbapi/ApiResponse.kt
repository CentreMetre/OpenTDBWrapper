package org.example.tdbapi

import com.google.gson.annotations.SerializedName
import org.example.question.Question

/**
 * @param responseCode The response code from the api
 * @param results The questions from the results list of the json returned
 */
class ApiResponse(
    @SerializedName("response_code")
    val responseCode : Int,
    val results: List<Question>
)
{

}