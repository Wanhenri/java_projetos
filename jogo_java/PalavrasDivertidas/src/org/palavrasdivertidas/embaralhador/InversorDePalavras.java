package org.palavrasdivertidas.embaralhador;

public class InversorDePalavras implements Embaralhador{

	@Override
	public String embaralhar(String palavra) {
		StringBuilder sb = new StringBuilder();
		for(int i=palavra.length(); i>0; i--){
			sb.append(palavra.charAt(i-1));
		}		
		return sb.toString();
	}

}
