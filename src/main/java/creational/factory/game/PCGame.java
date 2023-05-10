package creational.factory.game;

public class PCGame implements Game{

    @Override
    public String getName() {
        return "PCGame";
    }

    @Override
    public String getType() {
        return "PCGame Type";
    }
}
