package nl.fhict.s3.yahtzeeserver.yahtzeeServer.serverside;

import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.Die;
import nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared.RollResults;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class YahtzeeController {

    @MessageMapping("/roll")
    @SendTo("/game/dice")
    public List<Die> roll(List<Die> Dice) throws Exception{

        return RollResults.rollDice(Dice);
    }




}
