package org.palavrasdivertidas.dados;

import java.util.Random;

public class BancoDePalavras {
	
		private String[] palavras = {"FRODO","GANDALF","LEGOLAS","ARAGORN","SAURON",
				"SARUMAM","VALFENDA","SAM","CONDADO","ELFO","ANÃO","HOBBIT",
				"GOLUM"};
	
		public String getNext() { 
			Random r = new Random(System.currentTimeMillis());
			int referencia = r.nextInt();
			int indice = referencia % (palavras.length-1);
			return palavras[Math.abs(indice)];
		}
}
