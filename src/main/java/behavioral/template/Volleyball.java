package behavioral.template;

public class Volleyball extends Game {
    @Override
    void initialize() {
        System.out.println("volleyball: game initialized ");
    }

    @Override
    void startPlay() {
        System.out.println("volleyball: game started");
    }

    @Override
    void endPlay() {
        System.out.println("volleyball: game ended");
    }
}
