package Task9;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Pointer2D circle1 = new Pointer2D(4, -7);

        Circle circle = new Circle(circle1,circle1);

        circle.circleCordinates();

        circle.resize(1.1);


        System.out.println( "The perimitre of the circle is: " + circle.getPerimetre());
        System.out.println( "The area of the circle is: " + circle.getArea());

        circle.circleCordinates();








    }
}
