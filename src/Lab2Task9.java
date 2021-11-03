public class Lab2Task9 extends Lab2Task7 {

    double height;

    public Lab2Task9(int lower, int upper, double height) {

        super(lower, upper);

        this.height = height;

    }

    public double square( int lower, int upper, double height){
        return half_sum(lower, upper) * height;
    }
}
