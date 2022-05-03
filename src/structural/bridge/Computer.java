package structural.bridge;

public abstract class Computer {
    protected Keyboard keyboard;

    protected Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public abstract void printToScreen();
}
