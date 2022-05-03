package creational;

import creational.abstractfactory.CompanyPromo;
import creational.abstractfactory.Promo;

public class MainAbstractFactory {
    public static void main(String[] args) {
        CompanyPromo companyPromo = PromoCreatorFactory.getPromo("jollibee");
        Promo promo = PromoFactory.getPromo("discount");
    }
}
