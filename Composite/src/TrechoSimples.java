
public class TrechoSimples implements Trecho {
	
	private String origem;
	private String destino;
	private int valor;
	private int distancia;
	
	public TrechoSimples(String origem, String destino, int valor, int distancia) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
		this.distancia = distancia;
	}

	@Override
	public String getOrigem() {
		return origem;
	}

	@Override
	public String getDestino() {
		return destino;
	}

	@Override
	public int getValor() {
		return valor;
	}

	@Override
	public int getDistancia() {
		return distancia;
	}
	
	
}
