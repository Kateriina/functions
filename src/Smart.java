import java.util.Random;


public class Smart extends StudentLab2Task15 {

    public String type = "Умный";

    public Smart(String name, String secondName, String surname, int visited) {
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
            return ((visited >= (numberOfClasses / 2) && rand.nextInt() < 0.7) ? true : false);
        }

    }
}
