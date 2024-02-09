package org.example.Question

import com.google.gson.annotations.SerializedName

enum class Type {
    @SerializedName("multiple")
    MULTIPLE, //String, does have to have multiple correct answers
    @SerializedName("boolean")
    BOOLEAN //True of false
}