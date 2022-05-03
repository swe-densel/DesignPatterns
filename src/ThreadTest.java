import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadTest {
    final private static Logger logger = Logger.getLogger(ThreadTest.class.getName());

    public static void main(String[] args) {
        Thread incrementThread = new Thread("INCREMENT"){
            @Override
            public void run(){
                for (int counter = 0; counter < 11; counter++){
                    logger.log(Level.INFO, "INCREASE VALUE : " + counter);
                }
            }
        };

        Thread decrementThread = new Thread("DECREMENT"){
            @Override
            public void run(){
                for (int counter = 10; counter >= 0; counter--){
                    logger.log(Level.INFO, "DECREASE VALUE : " + counter);
                }
            }
        };

        incrementThread.start();
        decrementThread.start();
    }

}
