package creational.factory;

public abstract class Robot {
    private String name = "";

    public abstract void connect();
    public abstract void disconnect();
    public abstract void prepareForTask();
    public abstract void doTask();
    public abstract void isFinished();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
