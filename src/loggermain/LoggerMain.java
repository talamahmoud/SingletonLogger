package loggermain;

public class LoggerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Logger logger = Logger.getInstance();
        
        // Use the logger to log messages
        logger.log("This is the first log message.");
        logger.log("This is the second log message.");
        
        // Attempt to create another Logger instance and log another message
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("This is the third log message from anotherLogger.");
        
        // Check if both logger instances are the same
        System.out.println("Are both logger instances the same? " + (logger == anotherLogger));
    }
    
}
