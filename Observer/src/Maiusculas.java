
public class Maiusculas implements ObservadorPalavra {
	
	private int total = 0;

	@Override
	public void notificaPalavra(String palavra) {
		if(Character.isUpperCase(palavra.charAt(0))) {
			total++;
		}

	}

	@Override
	public int palavrasContadas() {		
		return total;
	}

}
