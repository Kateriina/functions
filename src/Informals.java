public class Informals extends PersonLab2Task13{
    String type = "неформал";
    public Informals(String name, int age) {
        super(name, age);
    }

    public String greetings(){
        return "Привет";
    }
    public String personType(){
        return type;
    }
}
