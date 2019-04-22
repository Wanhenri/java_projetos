
public class Mock implements ExecutarProcedimentos {
	
	public boolean executarTarefaRodou = false;
	public boolean operarDispositivoRodou = false;
	public boolean prepararOperacaoRodou = false;

	@Override
	public void executarTarefa() {
		executarTarefaRodou = true;

	}

	@Override
	public void operarDispositivo() {
		operarDispositivoRodou = true;

	}

	@Override
	public void prepararOperacao() {
		prepararOperacaoRodou = true;

	}

}
