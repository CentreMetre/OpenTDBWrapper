package org.example

//Fully qualified name needed for local
import org.example.Question.*

import okhttp3.*
import okio.IOException

private val client = OkHttpClient()
private val q1 = Question(Type.BOOLEAN, "EE")

fun main() {

    println(Difficulty.EASY.toString())

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