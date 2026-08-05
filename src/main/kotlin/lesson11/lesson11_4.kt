package org.example.lesson11

class Category(val id: Int, val image: String, val categories: Categories)
class Recipe(val id: Int, val image: String, val title: MutableList<String>)
class Ingredient(val id: Int, val image: String, val ingredients: Map<String, Int>)

enum class Categories {
    BURGER, PIZZA, SOUP, DESERT, SALAD, FISH
}