package mediator;

import components.User;

/**
 *  --- Interfaz Mediator ---
 *  Define la interfaz de comunicación. Los "Colegas" (usuarios) usarán
 *  esta interfaz para comunicarse con el mediador.
 */
public interface ChatRoomMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

