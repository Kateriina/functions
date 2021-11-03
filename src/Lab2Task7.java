public class Lab2Task7 {
    int lower;
    int upper;

    public Lab2Task7(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public static void info(int lower, int upper){
        System.out.printf("\nНижнее основание трапеции = %d\n", lower);
        System.out.printf("Верхнее основание трапеции = %d\n\n", upper);
    }

    public static double half_sum(int lower, int upper){
        return  (double)(lower + upper) / 2;
    }

}
