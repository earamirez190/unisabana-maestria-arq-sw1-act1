package directors;

import builders.ICarBuilder;

/**
 * La clase Directora define el orden en el que se invocarán los pasos de construcción,
 * por lo que puedes crear y reutilizar configuraciones específicas de los productos
 */
public class CarDirector {

    public void buildSportCar(ICarBuilder carBuilder){
        carBuilder.setCustomCarType("SPORTS_CAR");
        carBuilder.setEngineType("TURBOCHARGED_ENGINE");
        carBuilder.setColor("Red");
        carBuilder.setTires("SPORT_TIRES");
        carBuilder.setSoundSystem("PREMIUM_SOUND_SYSTEM");
        carBuilder.setInterior("SPORT_SEATS");
        carBuilder.setTransmission("MANUAL_TRANSMISSION");
        carBuilder.setGpsNavigation(true);
        carBuilder.setSunroof(true);
    }

    public void buildClassicCar(ICarBuilder carBuilder){
        carBuilder.setCustomCarType("CITY_CAR");
        carBuilder.setEngineType("HYBRID_ENGINE");
        carBuilder.setColor("Blue");
        carBuilder.setTires("PERFORMANCE_TIRES");
        carBuilder.setSoundSystem("BOSE_SOUND_SYSTEM");
        carBuilder.setInterior("SPORT_SEATS");
        carBuilder.setTransmission("AUTOMATIC_TRANSMISSION");
        carBuilder.setGpsNavigation(true);
        carBuilder.setSunroof(false);
    }

}
