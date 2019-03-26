package org.palavrasdivertidas.dados;

import java.util.Scanner;

import org.palavrasdivertidas.embaralhador.Embaralhador;
import org.palavrasdivertidas.embaralhador.FabricaEmbaralhador;
import org.palavrasdivertidas.mecanica.FabricaMecanicaDoJogo;
import org.palavrasdivertidas.mecanica.MecanicaDoJogo;

public class Principal {

	public static void main(String[] args) {
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.get();
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("*** %%% Bem-vindo ao Palavras Divertidas %%% ***\n\n");
		
		System.out.println("Você vai jogar no modo: "+mecanica.getNome() + "\n");
		System.out.println("Descricao: "+mecanica.getDescricao()+ "\n\n");
		
		while(!mecanica.jogoAcabou()) {
			String palavra = mecanica.getPalavraDaRodada();
			Embaralhador emb = FabricaEmbaralhador.getRandom();
			String embaralhada = emb.embaralhar(palavra);
			System.out.println("Adivinhe qual a palavra:" + embaralhada);
			String resposta = in.nextLine().toUpperCase();
			String resultado = mecanica.tentativa(palavra, resposta);
			System.out.println(resultado);
		}		
		System.out.println(mecanica.resultadoFinal());
	}

}
