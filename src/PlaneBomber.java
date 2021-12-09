public class PlaneBomber extends Plane{
    public PlaneBomber(String brand, String model, double speedMax, double altitudeMax) {
        super(brand, model, speedMax, altitudeMax);
    }
    public double price(){
        return super.price() * 2;
    }
}
