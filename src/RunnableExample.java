import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableExample implements Runnable{
    final private static Logger logger = Logger.getLogger(RunnableExample.class.getName());

    @Override
    public void run() {
        //api execution stuff here
        for (int counter = 0; counter < 11; counter++){
            logger.log(Level.INFO, "INCREASE VALUE : " + counter);
        }
    }

    public static void main(String[] args) {
        Thread runnableThread = new Thread(new RunnableExample(), "MY THREAD");
        runnableThread.start();

//        Thread runnableThread2 = new Thread(new RunnableExample(), "THE OTHER THREAD");
//        runnableThread2.start();
    }
}
