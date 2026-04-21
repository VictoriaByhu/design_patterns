package behavioral.mediator;

public class ChatUser extends User {
    public ChatUser(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sends message -> " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received message -> " + msg);
    }
}