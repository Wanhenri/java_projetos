import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteBuilderPessoa {

	@Test
	void senhor() {
		PessoaBuilder b = new PessoaBuilder();
		PessoaImpl p = b.criarSenhorChamado("Astolfo").get();
		assertEquals("Sr. Astolfo",p.titulo());
	}
	
	@Test
	void senhora() {
		PessoaBuilder b = new PessoaBuilder();
		PessoaImpl p = b.criarSenhoraChamado("Maricota").get();
		assertEquals("Sra. Maricota",p.titulo());
	}
	
	@Test
	void senhorReitor() {
		PessoaBuilder b = new PessoaBuilder();
		PessoaImpl p = b.criarSenhorChamado("Pedro").queEReitor().get();
		assertEquals("Magnífico(a) Sr. Pedro",p.titulo());
	}
	
	@Test
	void senhorReitorDeputado() {
		PessoaBuilder b = new PessoaBuilder();
		PessoaImpl p = b.criarSenhorChamado("Pedro").queEReitor().queEDeputado().get();
		assertEquals("Excelentíssimo(a) Magnífico(a) Sr. Pedro",p.titulo());
	}
	
	@Test
	void reitoraSabia()) {
		PessoaBuilder b = new PessoaBuilder();
		Pessoa p = b.criarSenhoraChamado("Madalena").queEReitor().adicionando("de grande sapiência").depois().get();
		assertEquals("Magnifínico(a) Sra. Madalena de grande sapiência",p.titulo());
	}

}
