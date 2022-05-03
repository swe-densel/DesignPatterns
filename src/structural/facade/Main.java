package structural.facade;

public class Main {
    public static void main(String[] args) {
        ShopFacade shop = new ShopFacade();

        shop.addItem("Item 1");
        shop.addItem("Item 2");
        shop.addItem("Item 3");

        shop.checkout();
        shop.pay();
        shop.deliver();
    }
}
