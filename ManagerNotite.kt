package ro.mike.tuiasi
import java.io.File
import java.time.LocalDateTime
import kotlin.system.exitProcess

class ManagerNotite {
    private val listaNotite = mutableListOf<Nota>()

    fun adaugaNota(user: User, continut: String) {
        listaNotite.add(Nota(user, LocalDateTime.now(), continut))
        println("Notă adăugată cu succes.")
    }

    fun stergeNota(index: Int) {
        if (index >= 0 && index < listaNotite.size) {
            listaNotite.removeAt(index)
            println("Notă ștearsă cu succes.")
        } else {
            println("Index invalid.")
        }
    }

    fun afiseazaNotite() {
        listaNotite.forEachIndexed { index, nota ->
            println("Index: $index | Autor: ${nota.user} | Data: ${nota.data} | Conținut: ${nota.continut}")
        }
    }
}
