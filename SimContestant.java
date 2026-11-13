import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;
    
    public SimContestant (Random randoms) {
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = (int)(Math.random()*3)+1;//do this ...;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor, int strategy) {
        if (strategy == 0){
            return guess1();
        }
        else if (strategy ==1){
            int x = 6 - (myInitialGuess + openedDoor);
            return x;
        }
        else if (strategy ==2){
        int y = (int)Math.random()*2;
        int x = 6 - (myInitialGuess + openedDoor);
        if (y == 0){
            return myInitialGuess;
        }
        else 
            return x;
    }
        return -1;
    }
}
