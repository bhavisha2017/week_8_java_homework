package methodoverriding24;

public class SBI extends Bank{//creating child classes


    @Override
    public int getRateOfInterest() {
        return super.getRateOfInterest();
    }
}

