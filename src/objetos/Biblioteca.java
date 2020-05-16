/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author magno-trabalho
 */
public class Biblioteca {
    private ArrayList<Item> biblioteca;

    public Biblioteca() {
        this.biblioteca = new ArrayList<>();
    }

    public ArrayList<Item> getBiblioteca() {
        return biblioteca;
    }
    
    public void addFilme(int id, String Nome, String duracao, String diretor, String genero){
        Filme novo = new Filme(id, Nome, duracao, diretor, genero);
        this.biblioteca.add(novo);
    }
    
    public void addMusica(int id, String Nome, String duracao, String artista){
        Musica novo = new Musica(id, Nome, duracao, artista);
        this.biblioteca.add(novo);
    }
    
    public void addSerie(int id, String Nome, String duracao, int n_episodios){
        Serie novo = new Serie(id, Nome, duracao, n_episodios);
        this.biblioteca.add(novo);
    }
    
    public void removerFilme(String nome){
        for(Item i : this.biblioteca){
            if(i instanceof Filme && ((Filme)i).getNome().equals(nome)){
                biblioteca.remove(i);
                break;
            }
        }
    }
    
    public void removerMusica(String nome){
        for(Item i : this.biblioteca){
            if(i instanceof Musica && ((Musica)i).getNome().equals(nome)){
                biblioteca.remove(i);
                break;
            }
        }
    }
    
    public void removerSerie(String nome){
        for(Item i : this.biblioteca){
            if(i instanceof Serie && ((Serie)i).getNome().equals(nome)){
                biblioteca.remove(i);
                break;
            }
        }
    }
    
    @Override
    public String toString(){
        String lista = "";
        
        for(Item i : this.biblioteca){
            if(i instanceof Filme){
                lista = "Id: " + i.getId() + "\n" + "Nome: " + i.getNome() + "\n" + "Duracao: " + i.getDuracao() + "\nDiretor: " + ((Filme) i).getDiretor() + "\nGenero: " + ((Filme) i).getGenero() + "\nTipo: " + 1;
            }
            
            if(i instanceof Musica){
                lista = "Id: " + i.getId() + "\n" + "Nome: " + i.getNome() + "\n" + "Duracao: " + i.getDuracao() + "\nArtista: " + ((Musica) i).getArtista() + "\nTipo: " + 2;
            }
            
            if(i instanceof Serie){
                lista = "Id: " + i.getId() + "\n" + "Nome: " + i.getNome() + "\n" + "Duracao: " + i.getDuracao() + "\nN_Episodios: " + ((Serie) i).getN_episodios() + "\nTipo: " + 3;
            }
        }
        
        return lista;
    }
    
}
