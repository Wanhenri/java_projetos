import static org.junit.Assert.*;

import org.junit.Test;

public class TesteTrecho {

	@Test
	public void test() {
		Trecho t1 = new TrechoSimples("Rio de Janeiro", "São Paulo", 200, 350);
		Trecho t2 = new TrechoSimples("São Paulo", "Brasilia", 350, 600);
		Trecho t3 = new TrechoSimples("Brasilia", "Fortaleza", 300, 500);
		Escala escala = new Escala(t1,t2);
		Conexao conexao = new Conexao(escala,t3,100);
		assertEquals("Rio de Janeiro",conexao.getOrigem());
		assertEquals("Fortaleza",conexao.getDestino());
		assertEquals(950,conexao.getValor());
		assertEquals(1450,conexao.getDistancia());
				
	}

}
