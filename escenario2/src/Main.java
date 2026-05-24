import Notificacion.*;
import Plataforma.*;

public class Main {

    public static void main(String[] args) {

        Notificacion mensajeWeb = new NotificacionMensaje(new PlataformaWeb());
        mensajeWeb.enviar("Bienvenido a los patrones de diseño");

        Notificacion alertaMovil = new NotificacionAlerta(new PlataformaMovil());
        alertaMovil.enviar("Trabajo de patrones de diseño");

        Notificacion advertenciaEscritorio = new NotificacionAdvertencia(new PlataformaEscritorio());
        advertenciaEscritorio.enviar("Necesitas entregar Trabajo de patrones de diseño");

        Notificacion confirmacionEscritorio = new NotificacionConfirmacion(new PlataformaEscritorio());
        confirmacionEscritorio.enviar("Terminaste el trabajo de patrones de diseño");
    }
}