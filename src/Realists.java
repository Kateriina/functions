public class Realists extends PersonLab2Task13{

    String type = "реалист";
    public Realists(String name, int age) {
        super(name, age);
    }
    public String personType(){
        return type;
    }

@Override
    public void welcome(PersonLab2Task13 comp){
        System.out.printf("%s: %s, %s!\n", name, (comp.age <=(age+5))?"Привет":"Здравствуй", comp.name);
    };
}
