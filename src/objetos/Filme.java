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
public class Filme extends Item{
    
    private String diretor;
    private String genero;
    
    public Filme(int id, String Nome, String duracao, String diretor, String genero) {
        super(id, Nome, duracao);
        this.setDiretor(diretor);
        this.setGenero(genero);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
