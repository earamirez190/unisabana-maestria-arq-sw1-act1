# Diagrama de Clases - Patrón Bridge

```mermaid



classDiagram
direction BT
class Main {
  + Main() 
  + main(String[]) void
}
class Notificacion {
  + Notificacion(Plataforma) 
  + enviar(String) void
}
class NotificacionAdvertencia {
  + NotificacionAdvertencia(Plataforma) 
  + enviar(String) void
}
class NotificacionAlerta {
  + NotificacionAlerta(Plataforma) 
  + enviar(String) void
}
class NotificacionConfirmacion {
  + NotificacionConfirmacion(Plataforma) 
  + enviar(String) void
}
class NotificacionMensaje {
  + NotificacionMensaje(Plataforma) 
  + enviar(String) void
}
class Plataforma {
<<Interface>>
  + mostrarNotificacion(String, String) void
}
class PlataformaEscritorio {
  + PlataformaEscritorio() 
  + mostrarNotificacion(String, String) void
}
class PlataformaMovil {
  + PlataformaMovil() 
  + mostrarNotificacion(String, String) void
}
class PlataformaWeb {
  + PlataformaWeb() 
  + mostrarNotificacion(String, String) void
}

NotificacionAdvertencia  -->  Notificacion 
NotificacionAlerta  -->  Notificacion 
NotificacionConfirmacion  -->  Notificacion 
NotificacionMensaje  -->  Notificacion 
PlataformaEscritorio  ..>  Plataforma 
PlataformaMovil  ..>  Plataforma 
PlataformaWeb  ..>  Plataforma 
Notificacion --> Main 
Plataforma ..> Notificacion

```