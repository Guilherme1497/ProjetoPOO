/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author magno-trabalho
 */
public abstract class Usuario {
    private String Login;
    private String Senha;
    private String email;
    
    public Usuario(String login, String senha, String email){
        this.setLogin(login);
        this.setSenha(senha);
        this.setEmail(email);
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
