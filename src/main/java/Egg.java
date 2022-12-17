import java.util.ArrayList;

public class Egg {
    public static void main(String[] args) {


        ArrayList<Egg> myList = new ArrayList<Egg>();

        Egg egg1 = new Egg();
        myList.add(egg1);

        Egg egg2 = new Egg();
        myList.add(egg2);

        int thesize = myList.size();
        boolean isIn = myList.contains(egg1);
        int idx = myList.indexOf(egg1);
        boolean notempty = myList.isEmpty();
        myList.remove(egg2);
        boolean empty = myList.contains(egg2);
        

    }

}
