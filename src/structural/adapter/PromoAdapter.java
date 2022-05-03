package structural.adapter;

//convert one object to another object
public class PromoAdapter extends Promo implements PromoProcessing{
    private RawSMS rawSMS;

    public PromoAdapter(RawSMS rawSMS) {
        this.rawSMS = rawSMS;
    }

    @Override
    public void registerPromo() {
        //Marco, Lastname, September 10, 1973, Philippine
        this.setMessage(rawSMS.getMessage());
    }

    @Override
    public void drawPromo() {

    }
}
