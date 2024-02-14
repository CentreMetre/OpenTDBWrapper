package org.example

//Fully qualified name needed for local
import com.google.gson.*
import org.example.Question.*
import org.example.Game
import org.example.Api.*

import okhttp3.*
import okio.IOException
import okio.use
import org.example.Api.ApiHandler
import org.example.Utils.StringUtils.Companion.toTitleCase

private val client = OkHttpClient()



fun main() {



    val game = Game(10, Category.ANY, Difficulty.ANY, Type.ANY)
    val apiHandler = ApiHandler()
    println(apiHandler.callApi(game))

}

