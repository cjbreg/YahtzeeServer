package nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame;

public class Score {
    public int points;
    public scoreType type;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public scoreType getType() {
        return type;
    }

    public void setType(scoreType type) {
        this.type = type;
    }
}
