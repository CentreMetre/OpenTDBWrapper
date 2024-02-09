package org.example

import org.example.Question.*

class EnumDeserialiser {


}

class TypeDeserializer : EnumDeserializer<Type>()
class DifficultyDeserializer : EnumDeserializer<Difficulty>()
class CategoryDeserializer : EnumDeserializer<Category>()