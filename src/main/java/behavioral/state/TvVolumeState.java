package behavioral.state;

public class TvVolumeState implements State{
    @Override
    public int doAction() {
        System.out.println("Volume up");
        return 5;
    }
}
