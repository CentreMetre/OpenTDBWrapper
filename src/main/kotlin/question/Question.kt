package org.example.question

import com.google.gson.annotations.SerializedName
import org.example.utils.StringUtils.Companion.toTitleCase
import org.example.utils.StringUtils.Companion.decodeHtmlEntities

/* pretty printed JSON reply 2 questions
{
  "response_code": 0,
  "results": [
    {
      "type": "multiple",
      "difficulty": "hard",
      "category": "Vehicles",
      "question": "What engine is in the Lexus SC400?",
      "correct_answer": "1UZ-FE",
      "incorrect_answers": [
        "2JZ-GTE",
        "7M-GTE",
        "5M-GE"
      ]
    },
    {
      "type": "multiple",
      "difficulty": "medium",
      "category": "Sports",
      "question": "What is the highest belt you can get in Taekwondo?",
      "correct_answer": "Black",
      "incorrect_answers": [
        "White",
        "Red",
        "Green"
      ]
    }
  ]
}
 */

/**
 * This class represents a question and things related to said question.
 * It contains a question and its related data from the OpenTDB API.
 * @param type The [Type] of answer to this question, multiple or boolean.
 * @param difficulty The [Difficulty] of the question, easy, medium, or hard.
 * @param category The [Category] of the question, 25 different categories
 * @param questionText The question itself that the user sees and answers
 * @param correctAnswer The correct answer to the question. Only ever one correct answer
 * @param incorrectAnswers A list of strings that are incorrect answers
 */
class Question(private var type: Type,
               private var difficulty: Difficulty,
               private var category: Category,
               @SerializedName("question")
               private var questionText: String,
               @SerializedName("correct_answer")
               private var correctAnswer: String,
               @SerializedName("incorrect_answers")
               private var incorrectAnswers: List<String>)
{
    //getters used since class parameters need to be var so html decoding can work


    fun getType(): Type
    {
        return this.type
    }

    fun getDifficulty(): Difficulty
    {
        return this.difficulty
    }

    fun getCategory(): Category
    {
        return this.category
    }

    fun getQuestionText(): String
    {
        return this.questionText
    }

    fun getCorrectAnswer(): String
    {
        return this.correctAnswer
    }

    fun getIncorrectAnswers(): List<String>
    {
        return this.incorrectAnswers
    }

    /**
     * Function to decode the HTML encoding. Cannot be in init block since gson uses reflection and doesn't call init
     */
    fun decodeHtml()
    {
        this.questionText = decodeHtmlEntities(this.questionText)
        this.correctAnswer = decodeHtmlEntities(this.correctAnswer)

        val mutableList = this.incorrectAnswers.toMutableList()

        for (i in mutableList.indices)
        {
            mutableList[i] = decodeHtmlEntities(mutableList[i])
        }

        incorrectAnswers = mutableList.toList()

    }

    override fun toString() : String
    {


        //multiple strings used for [Utils.StringUtils.toTitleCase()]


        return """Type: ${type.toString().toTitleCase()}
            |Difficulty: ${difficulty.toString().toTitleCase()}
            |Category: ${category.toString().toTitleCase()}
            |Question Text: $questionText
            |Correct Answer: $correctAnswer
            |Incorrect Answers: $incorrectAnswers
            |""".trimMargin()
    }

    fun isAnswerCorrect(answer: String): Boolean
    {
        return answer == correctAnswer
    }


}