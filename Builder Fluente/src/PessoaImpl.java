
public abstract class PessoaImpl implements Pessoa {
	
	private String nome;
	private TitulacaoStrategy titulacao = new JoaoNinguem();

	
	
	
	public TitulacaoStrategy getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(TitulacaoStrategy titulacao) {
		this.titulacao = titulacao;
	}

	public PessoaImpl(String nome) {
		this.nome = nome;
	}
	
	public String titulo () {
		return titulacao.adicionaTitulo() + tratamento() + " " + nome;
	}

	protected abstract  String tratamento();
	
	
	

}
