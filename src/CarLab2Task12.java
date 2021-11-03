class CarLab2Task12 {

    String name;
    double speedMax;

    public CarLab2Task12(String name, double speedMax){
        this.name = name;
        this.speedMax = speedMax;
    }
    public double price(){
        return speedMax * 100;
    }

    public double updateModel(double speedMax){
        speedMax*=10;
        return speedMax;
    }
    public void info(){
        System.out.printf("Название: %s, Максимальная скорость = %.2f км\\ч, Стоимость: %.2f.\n", name, speedMax, price());
    }
}
