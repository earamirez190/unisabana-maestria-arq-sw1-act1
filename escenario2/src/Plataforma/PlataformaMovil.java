package Plataforma;

public class PlataformaMovil implements Plataforma{
    @Override
    public void mostrarNotificacion(String tipo, String contenido) {
        System.out.println("Notificación Movil " + tipo + contenido);
    }
}