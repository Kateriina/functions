
public class Lab4 {
    public static void main(String[] args) {


        Plane plane1 = new Plane("Самолет", "Airbus A320", 840, 11800);
        Plane plane2 = new PlaneBomber("Бомбардировщик", "С-22 «Илья Муромец»", 130, 2000);
        Plane plane3 = new PlaneFighter("Истребитель", "Су-27", 2125, 18500);

        System.out.println("");
        plane1.info();
        plane2.info();
        plane3.info();
    }
}
