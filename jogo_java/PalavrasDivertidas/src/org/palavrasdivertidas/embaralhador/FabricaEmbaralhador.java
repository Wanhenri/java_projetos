package org.palavrasdivertidas.embaralhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhador {	
	
		private static List<Embaralhador> opcoes= new ArrayList<>();
		
		static {
			opcoes.add(new InversorDePalavras());
			opcoes.add(new TrocaParImpar());
		}
		
		public static Embaralhador getRandom() {
			Random r = new Random(System.currentTimeMillis());
			int referencia = r.nextInt();
			int indice = referencia % opcoes.size();
			return opcoes.get(Math.abs(indice));
		}
}
