package nl.fhict.s3.yahtzeeserver.yahtzeeServer.serverside;

import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.Die;
import nl.fhict.s3.yahtzeeserver.yahtzeeClient.yahtzeeGame.User;
import nl.fhict.s3.yahtzeeserver.yahtzeeServer.logging.Logging;
import nl.fhict.s3.yahtzeeserver.yahtzeeShared.shared.RollResults;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Controller
public class AuthController {
    Logging  logger = new Logging();

    @MessageMapping("/auth")
    @SendTo("/auth/user")
    public boolean isLoggedIn(User user) throws Exception{
        logger.writeToLog("User received: " + user.getUsername(), "/auth");
        try {
            URL url = new URL("http://localhost:8086/api/test/all");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestProperty("Authorization","Bearer "+ user.getAccessToken());
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String output;
            StringBuffer response = new StringBuffer();

            while ((output = in.readLine()) != null) {
                response.append(output);  //Crashes on 401
            }

            in.close();


            // printing result from response
            System.out.println(response.toString());
            if (response.toString().equals("\"12:00:00\"") )
                return true;    // On success
            else
                return false;   // should respond on 401


        }catch (Exception e ){
            logger.writeToLog("Wrong Token: " + user.getUsername(), "/auth");
            return false;
        }

    }
}
