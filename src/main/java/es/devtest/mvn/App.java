package es.devtest.mvn;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Hello World application
 * 
 * @author Arturo Candela
 *
 */
public class App {
    private static final Logger LOGGER;

    static {

        InputStream stream = App.class.getClassLoader().getResourceAsStream("logging.properties");
        try {
            LogManager.getLogManager().readConfiguration(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER = Logger.getLogger(App.class.getName());
    }

    public static void main(String[] args) {
    	
        LOGGER.info("Starting the Program");

        Autor arturo = new Autor("Arturo","Candela Moltó");

        Libro l = new Libro("La vesión inmantenible con Git",arturo);

        LOGGER.info("El autor es: " + l.getAutor().getName());

        System.exit(0);
    }
}
