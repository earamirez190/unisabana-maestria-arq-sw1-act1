import Notificacion.*;
import Plataforma.*;

void main() {

    PlataformaWeb web = new PlataformaWeb();
    Notificacion mensajeWeb = new NotificacionMensaje(web);
    mensajeWeb.enviar("Bienvenido a los patrones de diseño");

    Notificacion alertaMovil = new NotificacionAlerta(new PlataformaMovil());
    alertaMovil.enviar("Trabajo de patrones de diseño");

    Notificacion advertenciaEscritorio = new NotificacionAdvertencia(new PlataformaEscritorio());
    advertenciaEscritorio.enviar("Necesitas entregar Trabajo de patrones de diseño");

    Notificacion confirmacionEscritorio = new NotificacionConfirmacion(new PlataformaEscritorio());
    confirmacionEscritorio.enviar("Terminaste el trabajo de patrones de diseño");

}
