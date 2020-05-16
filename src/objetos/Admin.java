
package objetos;

public class Admin extends Usuario {

	private int acessos;
        
        
	public Admin(String login, String senha, String email) {
		super(login, senha, email);
		this.acessos = 0;
	}
	
	
}