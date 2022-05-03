import java.io.*;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveProperties {
    final private static Logger logger = Logger.getLogger(SaveProperties.class.getName());
    public static void main(String[] args) {
        try (OutputStream outputStream =
                     new FileOutputStream(
                             "/Users/denselross.serrano/IdeaProjects" +
                                     "/GCash-Session3/src/resources/config.properties"
                     )
        ) {
            FileHandler handler = new FileHandler("logs.txt");
            logger.addHandler(handler);
            logger.setLevel(Level.INFO);

            Properties properties = new Properties();
            properties.setProperty("db.url", "localhost");
            properties.setProperty("db.user", "swe-densel");
            properties.setProperty("db.password", "dbpass");
            properties.store(outputStream, "Beginning Properties Batch 2");

            //CONFIG - logging for sensitive info (mobile num, email ad, picture, gov IDs)
            logger.log(Level.INFO, "INFO : {0} ", properties.toString());
            logger.log(Level.WARNING, "WARNING : {0} ", properties.toString());
            logger.log(Level.SEVERE, "SEVERE : {0} ", properties.toString());
            logger.log(Level.CONFIG, "CONFIG : {0} ", properties.toString());

        } catch (FileNotFoundException e){
            logger.log(Level.SEVERE, "FileNotFound: ", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "IOException: ", e);
        }
    }
}
