package nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame;

import java.util.List;

public interface IYahtzeeGame {

    /**
     * add players to the game
     * each player gets his player number here
     * @param player
     * */
    public boolean addPlayer(YahtzeePlayer player);

    /**
     * adds 5 dice to the game
     * each Die has his own id (0 to 5)
     */
    public void addDice();

    /**
     * roll dice
     * should return 5 values of the dice faces
     * @return
     */
    public List<Integer> roll();

    /**
     * announce winner
     */
    public void announceWinner();

    /**
     * selected die should be on holding (set to true)
     * Next throw die face wont change
     * @param die
     */
    public void holdDie(Die die);

    /**
     * All die should be set to
     * holding = false
     */
    public void resetDice();
}
