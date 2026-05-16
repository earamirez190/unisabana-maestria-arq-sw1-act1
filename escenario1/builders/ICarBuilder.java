package builders;

/**
 * Declara pasos de construcción de producto que todos los tipos de objetos
 * constructores tienen en común.
 */
public interface ICarBuilder {
    void setCustomCarType(String carType);
    void setEngineType(String engineType);
    void setColor(String color);
    void setTires(String tires);
    void setSoundSystem(String soundSystem);
    void setInterior(String interior);
    void setTransmission(String transmissionType);
    void setGpsNavigation(boolean gpsNavigation);
    void setSunroof(boolean sunroof);
}
