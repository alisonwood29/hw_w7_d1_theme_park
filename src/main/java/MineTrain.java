public class MineTrain extends Ride {

    public MineTrain(double price, double minHeight) {
        super(price, minHeight);
    }

    public String startRide(){
        return "Starting train";
    }

    public String stopRide(){
        return "Stopping train";
    }


}
