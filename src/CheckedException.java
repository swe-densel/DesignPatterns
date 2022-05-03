import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckedException {
    final private static Logger logger = Logger.getLogger(CheckedException.class.getName());

    public static void main(String[] args) {
        //call functions
        logger.info("Computation Start");

        try {
            double value = 10/0; //this will cause an error and crashes the app
            //unless inside a try catch
        } catch (ArithmeticException e){ //specific exception
            e.printStackTrace();
        } catch (Exception e){ //general exception
            e.printStackTrace();
        }

        logger.info("Computation Complete");

        readFile();
    }

    public static void readFile(String location){
        File file = new File(location);

        //try - will execute
        try {
            FileReader fileReader = new FileReader(file);

            //check exceptions - required to use,
            // catch "catches" the error
            // exceptions have hierarchy, FileNotFoundException (lesser) is an IOException.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(){
        File file =
                new File("/Users/denselross.serrano/IdeaProjects" +
                        "/GCash-Session3/src/Sample.txt");

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            StringBuffer stringBuffer = new StringBuffer();

            int ascii;
            while ((ascii=fileReader.read())!=-1){
                stringBuffer.append((char)ascii);
            }
            logger.log(Level.INFO, stringBuffer.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

            //finally - executes regardless of result in try catch (MANDATORY)
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
