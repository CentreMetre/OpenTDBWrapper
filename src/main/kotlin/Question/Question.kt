package org.example.Question

/* pretty printed JSON reply
{
  "response_code": 0,
  "results": [
    {
      "type": "boolean",
      "difficulty": "easy",
      "category": "Science: Mathematics",
      "question": "An isosceles triangle has two sides of equal length as opposed to three.",
      "correct_answer": "True",
      "incorrect_answers": [
        "False"
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
class Question(val type: Type,
               val difficulty: Difficulty,
               val category: Category,
               val questionText: String,
               val correctAnswer: String,
               val incorrectAnswers: List<String>)
{

}