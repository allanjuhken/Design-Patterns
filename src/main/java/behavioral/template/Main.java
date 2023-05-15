package behavioral.template;

public class Main {
    public static void main(String[] args) {
        Game basketball = new Basketball();
        basketball.play();

        Game football = new Football();
        football.play();

        Game tennis = new Tennis();
        tennis.play();

        Game volleyball = new Volleyball();
        volleyball.play();
    }
}
