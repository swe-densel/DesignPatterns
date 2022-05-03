package structural.facade;

public class Billing {
    private double amount;

    public Billing() {
    }

    public double getPayableAmount(){
        return getTotal() + getTax();
    }

    public double getTotal(){
        return amount;
    }

    public double getTax(){
        return amount * .12;
    }
}
