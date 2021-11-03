import java.time.Year;

public class Lab2Task11p2 extends Lab2Task11p1 {

    int P;
    public Lab2Task11p2(){}

    public Lab2Task11p2(String name, int n1, int n2, int P) {
        super(name, n1, n2);
        this.P = P;
    }

    public double quality(int n1, int n2, int P){
        return (super.quality(n1, n2) * (Year.now().getValue() - P + 1));
    }


    public static void info(String name, int n1, int n2, double Q, double P){

        System.out.printf("\nНазвание спектакля: %s\n", name);
        System.out.printf("Число зрителей в начале: %d\n", n1);
        System.out.printf("Число зрителей в конце: %d\n", n2);
        System.out.printf("Качество спектакля: Q = %.2f\n", Q);
        System.out.printf("Качество спектакля: Qp = %.2f\n", P);
    }

}
