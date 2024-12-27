package br.ufrn.imd;

public enum Genero {
    POP("Pop"),
    ROCK("Rock"),
    RAP("RAP"),
    R_B("R&B"),
    COUNTRY("Country"),
    ELECTRONIC("Electronic/Dance"),
    MPB("Mpb"),
    INDIE("Indie");

    private final String nome;

    Genero(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
