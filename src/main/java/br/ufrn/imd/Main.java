package br.ufrn.imd;

public class Main {
    public static void main(String[] args) {
        Biblioteca.add("Folklore","Taylor Swift",Genero.POP,"2020");
        Biblioteca.add("Melodrama","Lorde",Genero.POP,"2016");
        Biblioteca.add("Norman Fucking Rockell","Lana del Rey",Genero.INDIE,"2018");
        Biblioteca.add("Brat", "Charlie XCX", Genero.ELECTRONIC,"2024");
        Biblioteca.add("1989", "Taylor Swift", Genero.POP,"2015");
        Biblioteca.add("Cuzinho_bicudo","Jao",Genero.POP,"2016");


        Biblioteca.addCritica("Folklore",10,"");
        Biblioteca.addCritica("Melodrama",20,"");
        Biblioteca.addCritica("Norman Fucking Rockell",30,"");
        Biblioteca.addCritica("Brat",40,"");
        Biblioteca.addCritica("1989",5,"");




        Biblioteca.show();


    }
}
