package es.devtest.mvn;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        
        logger.setLevel(Level.FINE);

        ConsoleHandler consoleHandler = new ConsoleHandler();

        logger.addHandler(consoleHandler);
        
        logger.fine( "Hello World!" );
    }
}
