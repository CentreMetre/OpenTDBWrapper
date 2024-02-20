package org.example

//Fully qualified name needed for local

import okhttp3.*
//utils
import org.example.utils.StringUtils.Companion.decodeHtmlEntities

private val client = OkHttpClient()



fun main() {
//    val game = Game(10, Category.ANY, Difficulty.ANY, Type.ANY)
//    val apiHandler = ApiHandler()
//    println(apiHandler.callApi(game))
    val htmlEncodedString = "This is a &lt;b&gt;sample&lt;/b&gt; string with HTML entities."
    val decodedString = decodeHtmlEntities(htmlEncodedString)
    println("Decoded String: $decodedString")
}

