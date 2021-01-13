package nl.fhict.s3.yahtzeeserver.yahtzeeServer.serverside;

import nl.fhict.s3.yahtzeeserver.yahtzeeServer.logging.Logging;
import nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared.Greeting;
import nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared.HelloMessage;
import nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared.RollResults;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    Logging logger = new Logging();

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting send(HelloMessage message) throws Exception {
        logger.writeToLog("Message received form: " + message.getName() + ". Content: " + message.getMessage(), "/hello");

            return new Greeting(message.getName(), message.getMessage());
    }

//    @MessageMapping("/bye")
//    @SendTo("/topic/greetings")
//    public RollResults test(int amount) throws Exception {
//        System.out.println("test successful");
//
//        return new RollResults(amount);
//    }

    @MessageMapping("/test")
    public void testing(HelloMessage message) throws Exception {
        System.out.println(message.getMessage());
    }

}
