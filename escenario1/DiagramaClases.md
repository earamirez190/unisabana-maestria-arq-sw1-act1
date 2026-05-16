classDiagram
direction BT
class Car {
  + Car(String, String, String, String, String, String, String, boolean, boolean) 
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
   String interior
   String customCarType
   String engineType
   boolean gpsNavigation
   String transmission
   String color
   Car custom
   String soundSystem
   boolean sunroof
   String tires
}
class CustomCarClient {
  + CustomCarClient() 
  + main(String[]) void
}
class ICarBuilder {
<<Interface>>
   String interior
   String customCarType
   String engineType
   boolean gpsNavigation
   String transmission
   String color
   String soundSystem
   boolean sunroof
   String tires
}

CustomCarBuilder  ..>  Car : «create»
CustomCarBuilder  ..>  ICarBuilder 
