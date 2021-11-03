public class Lab2Task11p1 {

    String name;
    int n1, n2;
    public Lab2Task11p1(){}

    public Lab2Task11p1(String name, int n1, int n2) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
    }

    public double quality(int n1, int n2){

        return  ((double)(n2 - n1))/ n1;
    }

}