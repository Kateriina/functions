public class StudentLab2Task15 {

    int numberOfClasses = 20;
    String name;
    String secondName;
    String surname;

    int visited;
    public String type;

    public StudentLab2Task15(String name, String secondName, String surname, int visited){
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.visited = visited;
    }

    public String personType(){
        return type;
    }

    public boolean passExam(){
        return false;
    }

    public void info(){
        System.out.printf("\nИмя: %s\tОтчество: %s\tФамилия: %s\n", name, secondName, surname);
        System.out.printf("Репутация: %s\tКоличество посещенных занятий: %d\n", this.personType(), visited);

        System.out.println("Результат зачета: " + (this.passExam()?"сдан":"не сдан"));
    }
}
