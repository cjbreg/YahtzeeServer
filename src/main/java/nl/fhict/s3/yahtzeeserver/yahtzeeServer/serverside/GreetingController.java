package nl.fhict.s3.yahtzeeserver.yahtzeeServer.serverside;

import nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared.Greeting;
import nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting send(HelloMessage message) throws Exception {

            return new Greeting(message.getName(), message.getMessage());
    }

    @MessageMapping("/test")
    public void testing(HelloMessage message) throws Exception {
        System.out.println(message.getMessage());
    }

}
