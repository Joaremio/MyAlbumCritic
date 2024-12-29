package br.ufrn.imd;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.Comparator;
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


    static void pesquisar(String title) {
        boolean found = false;  // Variável para verificar se algum álbum foi encontrado

        // Busca por título ou artista
        for (Album album : albums) {
            // Verificando se o título ou o artista do álbum corresponde à pesquisa
            if (album.getTitle().equalsIgnoreCase(title) || album.getArtist().equalsIgnoreCase(title)) {
                if (!found) {
                    System.out.println("Álbuns encontrados para: " + title);
                    System.out.println("------------------------------------------------");
                    found = true;  // Marca que ao menos um álbum foi encontrado
                }
                System.out.println(album.toString());  // Exibe o álbum encontrado
                System.out.println("------------------------------------------------");
            }
        }

        // Caso não encontre nenhum álbum
        if (!found) {
            System.out.println("Nenhum álbum encontrado para o título ou artista: " + title);
        }
    }


    static void classificarPor(Classificar classificar) {
        Comparador comparador = new Comparador();

        switch (classificar) {
            case NOTAS -> {
                comparador.ordenarNotas();
                comparador.aplicarOrdem(albums);
                albums.forEach(album -> System.out.println("Album: " + album.getTitle() + "\nArtista: " + album.getArtist() + "\nNota: " + album.getNote() + "\n------------------------------------------------"));
            }
            case ORDEM_ALFABETICA -> {
                comparador.ordenarPorNome();
                comparador.aplicarOrdem(albums);
                albums.forEach(album -> System.out.println(album.toString()));
            }
            case ANO -> {
                comparador.ordenarPorAno();
                comparador.aplicarOrdem(albums);
                albums.forEach(album -> System.out.println(album.toString()));
            }
        }
    }

}
