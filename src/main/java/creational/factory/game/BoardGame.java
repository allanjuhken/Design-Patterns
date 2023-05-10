package creational.factory.game;

public class BoardGame implements Game{

    @Override
    public String getName() {
        return "Board Game";
    }

    @Override
    public String getType() {
        return "Board Game Type";
    }
}
