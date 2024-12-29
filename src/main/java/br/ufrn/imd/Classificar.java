package br.ufrn.imd;

public enum Classificar {

    NOTAS("Notas"),
    ORDEM_ALFABETICA("Ordem Alfabética"),
    ANO("Ano");

    private String classifi;


    Classificar(String classifi) {
        this.classifi = classifi;
    }

    public String getClassifi() {
        return classifi;
    }
}
