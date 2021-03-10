package br.alex.testeunitario;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AlgoritimoTeste {
	
	Algoritmos algo = new Algoritmos();
	
	@Test
	public boolean testarNumeroPar() {
       boolean bool = algo.ehPar(2);
       assertTrue(bool);
       return bool;
	}
	
	@Test
	public void testarNumero() {
		boolean bool = testarNumeroPar();
		assertEquals(true, bool);
	}

}
