package creational.factory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw method from Rectangle");
    }

    @Override
    public int calculateArea() {
        return 2;
    }
}
