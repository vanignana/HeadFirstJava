package Startup;

import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationcells;
    private String name;

    public void setLocationcells(ArrayList<String> loc) {
        locationcells = loc;
    }

    public void setName (String n){
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationcells.indexOf(userInput);
        if (index >= 0) {
            locationcells.remove(index);
            if(locationcells.isEmpty()){
                result = "Kill";
                System.out.println("Ouch! You sunk " + name + "   : ( ") ;
            }
            else {
                result = "hit";
            }
        }
        return result;
    }
}
