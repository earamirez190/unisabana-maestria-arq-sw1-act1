package components;

public class ChatUser extends User {

    public ChatUser(String name) {
        super(name);
    }

    @Override
    public void receive(String message, String senderName) {
        System.out.println("   -> [" + this.name + " recibe de: " + senderName  + "] - mensaje: " +  message);
    }
}
