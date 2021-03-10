package br.alex.testeunitario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
	Calculadora calc = new Calculadora();
	
	@Test
	public void testeSomar() {
		int soma = calc.somar(1, 3);
		assertEquals(4, soma);
	}
	
	@Test
	public void dividir() {
		double divisao = calc.dividir(1, 1);
		assertEquals(1.0D, divisao);
	    
	}
	
	@Test
	public void  subtrair() {
		int sub = calc.subtrair(1, 1);
		assertEquals(0, sub);
	}
	
	@Test
	public void testarSubtracaoComMock() {
		Calculadora  algo = mock(Calculadora.class);
		when(algo.subtrair(2, 2)).thenReturn(0);
		
		int res = calc.subtrair(2, 2);
		assertEquals(0, res);
	}

}
