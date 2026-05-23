package Notificacion;

import Plataforma.Plataforma;

public class NotificacionConfirmacion extends Notificacion{

    public NotificacionConfirmacion(Plataforma plataforma) { super(plataforma); }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrarNotificacion("Confirmacion: ", mensaje);
    }
}
