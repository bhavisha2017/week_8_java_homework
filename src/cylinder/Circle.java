package cylinder;



public class Circle {
    //instance variable
    double radius;


    public Circle(double radius){// constructor

       if(radius < 0 ){
           this.radius = 0;
       }else{
           this.radius = radius;
       }
    }

    public double getRadius(){ // method 1
        return this.radius;
    }
    public double getArea(){// method 2
        double pi = Math.PI;
        double area = (pi * this.radius * this.radius);
        return area;
    }
}
