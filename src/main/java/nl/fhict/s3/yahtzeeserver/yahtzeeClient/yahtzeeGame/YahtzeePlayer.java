package nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame;

import java.util.List;

public class YahtzeePlayer {
    public int playerNr;
    public String name;
    public List<Score> scoreCard;

    YahtzeePlayer(String name){
        this.name = name;
    }

    YahtzeePlayer(){

    }

    public boolean updateScore(scoreType type, int points){
        throw new UnsupportedOperationException("Method not implemented.");
    }

    public boolean isAvailable(scoreType type){
        throw new UnsupportedOperationException("Method not implemented.");
    }

    public int getScore(){
        throw new UnsupportedOperationException("Method not implemented.");
    }

    public void addYahtzee(){

        throw new UnsupportedOperationException("Method not implemented.");
    }





    public int getPlayerNr() {
        return playerNr;
    }

    public void setPlayerNr(int playerNr) {
        this.playerNr = playerNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Score> getScoreCard() {
        return scoreCard;
    }

    public void setScoreCard(List<Score> scoreCard) {
        this.scoreCard = scoreCard;
    }
}
