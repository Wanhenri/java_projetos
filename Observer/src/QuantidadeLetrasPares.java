
public class QuantidadeLetrasPares implements ObservadorPalavra {
	
	private int total = 0;
	
	@Override
	public void notificaPalavra(String palavra) {
		if(palavra.length() % 2 == 0) {
			total++;
		}

	}

	@Override
	public int palavrasContadas() {		
		return total;
	}

}
