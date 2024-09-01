package Task9;

public class Circle implements Moveble {

    private final Pointer2D center;
    private final Pointer2D points;

    public Circle(Pointer2D center, Pointer2D points) {
     this.center = center;
     this.points = points;
    }

    public void circleCordinates() {
        System.out.println("Center coordinate " + center.getX());
        System.out.println("Point coordinate " + points.getY());
    }

    public double getRadius(){
        double radius;
        if(center.getX()>points.getY()){
            radius = center.getX()-points.getY();

        }else{
            radius = points.getY()-center.getX();
        }
        return radius;
    }


    public double getPerimetre(){

        return 2*Math.PI*getRadius();
    }

    public double getArea( ){

        return Math.PI* Math.pow(getRadius(),2);
    }


    @Override
    public void move(MoveDirection moveDirection) {


        if(moveDirection.getX() < 0  ){
            System.out.println("You are moving left by "+moveDirection.getX()+ " squeres " );
            center.setX(center.getX()+moveDirection.getX());
            points.setY(points.getY()+moveDirection.getX());

          }
        else{
            System.out.println("You are moving right by "+moveDirection.getX() +" squeres " );
            center.setX(center.getX()+moveDirection.getX());
            points.setY(points.getY()+moveDirection.getX());
        }
    }

    @Override
    public void resize(double resizeFactor) {
         if(points.getY()> 0) {
             points.setY(points.getY() + resizeFactor);
         }else{
             points.setY(points.getY() - resizeFactor);
         }
    }
}
