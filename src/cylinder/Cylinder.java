package cylinder;

public class Cylinder extends Circle{//extends circle class
       double area;
       double height;



    public Cylinder(double radius, double height) { //constructor
        super(height);//initialization
        this.radius = radius;

        if (height < 0) {
            this.height = 0;
        } else {

            this.height = height;
        }

    }
     public double getHeight(){
           return this.height;
        }

     public double getVolume(){
           this.area = area;
           double volume = (getArea() * getHeight());
           return volume;
        }




}