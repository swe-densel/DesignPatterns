package creational.abstractfactory;

public abstract class Promo {
    private String name = "";

    public abstract void start();
    public abstract void end();
    public abstract void addRegistrant();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
