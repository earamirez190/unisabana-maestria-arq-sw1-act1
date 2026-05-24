import components.ChatRoom;
import components.ChatUser;
import components.User;
import mediator.ChatRoomMediator;

public class MediatorClient {

    public static void main(String[] args) {
        ChatRoomMediator chatGroup = new ChatRoom();

        User alice = new ChatUser("Alice");
        User bob = new ChatUser("Bob");
        User john = new ChatUser("John");
        User jane = new ChatUser("Jane");

        chatGroup.addUser(alice);
        chatGroup.addUser(bob);
        chatGroup.addUser(john);
        chatGroup.addUser(jane);

        System.out.println("=== Inicio del Chat ====");

        alice.send("¡Hola todos, buenos días");
        bob.send("¡Hola Alice!");

        System.out.println("\n=== Ingresa un nuevo usuario ===");
        chatGroup.addUser(jane);
        jane.send("¡Perdón por la demora, ya estoy aquí!");

    }
}
