/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.*;
import objetos.*;

/**
 *
 * @author magno-trabalho
 */
public class ControleArquivos {
    public static void salvaUsuario(Usuarios users) throws IOException{
        //NOVO ARQUIVO	
        File arquivo = new File("Usuario.txt");
        if(!arquivo.exists())
            arquivo.createNewFile();
        		
		
		//ESCRITA NO ARQUIVO
		FileWriter escritor = new FileWriter(arquivo,true);
		PrintWriter pw = new PrintWriter(escritor);
        
        
        String lista = users.toString();
                pw.println(lista);
                pw.flush();

        System.out.println("Usuário Cadastrado com Sucesso!");

        //SEMPRE FECHAR OS ESCRITORES/LEITORES DE ARQUIVO

        pw.close();
        escritor.close();
        }
    
    public static void reescreveUsuario(Usuarios users) throws IOException{
        //NOVO ARQUIVO	
        File arquivo = new File("Usuario.txt");
        if(!arquivo.exists())
            arquivo.createNewFile();
        		
		
		//ESCRITA NO ARQUIVO
		FileWriter escritor = new FileWriter(arquivo);
		PrintWriter pw = new PrintWriter(escritor);
        
        
        String lista = users.listar();
                pw.println(lista);
                pw.flush();

        System.out.println("Usuário Cadastrado com Sucesso!");

        //SEMPRE FECHAR OS ESCRITORES/LEITORES DE ARQUIVO

        pw.close();
        escritor.close();
        }

    public static Usuarios recuperarUsuarios() throws IOException{
        File arquivo = new File("Usuario.txt");
        if(!arquivo.exists()){
            arquivo.createNewFile();
            Usuarios users = new Usuarios();
            users.addAdmin("admin", "admin", "admin");
            salvaUsuario(users);
        }
        
        FileReader leitor = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(leitor);
        Usuarios users = new Usuarios();
        String login = "";
        String senha = "";
        String email = "";
        String cpf = "";
        String endereco = "";
        String conta = "";
        int tipo = 0;
        
        while(br.ready()){
            //leitura de cada linha
            String linha = br.readLine();
            //verificação de cada linha
            if(linha.startsWith("Login: "))
                login = linha.substring("Login: ".length(), linha.length());
            if(linha.startsWith("Senha: "))
                senha = linha.substring("Senha: ".length(), linha.length());
            if(linha.startsWith("Email: "))
                email = linha.substring("Email: ".length(), linha.length());
            if(linha.startsWith("Cpf: "))
                cpf = linha.substring("Cpf: ".length(), linha.length());
            if(linha.startsWith("Endereco: "))
                endereco = linha.substring("Endereco: ".length(), linha.length());
            if(linha.startsWith("Conta: "))
                conta = linha.substring("Conta: ".length(), linha.length());
            if(linha.startsWith("Tipo: "))
                tipo = Integer.parseInt(linha.substring("Tipo: ".length(), linha.length()));
            
            if(tipo == 1){
                users.addAdmin(login, senha, email);
                tipo = 0;
            }else if(tipo == 2){
                users.addCliente(login, senha, email, cpf, endereco, conta);
                tipo = 0;
            }
                
        }
        
        br.close();
        
        return users;
    }
    
    
    public static void salvarBiblioteca(Biblioteca bib) throws IOException{
        File arquivo = new File("Biblioteca.txt");
        if(!arquivo.exists())
            arquivo.createNewFile();
        
        //ESCRITA NO ARQUIVO
		FileWriter escritor = new FileWriter(arquivo,true);
		PrintWriter pw = new PrintWriter(escritor);
                
        String lista = bib.toString();
            pw.println(lista);
            pw.flush();
            
        System.out.println("Item Cadastrado com Sucesso!");

        //SEMPRE FECHAR OS ESCRITORES/LEITORES DE ARQUIVO

        pw.close();
        escritor.close();
    }
    
    public static void reescreveBiblioteca(Biblioteca bib) throws IOException{
        File arquivo = new File("Biblioteca.txt");
        if(!arquivo.exists())
            arquivo.createNewFile();
        
        //ESCRITA NO ARQUIVO
		FileWriter escritor = new FileWriter(arquivo);
		PrintWriter pw = new PrintWriter(escritor);
                
        String lista = bib.toString();
            pw.println(lista);
            pw.flush();
            
        System.out.println("Item Cadastrado com Sucesso!");

        //SEMPRE FECHAR OS ESCRITORES/LEITORES DE ARQUIVO

        pw.close();
        escritor.close();
    }
    
    public static Biblioteca recuperarBiblioteca()throws IOException{
        
        File arquivo = new File("Biblioteca.txt");
        if(!arquivo.exists())
            arquivo.createNewFile();
        
        FileReader leitor = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(leitor);
        Biblioteca biblio = new Biblioteca();
        int id = 0;
        String nome = "";
        String duracao = "";
        String diretor = "";
        String genero = "";
        String artista = "";
        int n_episodio = 0;
        int tipo = 0;
        
        while(br.ready()){
            //leitura de cada linha
            String linha = br.readLine();
            //verificação de cada linha
            if(linha.startsWith("Id: "))
                id = Integer.parseInt(linha.substring("Id: ".length(), linha.length()));
            if(linha.startsWith("Nome: "))
                nome = linha.substring("Nome: ".length(), linha.length());
            if(linha.startsWith("Duracao: "))
                duracao = linha.substring("Duracao: ".length(), linha.length());
            if(linha.startsWith("Diretor: "))
                diretor = linha.substring("Diretor: ".length(), linha.length());
            if(linha.startsWith("Genero: "))
                genero = linha.substring("Genero: ".length(), linha.length());
            if(linha.startsWith("Artista: "))
                artista = linha.substring("Artista: ".length(), linha.length());
            if(linha.startsWith("N_Episodios: "))
                n_episodio = Integer.parseInt(linha.substring("N_Episodios: ".length(), linha.length()));
            if(linha.startsWith("Tipo: "))
                tipo = Integer.parseInt(linha.substring("Tipo: ".length(), linha.length()));
            
            switch (tipo) {
                case 1:
                    biblio.addFilme(id, nome, duracao, diretor, genero);
                    tipo = 0;
                    break;
                case 2:
                    biblio.addMusica(id, nome, duracao, artista);
                    tipo = 0;
                    break;
                case 3:
                    biblio.addSerie(id, nome, duracao, n_episodio);
                    tipo = 0;
                    break;
                default:
                    break;
            }
                
        }
        
        br.close();
        
        return biblio;
    }
        
    
}

