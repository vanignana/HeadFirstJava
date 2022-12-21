package datastructures;

import java.util.*;

public class JukeBox {
    public static void main(String[] args) {
        new JukeBox().go();
    }

    private void go() {
        List<Song> songList = MockSongs.getSongsv3(); {
            System.out.println(songList);
            Collections.sort(songList);
            System.out.println(songList);

            ArtistCompare artistCompare = new ArtistCompare();
            songList.sort((Comparator<? super Song>) artistCompare);
            System.out.println(songList);

            Set<Song> songSet = new HashSet<>(songList);
            System.out.println(songSet);
        }
    }

}
