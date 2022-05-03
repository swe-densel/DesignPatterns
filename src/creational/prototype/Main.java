package creational.prototype;

import java.util.HashMap;

//Prototype - used for caching, clone objects
public class Main {
    private static HashMap<String, Organization>  organizationCache = new HashMap<>();

    public static void main(String[] args) {
        Organization organization = new Community();
        organization.setName("PADC");
        organization.setId(1);
        organization.setAddress("Philippines");

        organizationCache.put(organization.getName(), organization);

        organization = new Company();
        organization.setName("SeaOil");
        organization.setId(1);
        organization.setAddress("Philippines");

        organizationCache.put(organization.getName(), organization);

        Company company = (Company) organizationCache.get("SeaOil").clone();
        System.out.println();
    }

}
