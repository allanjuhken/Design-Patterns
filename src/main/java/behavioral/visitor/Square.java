package behavioral.visitor;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSideLength() {
        return side;
    }


    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
