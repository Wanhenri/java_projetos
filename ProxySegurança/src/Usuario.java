import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String login;
	private List<String> permissoes;
	
	public Usuario(String login) {
		this.login = login;
		permissoes = new ArrayList<String>();
	}
	
	public void addPermissao(String classe, String metodo) {
		permissoes.add(classe+"::"+metodo);
	}
	public boolean verificaPermissao(String classe, String metodo) {
		return permissoes.contains(classe+"::"+metodo);
	}
}
