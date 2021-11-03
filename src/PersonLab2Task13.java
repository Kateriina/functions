import java.util.Random;
abstract class PersonLab2Task13 {
    protected String name;
    protected int age;
    String type;

    public PersonLab2Task13(){

    }


    public PersonLab2Task13(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String personType(){
        return type;
    }

    public void info(){
        System.out.printf("Меня зовут %s, мой возраст %d лет, я %s.\n", this.name, this.age, this.personType());
    }

    public String greetings(){
        return "Здравствуй";
    }


    public void welcome(PersonLab2Task13 comp){
        System.out.printf("%s: %s, %s!\n", name, greetings(), comp.name);

    }
}
