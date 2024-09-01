package Task12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Car {

  //  Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list
//                (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all
//        necessary methods and constructor parameters. Implement the hashcode() and equals() methods.

    private String name;
    private String model;
    private double price;
    private int yearManufactured;
    private Manufacture manufactured;
    private Engine engine;



    public Car(String name,String model,double price,int yearManufactured,Manufacture manufactured,Engine engine){

        this.name = name;
        this.model = model;
        this.price = price;
        this.yearManufactured = yearManufactured;
        this.manufactured = manufactured;
        this.engine = engine;

    }

    @Override
    public String toString() {
        return "Attributes of the vehicle{" +
                "engine=" + engine +
                ", \n manufactured=" + manufactured +
                ", \n model='" + model + '\'' +
                ", \n name='" + name + '\'' +
                ", \n price=" + price +
                ", \n yearManufactured=" + yearManufactured +
                '}';
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manufacture getManufactured() {
        return manufactured;
    }

    public void setManufactured(Manufacture manufactured) {
        this.manufactured = manufactured;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }
}
