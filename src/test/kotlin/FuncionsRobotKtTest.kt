import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

/*
Diferents asserts de JUnit per kotlin:
assertFalse(valor)
assertTrue(valor)
assertNotEquals(valorEsperat, valorCalculat)
assertEquals(valorEsperat, valorCalculat)
assertArrayEquals(valorEsperat, valorCalculat)
assertNull(valor)
assertNotNull(valor)
assertSame()
assert(valor) { missatge }
*/

class FuncionsRobotKtTest {

    /**
     * Usem assertEquals i assertNotEquals per valors Double
     * Velocitat inicial, d'1.0, incrementada en +0.5 per defecte -> 1.5
     */
    @Test
    fun checkIfVelocitatIncreasesValue() {
        var expected: Double = 1.5
        assertEquals(expected, accelerar(1.5))
        assertNotEquals(expected, accelerar())
    }

    /**
     * Esperariem que el robot no pugui traspassar el terra
     * Usem assertEquals i assertFalse
     */
    @Test
    fun checkMoureAbaix() {
        var expected: Array<Double> = arrayOf<Double>(0.0, 0.0)
        // Aquest assert fallarà ja que el programa actualment permet traspassar el terra
        assertEquals(expected, baix(arrayOf<Double>(0.0, 0.0), 1.0))
        // Aquest funcionarà bé, però demostra un mal funcionament del programa ja que si li passem
        // velocitat negativa al baixar, el robot puja amunt en lloc de baixar.
        assertFalse((baix(arrayOf<Double>(0.0, 0.0), -1.0))[1] < 0.0)
    }

    /**
     * Usem assertArrayEquals per a fer testing
     */
    @Test
    fun checkMoureDalt() {
        val initialPos: Array<Double> = arrayOf(1.0, 1.0)
        val initialVel: Double = 0.5
        val expected: Array<Double> = arrayOf(1.0, 1.5)

        assertArrayEquals(expected, dalt(initialPos))

        // Aquest assert fallarà ja que la initialPos ha estat modificat en l'execució de l'assert anterior i abans d'iniciar el
        // segon assert, el vector ja conté els valors [1.0, 1.5]
        assertArrayEquals(expected, dalt(initialPos, initialVel))
    }

    /**
     * Usem assertTrue
     */
    @Test
    fun checkMoureEsquerra() {
        val initialPos: Array<Double> = arrayOf(1.0, 1.0)
        val initialVel: Double = 0.5
        val expected: Array<Double> = arrayOf(0.5, 1.0)

        assertArrayEquals(expected, esquerra(initialPos))

        // Aquest assert fallarà ja que la initialPos ha estat modificat en l'execució de l'assert anterior i abans d'iniciar el
        // segon assert, el vector ja conté els valors [1.0, 1.5]
        assertTrue(esquerra(initialPos, initialVel) is Array<Double>)
    }
}
