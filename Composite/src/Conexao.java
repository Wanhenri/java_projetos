
public class Conexao extends Escala {
	
	private int taxaEmbarque;

	public Conexao(Trecho inicial, Trecho finale, int taxaEmbarque) {
		super(inicial, finale);
		this.taxaEmbarque = taxaEmbarque;
	}

	@Override
	public int getValor() {
		return super.getValor() + taxaEmbarque;
	}

}
