
public class Principal {

	public static void main(String[] args) {
		NotificadoraPalavras not = new NotificadoraPalavras();
		not.adicionaObserver(new TodasAsPalavras());
		not.adicionaObserver(new Maiusculas());
		not.adicionaObserver(new QuantidadeLetrasPares());
		
		not.processarFrase("O rato roeu a roupa do Rei de Roma");
		
		for(ObservadorPalavra o : not.getObservers()) {
			System.out.println(o.getClass() + "="  + o.palavrasContadas());
			
		}

	}

}
