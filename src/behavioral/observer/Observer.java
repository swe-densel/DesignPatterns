package behavioral.observer;

//subscriber
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
