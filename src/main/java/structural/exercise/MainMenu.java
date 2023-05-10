package structural.exercise;

public class MainMenu {
    public static void main(String[] args) {
        Menu menu1 = new Menu("Menu1",300);
        Menu menu2 = new Menu("Menu2", 500);
        Menu menu3 = new Menu("Menu3", 600);

        MenuItem menuItem = new MenuItem("MenuItem", 800);

        menu1.display();
        System.out.println("//////");

        menu1.addItem(menu2);
        menu1.display();
        System.out.println("//////");

        menu1.addItem(menuItem);
        menu1.display();

        System.out.println("//////");
        menuItem.display();

    }
}
