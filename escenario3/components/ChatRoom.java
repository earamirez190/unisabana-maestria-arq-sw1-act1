package components;

import mediator.ChatRoomMediator;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * --- ChatRoomMediator Concreto ---
 * Implementa el comportamiento cooperativo coordinando a los usuarios.
 * Conoce y mantiene las referencias de todos los participantes.
 */
public class ChatRoom implements ChatRoomMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.users.add(user);
        user.setMediator(this);
    }

    @Override
    public void sendMessage(String message, User senderUser) {
        String timestamp = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Sala de chat: " + timestamp + "\n" + senderUser.getName() + " dice: " + message );

        for(User user : this.users) {
            if (!user.getName().equals(senderUser.getName())) {
                user.receive(message, senderUser.getName());
            }
        }
    }
}
