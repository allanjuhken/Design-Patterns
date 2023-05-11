package behavioral.interpreter;

public class InterpreterMain {
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("john");
        return (Expression) new OrExpression(robert,john);
    }
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args) {
       Expression isMale = getMaleExpression();
       Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("yes"));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("No"));
    }
}
