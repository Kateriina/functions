import java.util.Random;

public class Beginner extends Lab2Task14 {
    public Beginner(String name, int age, int experience) {
        super(name, age, experience);
    }

    public boolean shooting(){
        Random rand = new Random();

        return (rand.nextInt() < (0.01 * experience) ? true : false);
    }
}
