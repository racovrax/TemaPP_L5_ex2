package ro.mike.tuiasi

import java.util.Scanner

fun main() {
    val managerNotite = ManagerNotite()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("1. Afișează note")
        println("2. Adaugă notă")
        println("3. Șterge notă")
        println("4. Ieșire")

        when (scanner.nextLine()) {
            "1" -> managerNotite.afiseazaNotite()
            "2" -> {
                println("Introduceți autorul notei:")
                val user = scanner.nextLine()
                println("Introduceți conținutul notei:")
                val continut = scanner.nextLine()
                managerNotite.adaugaNota(User(user), continut)
            }
            "3" -> {
                println("Introduceți indexul notei de șters:")
                val index = scanner.nextLine().toIntOrNull()
                if (index != null) {
                    managerNotite.stergeNota(index)
                } else {
                    println("Vă rugăm să introduceți un număr valid.")
                }
            }
            "4" -> {
                println("Ieșire din aplicație...")
                break
            }
            else -> println("Opțiune invalidă, vă rugăm să alegeți din nou.")
        }
    }
}