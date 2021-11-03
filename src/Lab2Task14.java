public class Lab2Task14 {
    protected String name;
    protected int age;
    protected int experience;

    String type;

    public Lab2Task14(){
    }

    public Lab2Task14(String name, int age, int experience){
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void info(){
        System.out.printf("Имя: %s, Возраст: %d лет, Опыт: %d лет.\n", this.name, this.age, this.experience);
    }

    public boolean shooting(){
        return false;
    }
}


