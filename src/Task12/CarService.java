package Task12;

import java.lang.reflect.Array;
import java.util.*;

public class CarService {

//   Create a CarService class that will contain a list of cars and implement the following methods:
//            1. adding cars to the list,----
//            2. removing a car from the list,----
//            3. returning a list of all cars,----
//            4. returning cars with a V12 engine,----
//            5. returning cars produced before 1999,----
//            6. returning the most expensive car,-----
//            7. returning the cheapest car,------
//            8. returning the car with at least 3 manufacturers,
//            9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
//            10. checking if a specific car is on the list,--------
//            11. returning a list of cars manufactured by a specific manufacturer,-----
//            12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
//            =,! = from the given.
     ArrayList<Car> cars ;

    public CarService(){
        this.cars = new ArrayList<>();
    }

    public void add(Car car){
        this.cars.add(car);
    }

    public void size(){
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i).toString());
            System.out.println();
        }
    }
    public void contain(String name,String model){
        ArrayList<Car> temp = new ArrayList<>();
       for (int i = 0; i < cars.size(); i++){
        if(name.equals(cars.get(i).getName()) && model.equals(cars.get(i).getModel())) {
            System.out.println(cars.get(i).toString());
        }
       }
     // ------------------------Else perseritet per cdo model qe nuk i pershtatet parametrave tone

    }




    public void Before1999(){

        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getYearManufactured() < 1999){
                System.out.println(cars.get(i).toString());
            }
        }
    }



    public void remove(Car car){
        this.cars.remove(car);
    }


   public void MostExpemsive(){
        ArrayList<Car> temp = new ArrayList<>();
        double MostExp=0;
        for(int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() > MostExp) {
                MostExp = cars.get(i).getPrice();
                temp.add(cars.get(i));
            }
        }

        for(int i = 0; i < cars.size(); i++){
            if (cars.get(i).getPrice() == MostExp) {
                System.out.println(cars.get(i).toString());
            }
        }

    }





    public void CheapestOne(){
        ArrayList<Car> temp = new ArrayList<>();
        double Cheapest=30000;
        for(int i = 0; i < cars.size(); i++){
         if(cars.get(i).getPrice() <= Cheapest){
             Cheapest = cars.get(i).getPrice();
         }
        }
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPrice() == Cheapest){
                System.out.println(cars.get(i).toString());
            }
        }
    }






    ArrayList<Car> V12Engines = new ArrayList<>();
    public void V12Engines() {
        Engine v12 = Engine.V12;


        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getEngine() == v12) {
                V12Engines.add(cars.get(i));


            }
        }
    }








    public void PrintV12Engines() {
        for (int i =0;i<V12Engines.size();i++) {
            System.out.println(V12Engines.get(i).toString());
        }
    }


    public  void moreThatOne(Manufacture manufacture){

        for(int i = 0;i<cars.size();i++){
            if(manufacture.equals(cars.get(i).getManufactured())){

                System.out.println( cars.get(i).toString());

                System.out.println();
            }

        }

    }



    public void Descending(){



        for(int i = 0; i < cars.size();i++){
            System.out.println(cars.get(i).toString());
        }

    }





}






