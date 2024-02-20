package org.example.question

import com.google.gson.annotations.SerializedName
val t = "&type="
enum class Type(val urlName: String) {
    /**
     * Used solely for api call and not for the returned JSON
     */
    ANY(""),
    @SerializedName("multiple")
    MULTIPLE(t +"multiple"), //String, does have to have multiple correct answers
    @SerializedName("boolean")
    BOOLEAN(t +"boolean")//True of false
}