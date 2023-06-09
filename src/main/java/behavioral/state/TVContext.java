package behavioral.state;

public class TVContext implements State{
    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState(){
        return this.tvState;
    }


    @Override
    public int doAction() {
        return this.tvState.doAction();
    }
}
