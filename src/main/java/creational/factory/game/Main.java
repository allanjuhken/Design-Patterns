package creational.factory.game;

public class Main {
    public static void main(String[] args) {
        Game game1 = GameFactory.getGameFactory("PCGame");
        System.out.println(game1.getName());
        System.out.println(game1.getType());

        Game game2 = GameFactory.getGameFactory("BoardGame");
        System.out.println(game2.getName());
        System.out.println(game2.getType());
    }
}
