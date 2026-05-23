package Plataforma;

public class PlataformaEscritorio implements Plataforma{
    @Override
    public void mostrarNotificacion(String tipo, String contenido) {
        System.out.println("Notificación Escritorio "+ tipo + contenido);
    }
}