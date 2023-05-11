package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImplementation implements ChatMediator{
    private List<User> users;

    ChatMediatorImplementation() {
        this.users = new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users){
            // message should not be received by the sender
            if (u != user){
                u.receive(msg, user);
            }
        }
    }
    @Override
    public void addUser(User user) {
        this.users.add(user);

    }
}
