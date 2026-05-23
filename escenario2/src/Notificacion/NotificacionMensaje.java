package Notificacion;

import Plataforma.Plataforma;

public class NotificacionMensaje extends Notificacion{

    public NotificacionMensaje(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrarNotificacion("Mensaje: ", mensaje);
    }
}
