import builders.CustomCarBuilder;
import directors.CarDirector;
import products.Car;

public class CustomCarClient {

    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        /*
        El director obtiene el objeto «builder» concreto del cliente
        (código de la aplicación). Esto se debe a que la aplicación sabe mejor qué
        «builder» debe utilizarse para obtener un producto específico.
        */
        CustomCarBuilder customCarSportBuilder = new CustomCarBuilder();
        director.buildSportCar(customCarSportBuilder);

        CustomCarBuilder customCarClassicBuilder = new CustomCarBuilder();
        director.buildClassicCar(customCarClassicBuilder);

        /*
        El producto final suele obtenerse a partir de un objeto constructor, ya que el
        Director no conoce ni depende de constructores ni productos y productos concretos.
        */
        Car carSport = customCarSportBuilder.getCustom();
        System.out.println("\n======== Custom Car Sport: ========\n" + carSport.carResult());

        Car carClassic = customCarClassicBuilder.getCustom();
        System.out.println("\n======== Custom Car Classic: ========\n" + carClassic.carResult());
    }
}
