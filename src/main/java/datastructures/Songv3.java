package datastructures;

public class Songv3 implements Comparable<Songv3>{
    private String title;
    private String artist;
    private int bpm;

    public int compareTo(Songv3 s){
        return title.compareTo(s.getTitle());
    }
    Songv3(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getBpm(){
        return bpm;
    }
    public String toString(){
        return title;
    }
}
