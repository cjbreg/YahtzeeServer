package nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared;

import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.Die;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RollResults {
    private static Random random = new Random();
    private List<Integer> results = new ArrayList<>();

    public RollResults(){
    }

    public static List<Die> rollDice(List<Die> Dice){
        for (Die die: Dice
        ) {
            if (!die.isHolding()){
                int randomFace = random.nextInt(6 - 1 + 1) + 1;
                die.setFace(randomFace);
            }
        }

        return Dice;
    }


}
