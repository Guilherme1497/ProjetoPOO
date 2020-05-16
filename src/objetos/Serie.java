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
public class Serie extends Item{

    private int n_episodios;

    public Serie(int id, String Nome, String duracao, int n_episodios) {
        super(id, Nome, duracao);
        this.setN_episodios(n_episodios);
    }
    
    public int getN_episodios() {
        return n_episodios;
    }

    public void setN_episodios(int n_episodios) {
        this.n_episodios = n_episodios;
    }
    
}
