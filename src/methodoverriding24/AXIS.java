package methodoverriding24;

public class AXIS extends Bank{

    @Override
    public int getRateOfInterest() {
        int s = 9;
        return super.getRateOfInterest();

    }
}
