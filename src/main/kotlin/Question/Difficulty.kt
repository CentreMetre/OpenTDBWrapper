package org.example.Question

enum class Difficulty/*(val : String)*/ {
    EASY,
    MEDIUM,
    HARD;

    //Either have this or a (val name: String) as constructor, this is better
    /**
     * Converts the constant to a string and lower case to match the difficult returned in JSON by the OpenTDB API
     * @return Lowercase string of enum constant
     */
    override fun toString(): String
    {
        var difficultyString = super.toString() //Super needed otherwise the toString() causes it to call this method
        difficultyString = difficultyString.lowercase() //Assignment needed since [StringsJVM.toLowerCase()] is deprecated and .lowercase() doesn't modify the original string
        return difficultyString
    }
}