package Task9;




public class Pointer2D implements Moveble {

    private double x;
    private double y;

    public Pointer2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }


    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }



    @Override
    public void resize(double resizeFactor) {


    }

    @Override
    public  void move(MoveDirection moveDirection) {

        if(moveDirection.getX() < 0  ){
            System.out.println("You are moving left by "+moveDirection.getX()+ " squeres " );
            setX(x + moveDirection.getX());
            setY(y+moveDirection.getX());

        }
        else{
            System.out.println("You are moving right by "+moveDirection.getX() +" squeres " );
            setX(moveDirection.getX());
            setY(moveDirection.getX());
        }
        }
}
