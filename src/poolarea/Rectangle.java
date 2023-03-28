package poolarea;

public class Rectangle {

    //instance variables
    double width;
    double length;

    public Rectangle(double width, double length){// constructor

        this.width = width;// initialization
        this.length = length;

        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
        if(length < 0){
            this.length = 0;
        }else{
            this.length = length;
        }
    }

    public double getWidth() {// method 1
        return width;
    }

    public double getLength() {// method 2
        return length;
    }

    public double getArea(){// method 3
        return  (width * length);
    }
}
