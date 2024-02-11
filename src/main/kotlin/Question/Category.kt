package org.example.Question

import com.google.gson.annotations.SerializedName

enum class Category(val id: Int, val catName: String) {
//    ANY(0, "Any Category"),
//    GENERAL_KNOWLEDGE(9, "General Knowledge"),
//    ENTERTAINMENT_BOOKS(10, "Entertainment: Books"),
//    ENTERTAINMENT_FILM(11, "Entertainment: Film"),
//    ENTERTAINMENT_MUSIC(12, "Entertainment: Music"),
//    ENTERTAINMENT_MUSICALS_THEATRES(13, "Entertainment: Musicals & Theatres"),
//    ENTERTAINMENT_TELEVISION(14, "Entertainment: Television"),
//    ENTERTAINMENT_VIDEO_GAMES(15, "Entertainment: Video Games"),
//    ENTERTAINMENT_BOARD_GAMES(16, "Entertainment: Board Games"),
//    SCIENCE_NATURE(17, "Science & Nature"),
//    SCIENCE_COMPUTERS(18, "Science: Computers"),
//    SCIENCE_MATHEMATICS(19, "Science: Mathematics"),
//    MYTHOLOGY(20, "Mythology"),
//    SPORTS(21, "Sports"),
//    GEOGRAPHY(22, "Geography"),
//    HISTORY(23, "History"),
//    POLITICS(24, "Politics"),
//    ART(25, "Art"),
//    CELEBRITIES(26, "Celebrities"),
//    ANIMALS(27, "Animals"),
//    VEHICLES(28, "Vehicles"),
//    ENTERTAINMENT_COMICS(29, "Entertainment: Comics"),
//    SCIENCE_GADGETS(30, "Science: Gadgets"),
//    ENTERTAINMENT_JAPANESE_ANIME_MANGA(31, "Entertainment: Japanese Anime & Manga"),
//    ENTERTAINMENT_CARTOON_ANIMATIONS(32, "Entertainment: Cartoon & Animations")
@SerializedName("Any Category")
ANY(0, "Any Category"),

    @SerializedName("General Knowledge")
    GENERAL_KNOWLEDGE(9, "General Knowledge"),

    @SerializedName("Entertainment: Books")
    ENTERTAINMENT_BOOKS(10, "Entertainment: Books"),

    @SerializedName("Entertainment: Film")
    ENTERTAINMENT_FILM(11, "Entertainment: Film"),

    @SerializedName("Entertainment: Music")
    ENTERTAINMENT_MUSIC(12, "Entertainment: Music"),

    @SerializedName("Entertainment: Musicals & Theatres")
    ENTERTAINMENT_MUSICALS_THEATRES(13, "Entertainment: Musicals & Theatres"),

    @SerializedName("Entertainment: Television")
    ENTERTAINMENT_TELEVISION(14, "Entertainment: Television"),

    @SerializedName("Entertainment: Video Games")
    ENTERTAINMENT_VIDEO_GAMES(15, "Entertainment: Video Games"),

    @SerializedName("Entertainment: Board Games")
    ENTERTAINMENT_BOARD_GAMES(16, "Entertainment: Board Games"),

    @SerializedName("Science & Nature")
    SCIENCE_NATURE(17, "Science & Nature"),

    @SerializedName("Science: Computers")
    SCIENCE_COMPUTERS(18, "Science: Computers"),

    @SerializedName("Science: Mathematics")
    SCIENCE_MATHEMATICS(19, "Science: Mathematics"),

    @SerializedName("Mythology")
    MYTHOLOGY(20, "Mythology"),

    @SerializedName("Sports")
    SPORTS(21, "Sports"),

    @SerializedName("Geography")
    GEOGRAPHY(22, "Geography"),

    @SerializedName("History")
    HISTORY(23, "History"),

    @SerializedName("Politics")
    POLITICS(24, "Politics"),

    @SerializedName("Art")
    ART(25, "Art"),

    @SerializedName("Celebrities")
    CELEBRITIES(26, "Celebrities"),

    @SerializedName("Animals")
    ANIMALS(27, "Animals"),

    @SerializedName("Vehicles")
    VEHICLES(28, "Vehicles"),

    @SerializedName("Entertainment: Comics")
    ENTERTAINMENT_COMICS(29, "Entertainment: Comics"),

    @SerializedName("Science: Gadgets")
    SCIENCE_GADGETS(30, "Science: Gadgets"),

    @SerializedName("Entertainment: Japanese Anime & Manga")
    ENTERTAINMENT_JAPANESE_ANIME_MANGA(31, "Entertainment: Japanese Anime & Manga"),

    @SerializedName("Entertainment: Cartoon & Animations")
    ENTERTAINMENT_CARTOON_ANIMATIONS(32, "Entertainment: Cartoon & Animations");
}