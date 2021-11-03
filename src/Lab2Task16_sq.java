public class Lab2Task16_sq extends Lab2Task16 {

    double width;
    String type = "Квадрат";
    public Lab2Task16_sq(double thickness, double density, double width) {

        super(thickness, density);
        this.width = width;
    }


    public double square(){
        return width*width;
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
