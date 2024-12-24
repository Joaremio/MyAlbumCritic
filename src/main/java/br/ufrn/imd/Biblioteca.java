package br.ufrn.imd;

import java.util.LinkedList;

public interface Biblioteca {
    LinkedList<Album> albums = new LinkedList<>();

    static void add(Album album){
        albums.add(album);
    }
    static void remove(Album album){
        albums.remove(album);
    }
    static void show(){
        albums.forEach(album -> System.out.println(album.getTitle()));
    }
}
