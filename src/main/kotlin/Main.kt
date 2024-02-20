package org.example

//Fully qualified name needed for local

import okhttp3.*
import org.example.question.Category
import org.example.question.Difficulty
import org.example.question.Type
//utils
//import org.example.utils.StringUtils.Companion.decodeHtmlEntities

private val client = OkHttpClient()



fun main() {
    val game = Game(3, Category.ENTERTAINMENT_BOARD_GAMES, Difficulty.ANY, Type.ANY)
    println(game.apiResponse.responseCode)

}

