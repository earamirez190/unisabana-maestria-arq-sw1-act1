package components;

import mediator.ChatRoomMediator;

public abstract class User {
    protected String name;
    protected ChatRoomMediator mediator;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMediator(ChatRoomMediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        if(this.mediator != null) {
            System.out.println("\n---- " + this.name + " enviando mensaje ----");
            this.mediator.sendMessage(message, this);
        }else{
            System.out.println(this.name + " No se pudo enviar mensaje por que no esta en ninguna sala.");
        }
    }

    public abstract void receive(String message,  String senderName);

}
