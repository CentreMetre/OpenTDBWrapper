package org.example

import com.google.gson.Gson
import org.example.tdbapi.ResponseCode

class JsonParser {

    fun parseIntoParsedResponse(json: String): ParsedResponse
    {
        // Parse JSON using Gson
        val gson = Gson()
        val apiResponse = gson.fromJson(json, ParsedResponse::class.java)

        return apiResponse
        // parsed straight into ParsedResponse class type since its easier i dont know how to get individual information
    }

}