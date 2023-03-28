package carpet;

public class Carpet {
    //instance variable
    double cost;

    public Carpet(double cost){
        this.cost = cost;//initialization

        if(cost < 0){
            this.cost = 0;
        }
    }
    public double getCost(){
        return this.cost;
    }
}
