package nl.fhict.s3.yahtzeeserver.yahtzeeServer.serverside;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic","/game", "/auth");
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/gs-guide-websocket")
                .setAllowedOrigins("http://localhost:8081","http://localhost:8082","https://yahtzee-application.herokuapp.com",
                        "chrome-extension://ggnhohnkfcpcanfekomdkjffnfcjnjam")
                .withSockJS();
         }
    }

    //http://kojotdev.com/2019/07/using-spring-websocket-stomp-application-with-vue-js/