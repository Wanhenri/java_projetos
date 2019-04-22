import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteProxySeguranca {

	@Test
	public void consegueExecutar() {
		Usuario u = new Usuario("guerra");
		u.addPermissao("Mock", "executarTarefa");
		Mock obj = new Mock();
		ExecutarProcedimentos proxy = new ProxySeguranca(obj, u);
		proxy.executarTarefa();
		assertTrue(obj.executarTarefaRodou);
		
	}
	
	@Test(expected=RuntimeException.class)
	public void naoConsegueExecutar() {
		Usuario u = new Usuario("guerra");
		u.addPermissao("Mock", "executarTarefa");
		Mock obj = new Mock();
		ExecutarProcedimentos proxy = new ProxySeguranca(obj, u);
		proxy.prepararOperacao();
		
	}

}
