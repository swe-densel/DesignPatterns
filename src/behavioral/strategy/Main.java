package behavioral.strategy;

//Strategy - you can only know the behavior/what to do during runtime only
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMutiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
