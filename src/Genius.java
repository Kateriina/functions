import java.util.Random;


public class Genius extends StudentLab2Task15 {

    public String type = "Гений";

    public Genius(String name, String secondName, String surname, int visited) {
        super(name, secondName, surname, visited);
    }

    public String personType(){
        return type;
    }

    public boolean passExam(){
        return ((visited >= 1) ? true : false);
    }
}
