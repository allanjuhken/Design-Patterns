package behavioral.template;

public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("football: game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("football: game started");
    }

    @Override
    void endPlay() {
        System.out.println("football: game ended");
    }
}
