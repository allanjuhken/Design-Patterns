package behavioral.state;

public class TvStopState implements State{

    @Override
    public int doAction() {
        System.out.println("tv is turned off");
        return 0;
    }
}
