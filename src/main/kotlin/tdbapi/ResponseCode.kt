package org.example.tdbapi

import com.google.gson.annotations.SerializedName

enum class ResponseCode(code: Int, description: String) {
    @SerializedName("0")
    SUCCESS(0, "Success: Returned results successfully."),
    @SerializedName("1")
    INSUFFICIENT_RESULTS(1, "Not Enough Results: Not enough questions for your query."),
    @SerializedName(value = "2")
    INVALID_PARAMETER(2, "Invalid Parameter: Part of the query is invalid."),
    @SerializedName("3")
    TOKEN_NOT_FOUND(3, "Token Not Found: Session token does not exist."),
    @SerializedName("4")
    TOKEN_EMPTY(4, "Token Empty: Session Token as returned all possible results for the specified query."),
    @SerializedName("5")
    RATE_LIMIT(5, "Rate Limit: Too many requests have occurred. Rate limit is 1 every 5 seconds per IP address.")
}