package structural.bridge;

public class ColaPurchase implements DrinkPurchase{
    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying cola for : "+ cost);
        return new Cola();
    }
}
