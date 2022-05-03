package structural.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("-- Race Car --");
        Car raceCar = new RaceCar(new CarInstance());
        raceCar.addFeature();

        System.out.println("-- Taxi Cabs --");
        Car raceCab = new TaxiCab(new RaceCar(new CarInstance()));
        raceCab.addFeature();

        System.out.println("-- Cabs Racer --");
        Car cabRacer = new RaceCar(new TaxiCab(new CarInstance()));
        cabRacer.addFeature();
    }
}
