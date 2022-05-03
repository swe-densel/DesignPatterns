package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Database database = new DatabaseProxy();
        database.insertSMS("Test");
    }
}
