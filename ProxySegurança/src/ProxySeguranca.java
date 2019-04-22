
public class ProxySeguranca implements ExecutarProcedimentos {
	
	private ExecutarProcedimentos encapsulado;
	private Usuario usuario;

	public ProxySeguranca(ExecutarProcedimentos encapsulado, Usuario usuario) {
		super();
		this.encapsulado = encapsulado;
		this.usuario = usuario;
	}

	@Override
	public void executarTarefa() {
		if(usuario.verificaPermissao(encapsulado.getClass().getSimpleName(), "executarTarefa")) {
			encapsulado.executarTarefa();
		}else {
			throw new RuntimeException("O usuario nao tem permissao de executar esse método");
		}
	}

	@Override
	public void operarDispositivo() {
		if(usuario.verificaPermissao(encapsulado.getClass().getSimpleName(), "operarDispositivo")) {
			encapsulado.operarDispositivo();
		}else {
			throw new RuntimeException("O usuario nao tem permissao de executar esse método");
		}

	}

	@Override
	public void prepararOperacao() {
		if(usuario.verificaPermissao(encapsulado.getClass().getSimpleName(), "prepararOperacao")) {
			encapsulado.prepararOperacao();
		}else {
			throw new RuntimeException("O usuario nao tem permissao de executar esse método");
		}


	}

}
