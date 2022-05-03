package structural.proxy;

public class DatabaseMySQL implements Database{

    public void connect(){
        System.out.println("proxy db connected");
    }

    public void disconnect(){
        System.out.println("proxy db disconnected");
    }

    @Override
    public void insertSMS(String SMS) {
        connect();
        System.out.println("inserting to mysql db");
        disconnect();
    }
}
