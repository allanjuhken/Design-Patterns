package behavioral.mediator;

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImplementation();
        User user1 = new UserImpl(mediator,"Nimi");
        User user2 = new UserImpl(mediator,"Uus");
        User user3 = new UserImpl(mediator,"Poiss");
        User user4 = new UserImpl(mediator,"Plika");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("hello");
        user2.send("hola");
        user3.send("moro");
        user4.send("Im from Estonia");

    }
}
