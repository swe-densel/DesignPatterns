package creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonEarlyClass instance1 = SingletonEarlyClass.getInstance();
        instance1.setID("Sample");
        System.out.println("Instance 1 ID: " + instance1.getID());

        SingletonEarlyClass instance2 = SingletonEarlyClass.getInstance();
        System.out.println("Instance 2 ID: " + instance2.getID());
    }
}
