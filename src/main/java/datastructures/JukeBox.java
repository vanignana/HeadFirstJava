package datastructures;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JukeBox {
    public static void main(String[] args) {
        new JukeBox().go();
    }

    private void go() {
        List<Songv3> songList = MockSongs.getSongsv3(); {
            System.out.println(songList);
            Collections.sort(songList);
            System.out.println(songList);

            ArtistCompare artistCompare = new ArtistCompare();
            songList.sort((Comparator<? super Songv3>) artistCompare);
            System.out.println(songList);
        }
    }

}
