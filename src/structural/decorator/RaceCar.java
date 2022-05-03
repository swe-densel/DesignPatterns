package structural.decorator;

public class RaceCar extends CarDecorator{
    public RaceCar(Car car) {
        super(car);
    }

    @Override
    public void addFeature(){
        super.addFeature();
        System.out.println("Adding race car features.");
    }

}
