
public class TitulacaoComposta implements TitulacaoStrategy {
	
	private TitulacaoStrategy t1;
	private TitulacaoStrategy t2;
	
	public TitulacaoComposta(TitulacaoStrategy t1, TitulacaoStrategy t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public String adicionaTitulo() {
		return t1.adicionaTitulo() + t2.adicionaTitulo();
	}

}
