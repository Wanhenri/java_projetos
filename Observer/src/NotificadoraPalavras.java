import java.util.ArrayList;
import java.util.List;

public class NotificadoraPalavras {
	
	private List<ObservadorPalavra> observers = new ArrayList<>();
	
	public void adicionaObserver(ObservadorPalavra o) {
		observers.add(o);
	}

	public List<ObservadorPalavra> getObservers() {
		return observers;
	}
	
	public void processarFrase(String frase) {
		String[] palavras = frase.split(" ");
		for(String palavra : palavras) {
			for(ObservadorPalavra o : observers) {
				o.notificaPalavra(palavra);
			}
		}
	}
	
	
}
