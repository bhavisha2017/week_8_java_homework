package poolarea;

public class Cuboid extends Rectangle{
    double height;// instance variable


    public Cuboid(double width, double length, double height){// constructor

        super(width, length);//initialization
        this.height = height;

        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight() {// method 1
        return height;
    }
    public double getVolume(){ //method 2

        return (getArea() * height);
    }
}
