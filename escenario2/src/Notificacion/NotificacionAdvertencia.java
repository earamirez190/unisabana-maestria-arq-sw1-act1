package Notificacion;

import Plataforma.Plataforma;

public class NotificacionAdvertencia extends Notificacion{

    public NotificacionAdvertencia(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrarNotificacion("Advertencia: ", mensaje);
    }
}
