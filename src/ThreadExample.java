import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadExample extends Thread{
    final private static Logger logger = Logger.getLogger(ThreadExample.class.getName());

    @Override
    public void run(){
        for (int counter = 10; counter >= 0; counter --){
            logger.log(Level.INFO, "DECREASE VALUE : " + counter);
            //will end after run()
        }
    }

    public static void main(String[] args) {
        new ThreadExample().start();
    }
}
