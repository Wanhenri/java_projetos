package org.palavrasdivertidas.mecanica;

import org.palavrasdivertidas.dados.BancoDePalavras;

public class CincoPalavrasInfinitasTentativas implements MecanicaDoJogo {
	
	
	private int qtdPalavrasAcertadas = 0;
	private int pontos = 0;
	private BancoDePalavras banco = new BancoDePalavras();
	private String palavraCorrente = banco.getNext();
	
	@Override
	public String getNome() {
		return "Tente a vontade comCinco Palavras";
	}

	@Override
	public String getDescricao() {
		return "Tente fazer o máximo de pontos";
	}

	@Override
	public boolean jogoAcabou() {
		return qtdPalavrasAcertadas == 5;
	}

	@Override
	public String getPalavraDaRodada() {
		return palavraCorrente;
	}

	@Override
	public String tentativa(String palavra, String resposta) {
		if(palavra.contentEquals(resposta)) {
			pontos += 100;
			palavraCorrente = banco.getNext();
			qtdPalavrasAcertadas++;
			return "Acertou! Você ganhou 100 pontos";
		}else {
			pontos -= 50;
			return "Não deu! Perdeu 50 pontos...tente novamente";
		}		
	}

	@Override
	public String resultadoFinal() {
		return "Você conseguiu acertar " +pontos +  " pontos";
	}

}

