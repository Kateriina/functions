public class ExecutiveCar extends CarLab2Task12{
    public ExecutiveCar(String name, double speedMax) {
        super(name, speedMax);
    }

    @Override
    public double price(){
        return speedMax * 250;
    }
    @Override
    public double updateModel(double speedMax){
        speedMax*=5;
        return speedMax;
    }
}
