
public class TodasAsPalavras implements ObservadorPalavra {
	
	private int total = 0;

	@Override
	public void notificaPalavra(String palavra) {
		total++;
		
	}

	@Override
	public int palavrasContadas() {
		return total;
	}

}
