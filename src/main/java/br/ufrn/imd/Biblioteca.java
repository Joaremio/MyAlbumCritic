package br.ufrn.imd;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.LinkedList;

public interface Biblioteca {
    LinkedList<Album> albums = new LinkedList<>();

    static void add(String title, String artist, Genero genre, String year){
        Album album = new Album(title, artist, genre, year);
        albums.add(album);
    }
    static void remove(String title){
        for(Album album : albums){
            if(album.getTitle().equals(title)){
                albums.remove(album);
                return;
            }
        }
        System.out.println("Album nao encontrado");
    }

    static void addCritica(String title, double note, String opiniao){
        for(Album album: albums){
            if(album.getTitle().equals(title)){
                album.myOpinion(opiniao,note);
            }
        }
    }

    static void show() {
        for (Album album : albums) {
            // Se a nota for diferente de 0 e a opinião não for null, exibe todas as informações
            if (album.getNote() != 0 && album.getOpinion() != null) {
                System.out.println("------------------------------------------------");
                System.out.println("Álbum: " + album.getTitle() +
                        "\nGênero: " + album.getGenre() +
                        "\nLançamento: " + album.getYear() +
                        "\nNota: " + album.getNote() +
                        "\nOpinião: " + album.getOpinion());
                System.out.println("------------------------------------------------");
            }
            // Caso contrário, exibe apenas o nome, gênero e lançamento
            else {
                System.out.println("------------------------------------------------");
                System.out.println("Álbum: " + album.getTitle() +
                        "\nGênero: " + album.getGenre() +
                        "\nLançamento: " + album.getYear());
                System.out.println("------------------------------------------------");
            }
        }
    }


    static void pesquisar(String title){
        for(Album album: albums){
            if(album.getTitle().equals(title)){
                System.out.println("Album encontrado com sucesso:");
                System.out.println(album.toString());
                return;
            }
        }
        System.out.println("Nennhum disco com esse nome foi adicionado a biblioteca!");
    }

}
