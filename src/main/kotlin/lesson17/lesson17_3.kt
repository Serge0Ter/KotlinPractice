package org.example.lesson17

class Package(name: String, countFiles: Int, val secret: Boolean) {
    val name: String = name
        get() = if (this.secret) {
            "скрытая папка"
        } else {
            field
        }
    val countFiles: Int = countFiles
        get() = if (this.secret) 0 else field

}

fun main() {

    val file = Package("File", 15, true)
    println(file.name)
    println(file.countFiles)

}
