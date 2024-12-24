package br.ufrn.imd;

public class Album {
    private String title;
    private String artist;
    private String genre;
    private String year;


    public Album(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public Album(String title, String artist, String genre, String year) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

}
