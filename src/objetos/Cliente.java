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
public class Cliente extends Usuario{

    private String cpf;
    private String endereco;
    private String conta;
    
    public Cliente(String login, String senha, String email, String Cpf, String Endereco, String Conta) {
        super(login, senha, email);
        this.setCpf(Cpf);
        this.setEndereco(Endereco);
        this.setConta(Conta);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
    
}
