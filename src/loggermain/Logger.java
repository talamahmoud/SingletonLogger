/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loggermain;

public class Logger {
    // Private static variable of the same class that is the only instance of the class.
    private static Logger loggerInstance;

    // Private constructor to prevent instantiation from other classes.
    private Logger() {
        // Initialize any resources, like file handles or output streams.
        System.out.println("Logger initialized.");
    }

    // Public static method that returns the instance of the class, ensuring it is created only once.
    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    // Method to log messages
    public void log(String message) {
        // Here we simply print to the console, but in a real scenario, you might write to a file.
        System.out.println("Log: " + message);
    }
}

