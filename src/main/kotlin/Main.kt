package org.example

//Fully qualified name needed for local

import okhttp3.*
import org.example.question.Category
import org.example.question.Difficulty
import org.example.question.Question
import org.example.question.Type
import org.example.tdbapi.ResponseCode
import kotlin.system.exitProcess

//utils
//import org.example.utils.StringUtils.Companion.decodeHtmlEntities

private val client = OkHttpClient()



fun main() {
    val game = Game(5)
    println(game.isSuccessful())
    println(game.getResponseCode())

    readln()

    println(game.questions[0])
    println(game.questions[1])
    println(game.questions[2])

    //var json = """{"response_code":0,"results":[{"type":"multiple","difficulty":"hard","category":"Entertainment: Music","question":"Which of the following is NOT a real song from the band Thousand Foot Krutch?","correct_answer":"Limitless Fury","incorrect_answers":["Let The Sparks Fly","Down","Give Up The Ghost"]}]}"""
}

