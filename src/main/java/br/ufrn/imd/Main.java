package br.ufrn.imd;

public class Main {
    public static void main(String[] args) {
        Biblioteca.add("Folklore","Taylor Swift",Genero.POP,"2020");
        Biblioteca.add("Melodrama","Lorde",Genero.POP,"2016");
        Biblioteca.add("Norman Fucking Rockell","Lana del Rey",Genero.INDIE,"2018");
        Biblioteca.add("Brat", "Charlie XCX", Genero.ELECTRONIC,"2024");


        Biblioteca.addCritica("Folklore", 5.5, "Um dos melhores albuns da carreira, melhores composições relamente um salto na carreira");
        Biblioteca.addCritica("Melodrama", 10, "Melhor album da decada, formou o meu caráter");
        Biblioteca.addCritica("Brat",9.0, "Sem duvidas um dos melhores do ano, produção e letras são o ponto forte mas a era em si é a melhor coisa");
        
        Biblioteca.show();
    }
}
