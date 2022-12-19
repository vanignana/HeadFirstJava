package datastructures;

import java.util.Comparator;

public class ArtistCompare implements Comparator<Songv3> {

    public int compare(Songv3 one, Songv3 two){
        return one.getArtist().compareTo(two.getArtist());
    }
}
