package structural.adapter;

public class Main {
    public static void main(String[] args) {
        RawSMS rawSMS = new RawSMS();

        PromoProcessing promoProcessing = new PromoAdapter(rawSMS);
        promoProcessing.registerPromo();
    }
}
