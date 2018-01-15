public class BigSplash extends Ride {

    public BigSplash(double price, double minHeight) {
        super(price, minHeight);
    }

    public String startRide(){
        return "Turning on water";
    }

    public String stopRide(){
        return "Turning off water";
    }
}
