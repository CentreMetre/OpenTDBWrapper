package org.example.utils

class StringUtils {
    companion object{
        /**
         * Converts a string to have only the first character be capitalised.
         */
        fun String.toTitleCase() : String
        {
            var charList = this.toMutableList()
            charList[0] = charList[0].uppercaseChar() //Converts first char to be uppercase
            for (index in charList.indices)
            {
                if (index == 0) {continue} //Skips lower-casing the first letter since it's upper-cased above
                charList[index] = charList[index].lowercaseChar() //sets the char at index to be lower case
            }
            val originalString = charList.joinToString("")
            return originalString
        }

        fun decodeHtmlEntities(input: String): String {
            // Define a map of HTML entities and their corresponding characters
            val htmlEntitiesMap = mapOf(
                "&amp;" to "&",
                "&lt;" to "<",
                "&gt;" to ">",
                "&quot;" to """"""",
                "&#39;" to "'",
                "&#039;" to "'",  // Handle additional single quote encoding
                "&nbsp;" to " ",
                "&copy;" to "©",
                // Add more mappings as needed
            )

            // Replace each HTML entity in the input string with its corresponding character
            var decodedString = input
            for ((entity, value) in htmlEntitiesMap) {
                decodedString = decodedString.replace(entity, value)
            }
            return decodedString
        }

    }

}