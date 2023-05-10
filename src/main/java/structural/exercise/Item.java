package structural.exercise;

public interface Item {
    void addItem(Item newItem);
    void removeItem(Item item);
    String getName();
    double getPrice();
    void display();

}
