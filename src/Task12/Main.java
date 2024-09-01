package Task12;

import java.util.List;

public class Main {
    public static void main(String[] args) {


//        Create a Manufacturer class that will contain fields: name, year of establishment, country. Include all
//        necessary methods and constructor parameters. Implement the hashCode() and equals() methods.



//                Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list
//                (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all
//        necessary methods and constructor parameters. Implement the hashcode() and equals() methods.


           Manufacture mercedezBenz = new Manufacture("Mercedes-Benz",1923,"Germany");

            Car carId_1 = new Car("Mercedez-Benz", "w203", 5000.0, 2003, mercedezBenz, Engine.S4);

            Car carId_2 = new Car("Mercedez-Benz", "w210", 3000.0, 2003, mercedezBenz, Engine.V12);

            Car carId_3 = new Car("Mercedez-Benz", "w211", 10000.0, 2003, mercedezBenz, Engine.V6);

            Car carId_4 = new Car("Mercedez-Benz", "w212", 15000.0, 2003, mercedezBenz, Engine.V12);

            Car carId_5 = new Car("Mercedez-Benz", "w190", 10000.0, 1998, mercedezBenz, Engine.S6);

            Car carId_6 = new Car("Mercedez-Benz", "w140", 9000.0, 1997, mercedezBenz, Engine.V8);

            Car carId_7 = new Car("Mercedez-Benz", "w224", 30000.0, 2003, mercedezBenz, Engine.V12);

            Car carId_8 = new Car("Mercedez-Benz", "w205", 25000.0, 2003, mercedezBenz, Engine.S3);




          Manufacture volvo = new Manufacture("Volvo",1927,"Sweden");

          Car car_VIN_1 = new Car("Volvo", "EX30", 10000.0, 2009, volvo, Engine.S4);

          Car car_VIN_2 = new Car("Volvo", "EX40", 10000.0, 2010, volvo, Engine.V12);

          Car car_VIN_3 = new Car("Volvo", "EX90", 10000.0, 2016, volvo, Engine.V8);

          Car car_VIN_4 = new Car("Volvo", "XC40", 10000.0, 2021, volvo, Engine.V6);

          Car car_VIN_5 = new Car("Volvo", "XC40", 10000.0, 1993, volvo, Engine.V12);

          Car car_VIN_6 = new Car("Volvo", "XC60", 10000.0, 2002, volvo, Engine.S3);

          Car car_VIN_7 = new Car("Volvo", "XC90", 10000.0, 2013, volvo, Engine.S6);

          Car car_VIN_8 = new Car("Volvo", "XC40", 10000.0, 2003, volvo, Engine.S4);






            Manufacture ford = new Manufacture("Ford",1903,"Amerika");

          Car car_VIN_11 = new Car("Ford", "Focus", 10000.0, 2009, ford, Engine.S4);

          Car car_VIN_12 = new Car("Ford", "Fiesta", 10000.0, 2010, ford, Engine.V12);

          Car car_VIN_13= new Car("Ford", "Fusion", 10000.0, 2016, ford, Engine.V8);

          Car car_VIN_14= new Car("Ford", "Kuga", 10000.0, 2021, ford, Engine.V6);

          Car car_VIN_15= new Car("Ford", "Mustang", 10000.0, 1993, ford, Engine.V12);

          Car car_VIN_16= new Car("Ford", "Escape", 10000.0, 2002, ford, Engine.S3);

          Car car_VIN_17= new Car("Ford", "Transit", 10000.0, 2013, ford, Engine.S6);

          Car car_VIN_18= new Car("Ford", "Taurus", 10000.0, 2003, ford, Engine.S4);










           CarService unSoldList = new CarService();

        unSoldList.add(carId_1);
        unSoldList.add(carId_2);
        unSoldList.add(carId_3);
        unSoldList.add(carId_4);
        unSoldList.add(carId_5);
        unSoldList.add(carId_6);
        unSoldList.add(carId_7);
        unSoldList.add(carId_8);
        unSoldList.add(car_VIN_1);
        unSoldList.add(car_VIN_2);
        unSoldList.add(car_VIN_3);
        unSoldList.add(car_VIN_4);
        unSoldList.add(car_VIN_5);
        unSoldList.add(car_VIN_6);
        unSoldList.add(car_VIN_7);
        unSoldList.add(car_VIN_8);
        unSoldList.add(car_VIN_11);
        unSoldList.add(car_VIN_12);
        unSoldList.add(car_VIN_13);
        unSoldList.add(car_VIN_14);
        unSoldList.add(car_VIN_15);
        unSoldList.add(car_VIN_16);
        unSoldList.add(car_VIN_17);
        unSoldList.add(car_VIN_18);









       unSoldList.size();

    }
}
