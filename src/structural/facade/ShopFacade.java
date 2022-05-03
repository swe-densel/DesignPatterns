package structural.facade;

//all-in-one
public class ShopFacade {
    private Billing billing;
    private Delivery delivery;
    private Warehouse warehouse;

    public ShopFacade(){
        billing = new Billing();
        delivery = new Delivery();
        warehouse = new Warehouse();
    }

    public void addItem(String id){

    }

    public void checkout(){
        if (warehouse.isAvailable()){
            warehouse.reserveItem();
        }
    }

    public void pay(){
        billing.getTotal();
        billing.getTax();
        billing.getPayableAmount();
    }

    public void deliver(){
        delivery.retrievePackage();
        delivery.assignPackage();
    }

}
