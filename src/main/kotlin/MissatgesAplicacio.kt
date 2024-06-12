/**
 * mostrarMenu -> mostra el menú de comandes del robot
 * @author David Marín
 * @version 1.0
 */
fun mostrarMenu() {
    //TODO: afegir petita descripció a cada opció
    val str = """
        |########################
        |# OPCIONS ROBOT        #
        |# DALT                 #
        |# BAIX                 #
        |# ESQUERRA             #
        |# DRETA                #
        |# ACCELERAR            #
        |# DISMINUIR            #
        |# POSICIO              #
        |# VELOCITAT            #
        |# MENU                 #
        |# END - Sortir         #
        |########################
        """.trimMargin()
    println(str)
}

/**
 * mostrarAjuda -> mostra una finestra explicativa del funcionament del robot
 * @author David Marín
 * @version 1.0
 */
fun mostrarAjuda() {
    val str = """
        |#############################################################################
        |# Aquesta aplicació simula el moviment d'un robot controlat per l'usuari.   #
        |# Disposa d'un conjunt d'instruccions que l'usuari pot escriure:            #
        |# DALT, BAIX, ESQUERRA, DRETA, ACCELERAR, DISMINUIR, POSICIO i VELOCITAT    #
        |# Així com veure les comandes (MENU) o aquesta ajuda (AJUDA)                #
        |# Per finalitzar l'aplicació, caldrà escriure la comanda END                #
        |#############################################################################
        """.trimMargin()
    println(str)
}