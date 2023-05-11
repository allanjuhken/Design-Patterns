package behavioral.chain_of_responsibility;

import behavioral.command.CookingStuff;
import behavioral.command.Order;

public class BreakFastOrder implements Order {
    private CookingStuff cookingStaff;

    public BreakFastOrder(CookingStuff cookingStuff){
        this.cookingStaff = cookingStuff;
    }

    @Override
    public void execute() {
        cookingStaff.cookBreakFast();
    }
}
