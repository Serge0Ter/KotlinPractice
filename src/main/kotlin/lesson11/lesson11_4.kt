package org.example.lesson11

import java.awt.Image

class Category(val id: Int, val image: Image, val items: MutableList<String>)
class Recipe(val id: Int, val image: Image, val items: MutableList<String>)
class Ingredients(val id: Int, val image: Image, val items: MutableList<String>)