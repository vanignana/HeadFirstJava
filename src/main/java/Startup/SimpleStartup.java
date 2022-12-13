package Startup;

public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;
    
    public void setLocationsCells ( int[] locs){
        //locationCells = locs;
    }

    public String checkYourself ( int guess) {
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;

    }



    public static void main(String[] args) {
        int numOfGuesses = 0;
        Gamehelper helper = new Gamehelper();

        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive) {
            int guess = helper.getUserInput(" enter a number");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you took " + numOfGuesses + "guesses");
            }
        }

    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public int[] getLocationCells() {
        return locationCells;
    }

////   /* private void setLocationCells(int[] locations) {
////    }
//*/

}

