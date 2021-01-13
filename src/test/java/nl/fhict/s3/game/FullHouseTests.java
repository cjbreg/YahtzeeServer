package nl.fhict.s3.game;

import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.Die;
import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.Game;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FullHouseTests {
    Game game;

    @BeforeEach
    void setUp() {game = new Game();}

    @AfterEach
    void tearDown() {

    }

    @Test
    void  testSuccessful_FullHouse_OnesAndTwos(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,1) );
        dice.add(new Die(2,2) );
        dice.add(new Die(3,1) );
        dice.add(new Die(4,2) );
        dice.add(new Die(5,1) );

        int scoreResult = 0;
        int expectedScoreResult = 25;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void  testSuccessful_FullHouse_TwosAndThrees(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,2) );
        dice.add(new Die(2,2) );
        dice.add(new Die(3,3) );
        dice.add(new Die(4,2) );
        dice.add(new Die(5,3) );

        int scoreResult = 0;
        int expectedScoreResult = 25;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void  testSuccessful_FullHouse_FoursAndThrees(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,4) );
        dice.add(new Die(2,4) );
        dice.add(new Die(3,3) );
        dice.add(new Die(4,4) );
        dice.add(new Die(5,3) );

        int scoreResult = 0;
        int expectedScoreResult = 25;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void  testSuccessful_FullHouse_FivesAndFours(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,4) );
        dice.add(new Die(2,4) );
        dice.add(new Die(3,5) );
        dice.add(new Die(4,5) );
        dice.add(new Die(5,5) );

        int scoreResult = 0;
        int expectedScoreResult = 25;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void  testSuccessful_FullHouse_FivesAndSixes(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,5) );
        dice.add(new Die(2,6) );
        dice.add(new Die(3,5) );
        dice.add(new Die(4,6) );
        dice.add(new Die(5,5) );

        int scoreResult = 0;
        int expectedScoreResult = 25;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void  testSuccessful_FullHouse_FivesAndOnes(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,5) );
        dice.add(new Die(2,1) );
        dice.add(new Die(3,5) );
        dice.add(new Die(4,1) );
        dice.add(new Die(5,5) );

        int scoreResult = 0;
        int expectedScoreResult = 25;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testSuccessful_FullHouse_TwosAndSixes(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,2) );
        dice.add(new Die(2,6) );
        dice.add(new Die(3,6) );
        dice.add(new Die(4,2) );
        dice.add(new Die(5,2) );

        int scoreResult = 0;
        int expectedScoreResult = 25;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testUnsuccessful_FullHouse_TwosAndASix(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,2) );
        dice.add(new Die(2,2) );
        dice.add(new Die(3,6) );
        dice.add(new Die(4,2) );
        dice.add(new Die(5,2) );

        int scoreResult = 0;
        int expectedScoreResult = 0;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void testUnsuccessful_FullHouse_FourOfAKind(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,1) );
        dice.add(new Die(2,1) );
        dice.add(new Die(3,5) );
        dice.add(new Die(4,1) );
        dice.add(new Die(5,1) );

        int scoreResult = 0;
        int expectedScoreResult = 0;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testUnsuccessful_FullHouse_AllDifferent(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,2) );
        dice.add(new Die(2,3) );
        dice.add(new Die(3,4) );
        dice.add(new Die(4,5) );
        dice.add(new Die(5,6) );

        int scoreResult = 0;
        int expectedScoreResult = 0;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testUnsuccessful_FullHouse_FiveOfAKind(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,4) );
        dice.add(new Die(2,4) );
        dice.add(new Die(3,4) );
        dice.add(new Die(4,4) );
        dice.add(new Die(5,4) );

        int scoreResult = 0;
        int expectedScoreResult = 0;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void testUnsuccessful_FullHouse_ThreeOfAKind(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,4) );
        dice.add(new Die(2,4) );
        dice.add(new Die(3,2) );
        dice.add(new Die(4,5) );
        dice.add(new Die(5,4) );

        int scoreResult = 0;
        int expectedScoreResult = 0;
        //Act
        scoreResult = game.calcFullHouse(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

}
