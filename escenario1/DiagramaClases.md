# Diagrama de Clases - Patrón Builder

```mermaid

classDiagram

class Car {
  + Car(String, String, String, String, String, String, String, boolean, boolean)
  - String customCarType
  - String customInterior
  - String customEngineType
  - boolean customGpsNavigation
  - String customTranmissionType
  - String customColor
  - String customSoundSystem
  - boolean sutomSunroof
  - String customTires
  + carResult() String
}
class CarDirector {
  + CarDirector() 
  + buildSportCar(ICarBuilder) void
  + buildClassicCar(ICarBuilder) void
}
class CustomCarBuilder {
  + CustomCarBuilder() 
  - String customCarType
  - String customInterior
  - String customEngineType
  - boolean customGpsNavigation
  - String customTranmissionType
  - String customColor
  - String customSoundSystem
  - boolean sutomSunroof
  - String customTires
  + setCustomCarType(String) CustomCarBuilder
  + setEngineType(String) CustomCarBuilder
  + setColor(String) CustomCarBuilder
  + setTires(String) CustomCarBuilder
  + setSoundSystem(String) CustomCarBuilder
  + setInterior(String) CustomCarBuilder
  + setTransmission(String) CustomCarBuilder
  + setGpsNavigation(boolean) CustomCarBuilder
  + setSunroof(boolean) CustomCarBuilder
  + getCustom() Car
}
class CustomCarClient {
  + CustomCarClient() 
  + main(String[]) void
}
class ICarBuilder {
<<Interface>>
  + setCustomCarType(String) ICarBuilder
  + setEngineType(String) ICarBuilder
  + setColor(String) ICarBuilder
  + setTires(String) ICarBuilder
  + setSoundSystem(String) ICarBuilder
  + setInterior(String) ICarBuilder
  + setTransmission(String) ICarBuilder
  + setGpsNavigation(boolean) ICarBuilder
  + setSunroof(boolean) ICarBuilder
}



ICarBuilder <|.. CustomCarBuilder 
CarDirector o-- ICarBuilder
CustomCarBuilder  ..>  Car : «create»
CustomCarClient  -->  CarDirector
```
