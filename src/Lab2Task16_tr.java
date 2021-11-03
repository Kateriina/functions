public class Lab2Task16_tr extends Lab2Task16 {

    double leg1, leg2;

    String type = "Треугольник";
    public Lab2Task16_tr(double thickness, double density, double leg1, double leg2) {

        super(thickness, density);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }
    public double square(){
        return leg1*leg2*0.5;
    }

    double weight(){
        return square()*thickness*density;
    }

    public void info(){
        System.out.println("Тип: " + type);
        System.out.println("Площадь: " + square());
        System.out.println("Вес: " + weight());
    }

}
