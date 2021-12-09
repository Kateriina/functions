public class PlaneFighter extends Plane{
    public PlaneFighter(String brand, String model, double speedMax, double altitudeMax) {
        super(brand, model, speedMax, altitudeMax);
    }
    public double price(){
        return super.price() * 3;
    }
}
