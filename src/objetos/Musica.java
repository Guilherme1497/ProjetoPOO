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
public class Musica extends Item{

    private String artista;
    
    public Musica(int id, String Nome, String duracao, String artista) {
        super(id, Nome, duracao);
        this.setArtista(artista);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
}
