import java.util.Random;

public class OldStager extends Lab2Task14 {
    public OldStager(String name, int age, int experience) {
        super(name, age, experience);
    }

    public boolean shooting(){
        Random rand = new Random();

        return (rand.nextInt() < (0.9 - 0.01 * age) ? true : false);
    }

}
