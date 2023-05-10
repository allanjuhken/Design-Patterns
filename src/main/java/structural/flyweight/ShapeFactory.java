package structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("creating circle of color: " + color);
        }
        return circle;
    }

    private static final HashMap rectangleMap = new HashMap<>();

    public static Shape getRectangle(String color) {
        Rectangle rectangle = (Rectangle) rectangleMap.get(color);

        if (rectangle == null) {
            rectangle = new Rectangle(color);
            rectangleMap.put(color, rectangle);
            System.out.println("creating rectangle of color: " + color);
        }
        return rectangle;
    }
}
