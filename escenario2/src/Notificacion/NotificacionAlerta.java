package Notificacion;

import Plataforma.Plataforma;

public class NotificacionAlerta extends Notificacion{

    public NotificacionAlerta(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        plataforma.mostrarNotificacion("Alerta: ", mensaje);
    }
}