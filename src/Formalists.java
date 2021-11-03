public class Formalists extends PersonLab2Task13{
    String type = "формалист";
    public Formalists(String name, int age) {
        super(name, age);
    }

    public String greetings(){
        return "Здравствуй";
    }

    public String personType(){
        return type;
    }


}
