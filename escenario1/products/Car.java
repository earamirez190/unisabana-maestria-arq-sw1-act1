package products;

/**
 * Los Productos son los objetos resultantes.
 * Los productos construidos por distintos objetos constructores
 * no tienen que pertenecer a la misma jerarquía de clases o interfaz.
 */
public class Car {
    private final String customCarType;
    private final String customEngineType;
    private final String customColor;
    private final String customTires;
    private final String customSoundSystem;
    private final String customInterior;
    private final String customTransmissionType;
    private final boolean customGpsNavigation;
    private final boolean customSunroof;

    // Usamos el constructor para asignar los valores y mantener la inmutabilidad
    public Car(String carType, String customEngineType, String customColor, String customTires,
               String customSoundSystem, String customInterior, String customTransmissionType,
               boolean customGpsNavigation, boolean customSunroof) {
        customCarType = carType;
        this.customEngineType = customEngineType;
        this.customColor = customColor;
        this.customTires = customTires;
        this.customSoundSystem = customSoundSystem;
        this.customInterior = customInterior;
        this.customTransmissionType = customTransmissionType;
        this.customGpsNavigation = customGpsNavigation;
        this.customSunroof = customSunroof;
    }

    public String carResult(){
        String result = "";
        result += "Tipo de carro: " + customCarType + "\n";
        result += "Tipo de motor: " + customEngineType + "\n";
        result += "Color: " + customColor + "\n";
        result += "Llantas: " + customTires + "\n";
        result += "Sistema de sonido: " + customSoundSystem + "\n";
        result += "Interior: " + customInterior + "\n";
        result += "Tipo transmisión: " + customTransmissionType + "\n";
        result += (customGpsNavigation ? "Sí cuenta con GPS" : "No cuenta con GPS") + "\n";
        result += (customSunroof ? "Sí cuenta con techo corredizo" : "No cuenta con techo corredizo") + "\n";

        return result;
    }
}
