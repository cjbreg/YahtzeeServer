package nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Game implements IYahtzeeGame {
    private int turns = 13;
    public List<Die> Dice;
    public List<YahtzeePlayer> Players;

    public Game(){
        Players = new ArrayList<YahtzeePlayer>();
        Dice = new ArrayList<Die>();
        addDice();
    }

    public void playGame(){
        throw new UnsupportedOperationException("Method not implemented.");
    }

    public void addDice(){
        for (int i=0;i<5;i++) {

            Die die = new Die();
            die.setId(i);
            Dice.add(die);
        }
    }



    public boolean addPlayer(YahtzeePlayer player){
        if (Players.size() > 2){
            int playerNr = Players.size();
            player.setPlayerNr(playerNr);
            Players.add(player);
            return true;
        }
        else{
            System.out.println("Already 2 players set");
            return false;
        }
    }

    public int calcThreeOfAKind(List<Die> Dice){
        int sum = 0;
        boolean threeOfAKind = false;

        for (int i = 1; i<7 ; i++){
            int amount = 0;
            for (Die die : Dice ) {
                if(die.face == i){
                    amount++;
                }
            }
            if(amount > 2){
                threeOfAKind = true;
            }
        }
        if (threeOfAKind){
                for (Die die : Dice ) {
                        sum += die.face;
                }
        }
        return sum;
    }

    public int calcFourOfAKind(List<Die> Dice){
        int sum = 0;
        boolean fourOfAKind = false;

        for (int i = 1; i<7 ; i++){
            int amount = 0;
            for (Die die : Dice ) {
                if(die.face == i){
                    amount++;
                }
            }
            if(amount > 3){
                fourOfAKind = true;
            }
        }
        if (fourOfAKind){
            for (Die die : Dice ) {
                sum += die.face;
            }
        }
        return sum;
    }

    public int calcFullHouse(List<Die> Dice){
        int sum = 0;
        Dice.sort(Comparator.comparing(Die::getFace)); // Sort Dice List

        if((((Dice.get(0).getFace() == Dice.get(1).getFace()) && (Dice.get(1).getFace() == Dice.get(2).getFace())) && // Three of a Kind
                (Dice.get(3).getFace() == Dice.get(4).getFace()) && // Two of a Kind
                (Dice.get(2).getFace() != Dice.get(3).getFace())) ||
                ((Dice.get(0).getFace() == Dice.get(1).getFace()) && // Two of a Kind
                        ((Dice.get(2).getFace() == Dice.get(3).getFace()) && (Dice.get(3).getFace() == Dice.get(4).getFace())) && // Three of a Kind
                        (Dice.get(1).getFace() != Dice.get(2).getFace())) ){
            sum = 25;
        }
        return sum;
    }

    public int calcLargeStraight(List<Die> Dice){
        int sum = 0;
        Dice.sort(Comparator.comparing(Die::getFace)); // Sort Dice List
        if(((Dice.get(0).getFace() == 1) &&
            (Dice.get(1).getFace() == 2) &&
            (Dice.get(2).getFace() == 3) &&
            (Dice.get(3).getFace() == 4) &&
            (Dice.get(4).getFace() == 5)) ||
            ((Dice.get(0).getFace() == 2) &&
            (Dice.get(1).getFace() == 3) &&
            (Dice.get(2).getFace() == 4) &&
            (Dice.get(3).getFace() == 5) &&
            (Dice.get(4).getFace() == 6))

        ){
            sum = 40;
        }
        //// TODO: 6-1-2021  dubble check

        return sum;
    }

    public int calcSmallStraight(List<Die> Dice){
        int sum = 0;
        Dice.sort(Comparator.comparing(Die::getFace)); // Sort Dice List
        for (int i = 0; i<4; i++){
            int temp = 0;
            if(Dice.get(i).getFace() == Dice.get(i+1).getFace()){
                temp = Dice.get(i).getFace();

                for(int j=0; j <4; j++){
                    Dice.get(j).setFace(Dice.get(j+1).getFace());
                }
                Dice.get(4).setFace(temp);
            }
        }

        if( ((Dice.get(0).getFace() == 1) && (Dice.get(1).getFace() == 2) && (Dice.get(2).getFace() == 3) && (Dice.get(3).getFace() == 4)) ||
            ((Dice.get(0).getFace() == 2) && (Dice.get(1).getFace() == 3) && (Dice.get(2).getFace() == 4) && (Dice.get(3).getFace() == 5)) ||
            ((Dice.get(0).getFace() == 3) && (Dice.get(1).getFace() == 4) && (Dice.get(2).getFace() == 5) && (Dice.get(3).getFace() == 6)) ||
            ((Dice.get(1).getFace() == 1) && (Dice.get(2).getFace() == 2) && (Dice.get(3).getFace() == 3) && (Dice.get(4).getFace() == 4)) ||
            ((Dice.get(1).getFace() == 2) && (Dice.get(2).getFace() == 3) && (Dice.get(3).getFace() == 4) && (Dice.get(4).getFace() == 5)) ||
            ((Dice.get(1).getFace() == 3) && (Dice.get(2).getFace() == 4) && (Dice.get(3).getFace() == 5) && (Dice.get(4).getFace() == 6)) )
        {
            sum = 30;
        }

        return sum;
    }

    public int calcYahtzee(List<Die> Dice){
        int sum = 0;
        for(int i = 0; i<7;i++){
            int amount = 0;
            for(int j=0; j<5;j++){
                if(Dice.get(j).getFace() == i){
                    amount++;
                }
                if(amount > 4){
                    sum=50;
                }
            }
        }

        return sum;
    }

    public int calcChance(List<Die> Dice) {
        int sum = 0;

        for(int i =0;i<5;i++){
            sum += Dice.get(i).getFace();
        }
        return sum;
    }


    public List<Integer> roll() {
        throw new UnsupportedOperationException("Method not implemented.");
    }
    public void announceWinner(){
        throw new UnsupportedOperationException("Method not implemented.");
    }

    public void holdDie(Die die){
        throw new UnsupportedOperationException("Method not implemented.");
    }
    public void resetDice(){
        throw new UnsupportedOperationException("Method not implemented.");
    }
}
