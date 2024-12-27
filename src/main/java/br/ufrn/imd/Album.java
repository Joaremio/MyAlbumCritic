package br.ufrn.imd;

public class Album implements Comparable<Album>{
    private String title;
    private String artist;
    private Genero genre;
    private String year;
    private String opinion;
    private double note;


    public Album(String title, String artist, Genero genre, String year) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void myOpinion(String opinion, double nota) {
        this.opinion = opinion;
        this.note = nota;
    }

    @Override
    public String toString() {
        return "Álbum: " + getTitle() + "\nArtista: " + getArtist() + "\nAno: " + getYear()+ "\nGênero: " + getGenre();
    }

    public String getOpinion() {
        return opinion;
    }

    public double getNote() {
        return note;
    }

    public String getGenre() {
        return genre.getNome();
    }

    public String getYear() {
        return year;
    }

    public String getArtist() {
        return artist;
    }


    @Override
    public int compareTo(Album o) {
        return Double.compare(getNote(), o.getNote());
    }
}