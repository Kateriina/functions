import java.util.Random;

public class Skilled extends Lab2Task14 {
    public Skilled(String name, int age, int experience) {
        super(name, age, experience);
    }

    public boolean shooting(){
        Random rand = new Random();

        return (rand.nextInt() < (0.05 * experience) ? true : false);
    }
}
