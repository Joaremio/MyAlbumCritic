package br.ufrn.imd;

public class Main {
    public static void main(String[] args) {
        Album folklore = new Album("Folklore","Taylor Switf","Pop","2020");
        Album melodrama = new Album("Melodrama","Lorde","Pop","2016");
        Album NFR = new Album("Norman Fucking Rockell","Lana del Rey","Pop","2019");

        Biblioteca.add(folklore);
        Biblioteca.add(melodrama);
        Biblioteca.add(NFR);
        Biblioteca.show();
        Biblioteca.remove(folklore);
        Biblioteca.show();


    }
}
