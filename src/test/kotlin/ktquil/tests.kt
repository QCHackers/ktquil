package ktquil

import jquil.QVM
import jquil.g
import jquil.Program

import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test fun f() {
        assertEquals("0.71|00> + 0.71|11>", wavefunction(Program(H(0), CNOT(0, 1))))
    }
}
