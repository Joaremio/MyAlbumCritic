package br.ufrn.imd;

import java.util.Comparator;
import java.util.List;

public class Comparador {
    private Comparator<Album> comparador=null;

    public void ordenarNotas(){
        comparador = Comparator.comparingDouble(Album::getNote).reversed();
    }
    public void ordenarPorNome(){
        comparador = Comparator.comparing(Album::getTitle);
    }

    public void ordenarPorAno(){
        comparador = Comparator.comparing(Album::getYear);
    }

    public void aplicarOrdem(List<Album> albums){
        if(comparador!=null){
            albums.sort(comparador);
        }
        else{
            System.out.println("Nenhum criterio foi definido");
        }
    }
}
