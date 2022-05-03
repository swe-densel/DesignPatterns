package creational;

import creational.abstractfactory.CompanyPromo;

public class PromoCreatorFactory {
    public static CompanyPromo getPromo(String choice){

        if (choice.equalsIgnoreCase("jollibee")){
            return new JollibeePromo();
        } else if (choice.equalsIgnoreCase("mcdonald")){
            return new McdoPromo();
        }
        return null;
    }
}
