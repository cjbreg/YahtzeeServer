package nl.fhict.s3.yahtzeeserver.yahtzeeServer.serverside;

import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.Die;
import nl.fhict.s3.yahtzeeserver.yahtzeeServer.logging.Logging;
import nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared.RollResults;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class YahtzeeController {
    Logging logger = new Logging();

    @MessageMapping("/roll")
    @SendTo("/game/dice")
    public List<Die> roll(List<Die> Dice) throws Exception{
        logger.writeToLog("Dice received: " + Dice.toArray().length, "/roll");
        for (Die die: Dice) {
            logger.writeToLog("Die worth received: " + die.getFace() + ". Die status: " + die.isHolding(), "/roll");
        }

        return RollResults.rollDice(Dice);
    }




}
