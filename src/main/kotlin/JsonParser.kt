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
    }

}