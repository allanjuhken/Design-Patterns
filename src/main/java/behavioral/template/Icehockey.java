package behavioral.template;

public class Icehockey extends Game{
    @Override
    void initialize() {
        System.out.println("icehockey: game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("icehockey; game started");
    }

    @Override
    void endPlay() {
        System.out.println("icehockey; game ended");
    }
}
