/**
 * main -> cos principal del programa
 * @author David Marín
 * @version 1.0
 */
fun main() {
    //posició és un array de double's de dos valors, la x del robot a la posició 0 i la y del robot a la posició 1
    var posicio = arrayOf<Double>(0.0, 0.0)
    //velocitat és el pas que fa el robot cada vegada que es desplaça
    var velocitat: Double = 1.0

    mostrarAjuda()
    //bucle principal del programa, que es va executant indefinidament fins que l'usuari introdueïx la comanda END
    do {
        print("Escull Opció: ")
        var opcMenu = readln()
        when (opcMenu.uppercase()) {
            "DALT" -> posicio = dalt(posicio, velocitat)
            "BAIX" -> posicio = baix(posicio, velocitat)
            "ESQUERRA" -> posicio = esquerra(posicio, velocitat)
            "DRETA" -> posicio = dreta(posicio, velocitat)
            "ACCELERAR" -> velocitat = accelerar(velocitat)
            "DISMINUIR" -> velocitat = disminuir(velocitat)
            "POSICIO" -> veurePosicio(posicio)
            "VELOCITAT" -> veureVelocitat(velocitat)
            "MENU" -> mostrarMenu()
            "AJUDA" -> mostrarAjuda()
            "END" -> println("Fins la propera")
            else -> println("ERROR, opció incorrecta!")
        }
    } while (opcMenu != "END")
}