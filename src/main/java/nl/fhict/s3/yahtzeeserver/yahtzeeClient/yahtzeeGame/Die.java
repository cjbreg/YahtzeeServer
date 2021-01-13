package nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame;

public class Die {
    public int id;
    public int face;
    public boolean holding;

    public Die(){
        holding = false;
    }
    public Die(int id, int face){
        this.id = id;
        this.face = face;
        holding = false;
    }
    public Die(int id, int face, boolean holding){
        this.id = id;
        this.face = face;
        this.holding = holding;
    }

    public int roll(){
        throw new UnsupportedOperationException("Method not implemented.");
    }

    public int getFace(){
        return face;
    }

    public void setFace(int face){
        this.face = face;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHolding() {
        return holding;
    }

    public void setHolding(boolean holding) {
        this.holding = holding;
    }
}
