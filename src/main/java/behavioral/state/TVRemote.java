package behavioral.state;

public class TVRemote {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TvStopState();
        State tvSwitchSate = new TvSwitchState();
        State tvVolumeState = new TvVolumeState();
        context.setState(tvStartState);
        context.doAction();
        context.setState(tvStopState);
        context.doAction();
        context.setState(tvSwitchSate);
        context.doAction();
        context.setState(tvVolumeState);
        context.doAction();

    }
}
