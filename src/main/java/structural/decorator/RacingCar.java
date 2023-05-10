package structural.decorator;

public class RacingCar implements Car{
    @Override
    public void create() {
        System.out.println("Car: racing");
    }
}
