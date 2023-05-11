package behavioral.command;

public class LunchOrder implements Order{

    private CookingStuff cookingStuff;

    public LunchOrder(CookingStuff cookingStuff) {
        this.cookingStuff = cookingStuff;
    }

    @Override
    public void execute() {
cookingStuff.cookLunch();
    }
}
