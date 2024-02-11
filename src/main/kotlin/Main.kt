package org.example

//Fully qualified name needed for local
import com.google.gson.*
import org.example.Question.*
import java.lang.reflect.Type

import okhttp3.*
import okio.IOException
import org.example.Utils.StringUtils.Companion.toTitleCase

private val client = OkHttpClient()



fun main() {

//    var name = "martin"
//    var sentence = "Name: ${name.toTitleCase()}"
//    println(sentence)


    val numberOfQuestions = 10
    val category = Category.SCIENCE_GADGETS
    val difficulty = Difficulty.MEDIUM
    val type = org.example.Question.Type.BOOLEAN

    val baseURL = "https://opentdb.com/api.php?"
    var finalURL = baseURL
    val gameParameters = listOf(numberOfQuestions, category, difficulty, type)
    val amountURL = "amount="

    finalURL = finalURL + amountURL + numberOfQuestions + category.urlName + difficulty.urlName + type.urlName
    println(finalURL)


//    val json = """{
//      "type": "multiple",
//      "difficulty": "hard",
//      "category": "Vehicles",
//      "question": "What engine is in the Lexus SC400?",
//      "correct_answer": "1UZ-FE",
//      "incorrect_answers": [
//        "2JZ-GTE",
//        "7M-GTE",
//        "5M-GE"
//      ]
//    }"""
//
//    val gson = Gson()
//
//    val tutorial1: Question = gson.fromJson(json, Question::class.java)
//    println(tutorial1.toString())
//
//    println(tutorial1.isAnswerCorrect("1UZ-FE"))

//    val request = Request.Builder()
//        .url("https://opentdb.com/api.php?amount=10")
//        .build()
//
//    client.newCall(request).execute().use { response ->
//        if (!response.isSuccessful) throw IOException("Unexpected code $response")
//
//        for ((name, value) in response.headers) {
//            println("$name, $value")
//        }
//
//        println(response.body!!.string())
//    }

}
