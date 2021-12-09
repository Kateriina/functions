public class Plane {

    String brand;
    String model;
    double speedMax;
    double altitudeMax;

    public Plane(String brand, String model, double speedMax, double altitudeMax){
        this.brand = brand;
        this.model = model;

        this.speedMax = speedMax;
        this.altitudeMax = altitudeMax;
    }

    public double price(){
        return speedMax * 100;
    }

    public void info(){
        System.out.printf("Марка: %s, Модель: %s,\nМаксимальная скорость = %.2f км\\ч, Максимальная высота = %.2f м, Стоимость: %.2f.\n\n", brand, model, speedMax, altitudeMax, price());
    }
}
