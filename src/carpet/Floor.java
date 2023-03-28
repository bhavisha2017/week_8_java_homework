package carpet;

public class Floor {
    //instance variables
    double width;
    double length;

    public Floor(double width,double length) {// constructor with two parameters

        this.width = width;//initialization
        this.length = length;

        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.length = 0;
        }
    }
        public double getArea(){
        return (this.width * this.length);

        }


}
