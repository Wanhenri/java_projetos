
public class PessoaBuilder {
	
	private PessoaImpl emConstrucao;
	
	public DepoisDaCriacao criarSenhorChamado(String nome) {
		emConstrucao = new Senhor(nome);
		return new DepoisDaCriacao();
	}
	
	public DepoisDaCriacao criarSenhoraChamado(String nome) {
		emConstrucao = new Senhora(nome);
		return new DepoisDaCriacao();
	}
	
	public class DepoisDaCriacao{
		
		public PessoaImpl get(){
			return emConstrucao;
		}
		
		public DepoisDaCriacao queEReitor() {
			adicionaTitulo(new Reitor());
			return this;			
		}

		private void adicionaTitulo(TitulacaoStrategy nova) {
			if(emConstrucao.getTitulacao() instanceof JoaoNinguem) {
			emConstrucao.setTitulacao(nova);
			}else {
				TitulacaoStrategy t = emConstrucao.getTitulacao();
				emConstrucao.setTitulacao(new TitulacaoComposta(nova, t));
			}
		}
		
		public DepoisDaCriacao queEDeputado() {
			adicionaTitulo(new Deputado());
			return this;			
		}
		
		public DepoisDoAdicionando adicionando(String palavra) {
			DepoisDoAdicionando d = new DepoisDoAdicionando(this, palavra);
			return d;
		}
		
	}
	
	public class DepoisDoAdicionando {
		
		private DepoisDaCriacao depoisDaCriacao;
		private String palavra;
		
		public DepoisDoAdicionando(DepoisDaCriacao depoisDaCriacao, String palavra) {
			this.depoisDaCriacao = depoisDaCriacao;
			this.palavra = palavra;
		}	
		
		public DepoisDaCriacao antes(){
			emConstrucao = new TratamentoAntesProxy(emConstrucao, palavra);
			return depoisDaCriacao;
		}
		
		public DepoisDaCriacao depois(){
			emConstrucao = new TratamentoDepoisProxy(emConstrucao, palavra);
			return depoisDaCriacao;
		}
		
	}

}
