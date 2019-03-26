package org.palavrasdivertidas.mecanica;

public class FabricaMecanicaDoJogo {
	
	public static MecanicaDoJogo get(){
		return new CincoPalavrasInfinitasTentativas();
	}

}
