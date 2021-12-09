import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Merge {

    public static void main(String[] args) {
        double c;
        List<Double> c1 = new ArrayList<Double>();
        List<Double> c2 = new ArrayList<Double>();

        try{
            Scanner sc = new Scanner(new File("src\\lab4_2.txt"));
            boolean select = false;
            while(sc.hasNextDouble()){
                c = sc.nextDouble();

                if (c < 0) {
                    select = true;
                    continue;
                }
                if (!select) {
                    c1.add(c);
                }else {
                    c2.add(c);
                }
            }
            sc.close();
        }catch(
                FileNotFoundException e){e.printStackTrace();}

        Collections.sort(c1);
        Collections.sort(c2);
        System.out.println("С1:"+c1);
        System.out.println("С2:"+c2);
        c1.addAll(c2);
        System.out.println("С:"+c1);
    }
}
