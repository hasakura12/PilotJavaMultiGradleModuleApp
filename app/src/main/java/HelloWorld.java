import org.joda.time.LocalTime;
import org.apache.log4j.Logger;

/**
 * Created by asahi02 on 2017-12-05.
 */
public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        // this is using external library
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        MessageService messageService = new MessageService();
        String message = messageService.getMessage();
        LOGGER.info("Received message: " + message);
    }
}