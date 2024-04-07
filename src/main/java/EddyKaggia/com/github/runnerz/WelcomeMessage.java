package EddyKaggia.com.github.runnerz;

import org.springframework.stereotype.Component;

@Component

public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to teh Spring Boot Application!";
    }
}
