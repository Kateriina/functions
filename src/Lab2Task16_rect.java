public class Lab2Task16_rect extends Lab2Task16 {

    double width;
    double length;
    String type = "Прямоугольник";

    public Lab2Task16_rect(double thickness, double density, double width, double length) {

        super(thickness, density);
        this.width = width;
        this.length = length;
    }

    public double square(){
        return width*length;
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
