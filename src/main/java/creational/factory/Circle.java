package creational.factory;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw method of Circle");
    }

    @Override
    public int calculateArea() {
        return 1;
    }
}
