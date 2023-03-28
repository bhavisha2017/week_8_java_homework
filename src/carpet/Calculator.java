package carpet;

public class Calculator {
    //instance variables
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){// constructor
        this.floor = floor;//initialization
        this.carpet = carpet;

    }
    public double getTotalCost(){

        return (floor.getArea() * carpet.getCost());
    }
}
