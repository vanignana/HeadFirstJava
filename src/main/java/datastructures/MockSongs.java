package datastructures;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
   public static List<Song> getSongsv3() {
       List<Song> songs = new ArrayList<>();
//        songs.add("somer");
//        songs.add("$10");
//        songs.add("50 ways");
//        songs.add("darling");
//        songs.add("Havana");
//        return songs;
//    }
       songs.add(new Song("somer", "zero", 147));
       songs.add(new Song("$10", "grateful", 158));
       songs.add(new Song("50 ways", "hitch", 140));
       songs.add(new Song("darling", "grateful", 105));
       songs.add(new Song("$10", "simon", 102));
       return songs;

   }
}
