package org.palavrasdivertidas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmbaralhadores {

	@Test
	public void testInversor() {
		InversorDePalavras inv = new InversorDePalavras();
		String resultado = inv.embaralhar("EDUARDO");
		assertEquals("ODRAUDE", resultado);
	}
	
	@Test
	public void testTrocaParImpar() {
		TrocaParImpar troca =  new TrocaParImpar();
		String resultado = troca.embaralhar("EDUARDO");
		assertEquals("DEAUDRO", resultado);
	}
}
