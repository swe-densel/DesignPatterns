package structural.proxy;

//acts as an interface
//calls the db
public class DatabaseProxy implements Database{
    private Database db = new DatabaseMySQL();

    @Override
    public void insertSMS(String SMS) {
        db.insertSMS("some sms");
        System.out.println("Proxy Inserting SMS");
    }
}
