package org.palavrasdivertidas.mecanica;

import org.palavrasdivertidas.dados.BancoDePalavras;

public class MorteSubita implements MecanicaDoJogo {
	
	private int palavrasCertas = 0;
	private boolean errou = false;
	private BancoDePalavras banco = new BancoDePalavras();
	@Override
	public String getNome() {
		return "MORTE SUBITA";
	}

	@Override
	public String getDescricao() {
		return "Tente adivinhar a palavra até errar!";
	}

	@Override
	public boolean jogoAcabou() {
		return errou;
	}

	@Override
	public String getPalavraDaRodada() {
		return banco.getNext();
	}

	@Override
	public String tentativa(String palavra, String resposta) {
		if(palavra.contentEquals(resposta)) {
			palavrasCertas++;
			return "Acertou! Quero ver se consegue a próxima!";
		}else {
			errou = true;
			return "Errou feio, errou feio, errou rude!";
		}		
	}

	@Override
	public String resultadoFinal() {
		return "Você conseguiu acertar " +palavrasCertas +  " palavras";
	}

}
