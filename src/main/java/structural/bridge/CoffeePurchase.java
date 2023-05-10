package structural.bridge;

public class CoffeePurchase implements DrinkPurchase{
    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying coffe for: " + cost);
        return new Coffee();
    }
}
