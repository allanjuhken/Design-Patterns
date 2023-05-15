package behavioral.state;

public class TVStartState implements State{
    @Override
    public int doAction() {
        System.out.println("tv is turned on");
        return 1;
    }
}
