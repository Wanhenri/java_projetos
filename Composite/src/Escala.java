
public class Escala implements Trecho {
	
	private Trecho inicial;
	private Trecho finale;
		
	public Escala(Trecho inicial, Trecho finale) {
		super();
		if(!inicial.getDestino().equals(finale.getOrigem())){
			throw new RuntimeException();
		}
		this.inicial = inicial;
		this.finale = finale;
	}

	@Override
	public String getOrigem() {
		return inicial.getOrigem();
	}

	@Override
	public String getDestino() {
		return finale.getDestino();
	}

	@Override
	public int getValor() {
		return inicial.getValor() + finale.getValor();
	}

	@Override
	public int getDistancia() {
		return inicial.getDistancia() + finale.getDistancia();
	}

}
