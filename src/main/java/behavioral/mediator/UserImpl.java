package behavioral.mediator;

public class UserImpl extends User {
    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending message");
        mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg, User user) {
        System.out.println(this.name + ":" + "Received message: " + msg + ": from: " + user.getName());
    }
}
