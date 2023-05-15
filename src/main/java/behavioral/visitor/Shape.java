package behavioral.visitor;

public abstract class Shape {
    public abstract void accept(ShapeVisitor visitor);

}
