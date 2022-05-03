package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Computer macBook = new MacBook(new CheapKeyboard());
        Computer computerDesktop = new CustomDesktop(new ExpensiveKeyboard());

        macBook.printToScreen();
    }
}
