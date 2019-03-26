package org.palavrasdivertidas.embaralhador;

public class TrocaParImpar implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<palavra.length(); i++){
			if(i % 2 != 0) {
				sb.append(palavra.charAt(i));
				sb.append(palavra.charAt(i-1));
			}else if(i == palavra.length()-1) {
				sb.append(palavra.charAt(i));
			}
		}		
		return sb.toString();
	}

}
