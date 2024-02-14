package org.example.Utils

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

    }

}