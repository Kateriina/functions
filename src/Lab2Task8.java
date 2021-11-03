
public class Lab2Task8 {

    double real;
    double imag;
    public Lab2Task8(){}

    public Lab2Task8(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }


    public static void info(double real, double imag){

        System.out.println("\nКомплексное число: ");
        System.out.printf("Действительная часть = %.2f\n", real);
        System.out.printf("Мнимая часть = %.2f\n\n", imag);
    }

    public static void func1(double a, double b){
        System.out.printf("Модуль комплексного числа: %.5f\n", (Math.sqrt(Math.pow(a,2) + Math.pow(b,2))));
    }

    public static void func2(double a, double b){

        Lab2Task8 z = new Lab2Task8();

        z.real = a / (Math.pow(a,2) + Math.pow(b, 2));
        z.imag = -b / (Math.pow(a,2) + Math.pow(b, 2));

        System.out.printf("Число, обратное заданному комплексному числу: %.2f%s%.2fi \n\n", z.real, (z.imag > 0)?" + ":"", z.imag);
    }
}
