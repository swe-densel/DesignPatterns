package behavioral.chainofresponsibility;

public abstract class LoggerAbstract {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain of responsibility
    protected LoggerAbstract nextLogger;

    public void setNextLogger(LoggerAbstract nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.level <= level){
            write(message);
        }

        if (nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
