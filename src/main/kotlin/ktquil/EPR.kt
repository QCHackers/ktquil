package ktquil

import jquil.QVM
import jquil.g
import jquil.Program
import java.util.Arrays
import java.util.ArrayList

fun H(qubit : Int) : String{
	return g.H(qubit)
}

fun X(qubit : Int) : String{
	return g.H(qubit)
}

fun CNOT(qubit0 : Int, qubit1 : Int) : String{
	return g.CNOT(qubit0, qubit1)
}

fun wavefunction(program : Program) : String {
	return QVM.wavefunction(program,listOf(1, 2, 3))
}

fun main(args: Array<String>) {
	println(wavefunction(Program(H(0), CNOT(0, 1))))
}
