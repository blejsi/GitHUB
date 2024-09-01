package Task15;

public enum Car {
    FERRARI(1),
    PORSCHE(1),
    MERCEDES(0),
    BMW(0),
    OPEL(0),
    FIAT(0),
    TOYOTA(0), ;


    Car(int i) {
    }

    public Boolean Premium_Regular(Car myCar){


      switch (myCar){
          case FERRARI:
              return true;
          case PORSCHE:
              return true;
          case MERCEDES:
              return false;
          case BMW:
              return false;
          case FIAT:
              return false;
          case OPEL:
              return false;
          case TOYOTA:
              return false;
          default:
              System.out.println("Invalid car");
              return false;
      }

    }



}
