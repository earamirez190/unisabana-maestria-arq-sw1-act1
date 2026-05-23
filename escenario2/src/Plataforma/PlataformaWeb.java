package Plataforma;

public class PlataformaWeb implements Plataforma{
    @Override
    public void mostrarNotificacion(String tipo, String contenido) {
        System.out.println("Notificación Web " + tipo + contenido);
    }
}