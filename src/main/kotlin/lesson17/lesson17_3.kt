package org.example.lesson17

class Package(name: String, var countFiles: Int, val secret: Boolean) {
    val name: String = name
        get() = if (this.secret == true) {
            countFiles = 0
            "Скрытая папка - количеств файлов $countFiles"
        } else {
            field
        }

}

fun main() {

    val file = Package("File", 15, true)
    println(file.name)

}
