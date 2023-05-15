package behavioral.template;

public class Tennis extends Game {
    @Override
    void initialize() {
        System.out.println("tennis: agme initialized");
    }

    @Override
    void startPlay() {
        System.out.println("tennis: game started");
    }

    @Override
    void endPlay() {
        System.out.println("tennis: game ended");
    }
}
