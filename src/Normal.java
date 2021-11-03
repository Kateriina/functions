import java.util.Random;


public class Normal extends StudentLab2Task15 {

    public String type = "Обычный";

    public Normal(String name, String secondName, String surname, int visited) {
        super(name, secondName, surname, visited);
    }

    public String personType(){
        return type;
    }

    public boolean passExam(){

        Random rand = new Random();

        if(visited == numberOfClasses){
            return true;
        }
        else {
            return ((visited >= (numberOfClasses / 2) && rand.nextInt() < 0.5) ? true : false);
        }

    }
}
