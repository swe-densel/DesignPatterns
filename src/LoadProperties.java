import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class LoadProperties {
    final private static Logger logger = Logger.getLogger(LoadProperties.class.getName());

    public static void main(String[] args) {
        try (InputStream inputStream =
                     new FileInputStream(
                        "/Users/denselross.serrano/IdeaProjects" +
                                "/GCash-Session3/src/resources/config.properties"
                     )
        ) {

            Properties properties = new Properties();
            properties.load(inputStream);

            logger.info(properties.getProperty("db.url"));
            logger.info(properties.getProperty("db.user"));
            logger.info(properties.getProperty("db.password"));

        } catch (IOException e) {
            logger.severe("IOException: " + e);
        }
    }
}
