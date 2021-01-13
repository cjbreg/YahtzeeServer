package nl.fhict.s3.game;

import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.Die;
import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.Game;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ThreeOfAKindTests {

    Game game;

    @BeforeEach
    void setUp() {game = new Game();}

    @AfterEach
    void tearDown() {

    }

    @Test
    void testSuccessful_ThreeOfAKind_Ones(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,1) );
        dice.add(new Die(2,1) );
        dice.add(new Die(3,1) );
        dice.add(new Die(4,3) );
        dice.add(new Die(5,3) );

        int scoreResult = 0;
        int sum = 0;
        for (Die die : dice ) {
            sum += die.face;
        }
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void testSuccessful_ThreeOfAKind_Twos(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,2) );
        dice.add(new Die(2,1) );
        dice.add(new Die(3,2) );
        dice.add(new Die(4,3) );
        dice.add(new Die(5,2) );

        int scoreResult = 0;
        int sum = 0;
        for (Die die : dice ) {
            sum += die.face;
        }
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testSuccessful_ThreeOfAKind_Threes(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,2) );
        dice.add(new Die(2,1) );
        dice.add(new Die(3,3) );
        dice.add(new Die(4,3) );
        dice.add(new Die(5,3) );

        int scoreResult = 0;
        int sum = 0;
        for (Die die : dice ) {
            sum += die.face;
        }
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void testSuccessful_ThreeOfAKind_Fours(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,2) );
        dice.add(new Die(2,4) );
        dice.add(new Die(3,4) );
        dice.add(new Die(4,3) );
        dice.add(new Die(5,4) );

        int scoreResult = 0;
        int sum = 0;
        for (Die die : dice ) {
            sum += die.face;
        }
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }
    @Test
    void testSuccessful_ThreeOfAKind_Fives(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,5) );
        dice.add(new Die(2,5) );
        dice.add(new Die(3,1) );
        dice.add(new Die(4,3) );
        dice.add(new Die(5,5) );

        int scoreResult = 0;
        int sum = 0;
        for (Die die : dice ) {
            sum += die.face;
        }
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testSuccessful_ThreeOfAKind_Sixes(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,6) );
        dice.add(new Die(2,2) );
        dice.add(new Die(3,6) );
        dice.add(new Die(4,6) );
        dice.add(new Die(5,4) );

        int scoreResult = 0;
        int sum = 0;
        for (Die die : dice ) {
            sum += die.face;
        }
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testUnSuccessful_ThreeOfAKind_AllDifferent(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,1) );
        dice.add(new Die(2,2) );
        dice.add(new Die(3,3) );
        dice.add(new Die(4,4) );
        dice.add(new Die(5,5) );

        int scoreResult = 0;
        int sum = 0;
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testUnsuccessful_ThreeOfAKind_TwoOfAKind(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,1) );
        dice.add(new Die(2,2) );
        dice.add(new Die(3,1) );
        dice.add(new Die(4,2) );
        dice.add(new Die(5,5) );

        int scoreResult = 0;
        int sum = 0;
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }

    @Test
    void testSuccessful_ThreeOfAKind_FiveOfAKind(){
        //Arrange
        List<Die> dice = new ArrayList<Die>();
        dice.add(new Die(1,6) );
        dice.add(new Die(2,6) );
        dice.add(new Die(3,6) );
        dice.add(new Die(4,6) );
        dice.add(new Die(5,6) );

        int scoreResult = 0;
        int sum = 0;
        for (Die die : dice ) {
            sum += die.face;
        }
        int expectedScoreResult = sum;
        //Act
        scoreResult = game.calcThreeOfAKind(dice);
        //Assert
        Assertions.assertEquals(expectedScoreResult, scoreResult);
    }


}