package Task15;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter


public class CarAttributes {

    private double price;
    private int year;
    private Car car;
    public CarAttributes(double price, int year, Car car) {
        this.price = price;
        this.year = year;
        this.car = car;
    }

    private List<CarAttributes> cars = new ArrayList<>();


    public void addCar(CarAttributes car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        return "CarAttributes{" +
                "price=" + price +
                ", year=" + year +
                ", car=" + car +
                '}';
    }

    public void size(){
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i).toString());
        }
      }




}
