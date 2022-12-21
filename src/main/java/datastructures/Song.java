package datastructures;

public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private int bpm;

    public boolean equals(Object aSong) {
        Song other = (Song) aSong;
        return title.equals(other.getTitle());
    }
    public int hashCode(){
        return title.hashCode();
    }

    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }

    Song(String title, String artist, int bpm) {
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
