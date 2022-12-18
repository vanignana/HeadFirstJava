package gcObject;

import Constructor.Duck;

public class StackRef {

        public void foof () {
            barf();
            System.out.println("foof");
        }
        public void barf ()
        {
            Duck d = new Duck();
            System.out.println("barf");
        }
    }

