package structural.exercise;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Item {

    private List<Item> items = new ArrayList<>();
    private String name;
    private double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void addItem(Item newItem) {
        items.add(newItem);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println(name + " : " + price);
        for (Item item : items){
            item.display();
        }
    }
}
