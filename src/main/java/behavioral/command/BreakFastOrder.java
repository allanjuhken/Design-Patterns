package behavioral.command;

public class BreakFastOrder implements Order{
    private CookingStuff cookingStaff;

    public BreakFastOrder(CookingStuff cookingStuff){
        this.cookingStaff = cookingStuff;
    }

    @Override
    public void execute() {
        cookingStaff.cookBreakFast();
    }
}
