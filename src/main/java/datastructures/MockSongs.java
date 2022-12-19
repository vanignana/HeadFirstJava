package datastructures;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
   public static List<Songv3> getSongsv3() {
       List<Songv3> songs = new ArrayList<>();
//        songs.add("somer");
//        songs.add("$10");
//        songs.add("50 ways");
//        songs.add("darling");
//        songs.add("Havana");
//        return songs;
//    }
       songs.add(new Songv3("somer", "zero", 147));
       songs.add(new Songv3("$10", "grateful", 158));
       songs.add(new Songv3("50 ways", "hitch", 140));
       songs.add(new Songv3("darling", "grateful", 105));
       songs.add(new Songv3("Havan", "simon", 102));
       return songs;

   }
}
