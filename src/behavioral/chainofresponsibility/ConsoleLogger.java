package behavioral.chainofresponsibility;

public class ConsoleLogger extends LoggerAbstract{
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Standard::Logger: " + message);
    }
}
