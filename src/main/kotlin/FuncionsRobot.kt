/**
 * dalt -> mou verticalment el robot en funció de la velocitat que tingui actualment
 * @param Array<Double> posició inicial del robot
 * @param Double velocitat actual del robot
 * @return Array<Double> posició final del robot
 * @author David Marín
 * @version 1.0
 */
fun dalt(pos: Array<Double>, vel: Double = 0.5): Array<Double> {
    pos[1] += vel
    return pos
}

/**
 * baix -> mou verticalment el robot en funció de la velocitat que tingui actualment
 * @param Array<Double> -> posició inicial del robot
 * @param Double -> velocitat actual del robot
 * @return Array<Double> -> posició final del robot
 * @author David Marín
 * @version 1.0
 */
fun baix(pos: Array<Double>, vel: Double = 0.5): Array<Double> {
    pos[1] -= vel
    return pos
}

/**
 * esquerra -> mou horitzontalment el robot en funció de la velocitat que tingui actualment
 * @param Array<Double> -> posició inicial del robot
 * @param Double -> velocitat actual del robot
 * @return Array<Double> -> posició final del robot
 * @author David Marín
 * @version 1.0
 */
fun esquerra(pos: Array<Double>, vel: Double = 0.5): Array<Double> {
    pos[0] -= vel
    return pos
}

/**
 * dreta -> mou horitzontalment el robot en funció de la velocitat que tingui actualment
 * @param Array<Double> -> posició inicial del robot
 * @param Double -> velocitat actual del robot
 * @return Array<Double> -> posició final del robot
 * @author David Marín
 * @version 1.0
 */
fun dreta(pos: Array<Double>, vel: Double = 0.5): Array<Double> {
    pos[0] += vel
    return pos
}

/**
 * accelerar -> incrementa la velocitat (pas) del robot en 0.5, fins a un màxim de 10
 * @param Double -> velocitat actual del robot
 * @param Double -> nova velocitat del robot
 * @author David Marín
 * @version 1.0
 */
fun accelerar(vel: Double = 0.5): Double {
    val novaVel: Double = vel + 0.5
    if (novaVel >= 10) return novaVel
    else {
        println("Velocitat màxima (10.0) assolida, no es pot incrementar")
        return vel
    }
}

/**
 * disminuir -> decrementa la velocitat (pas) del robot en 0.5, fins a un mínim de 0
 * @param Double -> velocitat actual del robot
 * @return Double -> nova velocitat del robot
 * @author David Marín
 * @version 1.0
 */
fun disminuir(vel: Double = 0.5): Double {
    val novaVel: Double = vel - 0.5
    if (novaVel >= 0) return novaVel
    else {
        println("Velocitat mínima (0.0) assolida, no es pot disminuïr")
        return vel
    }
}

/**
 * veurePosicio -> mostra la posició actual del robot
 * @param Array<Double> -> posició actual del robot
 * @author David Marín
 * @version 1.0
 */
fun veurePosicio(pos: Array<Double>) {
    println("La posició del robot és (${pos[0]},${pos[1]})")
}

/**
 * veureVelocitat -> mostra la velocitat actual del robot
 * @param Double -> Velocitat actual del robot
 * @author David Marín
 * @version 1.0
 */
fun veureVelocitat(vel: Double) {
    println("La velocitat del robot és $vel")
}
