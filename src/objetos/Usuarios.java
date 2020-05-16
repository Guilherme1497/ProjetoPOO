package objetos;

import java.util.ArrayList;


public class Usuarios {
    private ArrayList<Usuario>grupo;
    
    public Usuarios(){
        this.grupo = new ArrayList<>();
    }
    
    
    public ArrayList<Usuario> getGrupo() {
            return this.grupo;
        }
    
    
     public void addAdmin(String nome, String senha, String email){
            
            try {
                
                Admin admin = new Admin(nome, senha, email);
                grupo.add(admin);
            }catch(Exception e) {
                System.err.println(e.getMessage());
            }
            
        }
     
      public void addCliente(String nome, String senha, String email, String Cpf, String Endereco, String Conta){
            
            try {
                
                Cliente cliente = new Cliente(nome, senha, email, Cpf, Endereco, Conta);
                grupo.add(cliente);
            }catch(Exception e) {
                System.err.println(e.getMessage());
            }
            
        }
    
    public String toString(){
		String lista = "";
		
		for(Usuario i:grupo){
			
			if(i instanceof Admin){
				
				lista = "Login: " + i.getLogin() + "\n" + "Senha: " + i.getSenha() + "\n" + "Email: " + i.getEmail() + "\nTipo: " + 1;
			}
			if (i instanceof Cliente) {
				
				lista = "Login: " + i.getLogin() + "\n" + "Senha: " + i.getSenha() + "\n" + "Email: " +  i.getEmail() + "\n" + "Cpf: " + ((Cliente)i).getCpf() + "\n" + "Endereco: " + ((Cliente)i).getEndereco() + "\n" + "Conta: " + ((Cliente)i).getConta() + "\nTipo: " + 2;
			}
		}
		return lista;
		
		
	}
    
    public String listar(){
		String lista = "";
		
		for(Usuario i:grupo){
			
			if(i instanceof Admin){
				
				lista += "Login: " + i.getLogin() + "\n" + "Senha: " + i.getSenha() + "\n" + "Email: " + i.getEmail() + "\nTipo: " + 1 + "\n";
			}
			if (i instanceof Cliente) {
				
				lista += "Login: " + i.getLogin() + "\n" + "Senha: " + i.getSenha() + "\n" + "Email: " +  i.getEmail() + "\n" + "Cpf: " + ((Cliente)i).getCpf() + "\n" + "Endereco: " + ((Cliente)i).getEndereco() + "\n" + "Conta: " + ((Cliente)i).getConta() + "\nTipo: " + 2 + "\n";
			}
		}
		return lista;
		
		
	}
    
    public Usuario buscar(String nome){
        
        
        for(Usuario i:grupo){
			
			if(i instanceof Admin){
				if(i.getLogin().equals(nome))
                                    return i;
			}
			if (i instanceof Cliente) {
				if(i.getLogin().equals(nome))
                                    return i;
			}
		}
        
        return null;
    }
      
}