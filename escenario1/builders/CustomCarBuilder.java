package builders;

import products.Car;

/**
 *  Ofrece distintas implementaciones de los pasos de construcción.
 *  Los constructores concretos pueden crear productos que no siguen
 *  la interfaz común.
 */
public class CustomCarBuilder implements ICarBuilder {

    private String customCarType;
    private String customEngineType;
    private String customColor;
    private String customTires;
    private String customSoundSystem;
    private String customInterior;
    private String customTransmissionType;
    private boolean customGpsNavigation;
    private boolean customSunroof;

    @Override
    public void setEngineType(String engineType) {
        this.customEngineType = engineType;
    }

    @Override
    public void setColor(String color) {
        this.customColor = color;
    }

    @Override
    public void setTires(String tires) {
        this.customTires = tires;
    }

    @Override
    public void setSoundSystem(String soundSystem) {
        this.customSoundSystem = soundSystem;
    }

    @Override
    public void setInterior(String interior) {
        this.customInterior = interior;
    }

    @Override
    public void setTransmission(String transmissionType) {
        this.customTransmissionType = transmissionType;
    }

    @Override
    public void setGpsNavigation(boolean gpsNavigation) {
        this.customGpsNavigation = gpsNavigation;
    }

    @Override
    public void setSunroof(boolean sunroof) {
        this.customSunroof = sunroof;
    }

    @Override
    public void setCustomCarType(String carType){
        this.customCarType = carType;
    }

    public Car getCustom(){
        return new Car(customCarType,
                customEngineType,
                customColor,
                customTires,
                customSoundSystem,
                customInterior,
                customTransmissionType,
                customGpsNavigation,
                customSunroof);
    }
}
