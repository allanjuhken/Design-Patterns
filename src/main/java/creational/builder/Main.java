package builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .pepperoni(true)
                .cheese(true)
                .pineapple(true)
                .bacon(true)
                .build();

        System.out.println(pizza);
    }
}
