package org.example.Question

import com.google.gson.annotations.SerializedName

val c = "&category="

enum class Category(val id: Int, val catName: String, val urlName: String) {
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

    /**
     * Used solely for api call and not for the returned JSON
     */
    @SerializedName("Any Category")
    ANY(0, "Any Category", ""),

    @SerializedName("General Knowledge")
    GENERAL_KNOWLEDGE(9, "General Knowledge", c + 9),

    @SerializedName("Entertainment: Books")
    ENTERTAINMENT_BOOKS(10, "Entertainment: Books", c + 10),

    @SerializedName("Entertainment: Film")
    ENTERTAINMENT_FILM(11, "Entertainment: Film", c + 11),

    @SerializedName("Entertainment: Music")
    ENTERTAINMENT_MUSIC(12, "Entertainment: Music", c + 12),

    @SerializedName("Entertainment: Musicals & Theatres")
    ENTERTAINMENT_MUSICALS_THEATRES(13, "Entertainment: Musicals & Theatres", c + 13),

    @SerializedName("Entertainment: Television")
    ENTERTAINMENT_TELEVISION(14, "Entertainment: Television", c + 14),

    @SerializedName("Entertainment: Video Games")
    ENTERTAINMENT_VIDEO_GAMES(15, "Entertainment: Video Games", c + 15),

    @SerializedName("Entertainment: Board Games")
    ENTERTAINMENT_BOARD_GAMES(16, "Entertainment: Board Games", c + 16),

    @SerializedName("Science & Nature")
    SCIENCE_NATURE(17, "Science & Nature", c + 17),

    @SerializedName("Science: Computers")
    SCIENCE_COMPUTERS(18, "Science: Computers", c + 18),

    @SerializedName("Science: Mathematics")
    SCIENCE_MATHEMATICS(19, "Science: Mathematics", c + 19),

    @SerializedName("Mythology")
    MYTHOLOGY(20, "Mythology", c + 20),

    @SerializedName("Sports")
    SPORTS(21, "Sports", c + 21),

    @SerializedName("Geography")
    GEOGRAPHY(22, "Geography", c + 22),

    @SerializedName("History")
    HISTORY(23, "History", c + 23),

    @SerializedName("Politics")
    POLITICS(24, "Politics", c + 24),

    @SerializedName("Art")
    ART(25, "Art", c + 25),

    @SerializedName("Celebrities")
    CELEBRITIES(26, "Celebrities", c + 26),

    @SerializedName("Animals")
    ANIMALS(27, "Animals", c + 27),

    @SerializedName("Vehicles")
    VEHICLES(28, "Vehicles", c + 28),

    @SerializedName("Entertainment: Comics")
    ENTERTAINMENT_COMICS(29, "Entertainment: Comics", c + 29),

    @SerializedName("Science: Gadgets")
    SCIENCE_GADGETS(30, "Science: Gadgets", c + 30),

    @SerializedName("Entertainment: Japanese Anime & Manga")
    ENTERTAINMENT_JAPANESE_ANIME_MANGA(31, "Entertainment: Japanese Anime & Manga", c + 31),

    @SerializedName("Entertainment: Cartoon & Animations")
    ENTERTAINMENT_CARTOON_ANIMATIONS(32, "Entertainment: Cartoon & Animations", c + 32);
}