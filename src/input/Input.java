package input;

import java.time.Year;
import java.util.*;

public class Input {
    Scanner sc = new Scanner(System.in);

    public static double inputDouble(String label, Scanner sc, boolean needTangentCheck, boolean needSin0, boolean needPos) {
        double x;

        while (true) {

            System.out.printf("Введите %s = ", label);

            if (!checkDouble(sc)) continue;

            x = sc.nextDouble();

            if (!checkRange(x)) continue;

            if (needTangentCheck && !checkTangent(x)) continue;

            if (needSin0 && !checkSin0(x)) continue;

            if (needPos && !сheckPositiveDouble(x)) continue;

            break;
        }

        return x;
    }

    public static int inputInt(String label, Scanner sc, boolean needPosInt, boolean needDoubleDigit, boolean needBinary, boolean needNow) {
        int x;
        while (true) {

            System.out.printf("Введите %s = ", label);
            if (!checkInt(sc)) continue;
            x = sc.nextInt();
            if(needPosInt && !сheckPositiveInt(x)) continue;
            if(needDoubleDigit && !checkDoubleDigit(x)) continue;
            if(needBinary && !checkBinary(x)) continue;
            if(needNow && !checkNow(x)) continue;
            break;
        }

        return x;
    }

    public static String inputString(String label, Scanner sc) {
        sc.nextLine();
        System.out.printf("Введите %s: ", label);
        String str = sc.nextLine();
        return str;
    }


    public static int[] inputArray(int size, Scanner sc, boolean needDoubleDigit) {
        System.out.printf("Введите массив из %d элементов: \n", size);
        int array[] = new int[size];
        for(int n = 0; n < size; n++){
            array[n] =  inputInt("элемент массива", sc, false, false, false, false);
        }

        return array;
    }

    public static double[][] inputMatrix(Scanner sc, boolean needDiff) {

        System.out.println("Введите размеры двумерного массива: ");
        int n_size = inputInt("n", sc, true, false, false, false);
        int m_size = inputInt("m", sc, true, false, false, false);


        double array[][] = new double[m_size][n_size];
        for(int m = 0; m < m_size; m++){
            System.out.printf("\nВведите элементы %d строки массива: \n",m);
            for(int n = 0; n < n_size; n++){
                while (true){
                    array[m][n] = inputDouble("элемент массива", sc,false, false, false);
                    if(needDiff && !checkDiff(array[m][n], array, m , n)) continue;
                    break;
                }
            }
        }

        return array;
    }

    public static ArrayList<Integer> inputArrayListBin(int size, Scanner sc) {
        System.out.printf("Введите массив из %d элементов: \n", size);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int n = 0; n < size; n++){
            arrayList.add( inputInt("элемент массива", sc, false, false, true, false));
        }

        return arrayList;
    }


    private static boolean checkDoubleDigit(int x) {
        return validate( ((x >-100 && x < -9)||(x > 9 && x < 100)) , "Введите двузначное число!");
    }

    private static boolean сheckPositiveDouble(double x) {
        return validate( x >= 0, "Введите положительное число!");
    }

    private static boolean сheckPositiveInt(int x) {
        return validate( x >= 0, "Введите положительное число!");
    }

    public static boolean checkDouble(Scanner sc) {
        if (!sc.hasNextDouble()) {
            sc.next();
            validate(false, "Введите число!");
            return false;
        }

        return true;
    }

    private static boolean checkBinary(int x) {
        while (x != 0) {
            if (x % 10 > 1) {

                validate(false, "Введите двоичное число!");
                return false;
            }
            x /= 10;
        }
        return true;
    }

    private static boolean checkDiff(double x, double[][] matrix, int mm, int nn) {
        for(int m = 0; m <= mm; m++){
            for(int n = 0; n < matrix[m].length; n++){
                if (x == matrix[m][n] && ((m == mm && n ==nn) == false)) {
                    validate(false, "Такое число уже есть в матрице. Введите другое!");
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkInt(Scanner sc) {

        if (!sc.hasNextInt()){

            sc.next();

            validate(false, "Введите число!");
            return false;
        }

        return true;
    }

    private static boolean checkNow(int x) {
        return validate(x < Year.now().getValue() , "Введите настоящую дату!");
    }
    private static boolean checkRange(double x) {
        return validate(x > -1.7e308 && x < 1.7e308, "Вне диапазона double!");
    }

    private static boolean checkTangent(double x) {
        double k = (x - Math.PI / 2) / Math.PI;

        return validate(Math.abs(k - Math.round(k)) > 10.0e-10,
                "Введите число, отличное от pi/2 + pi*k!");
    }

    private static boolean checkSin0(double x) {
        double k = x / Math.PI;

        return validate(Math.abs(k - Math.round(k)) > 10.0e-10,
                "Введите число, отличное от pi*k!");
    }

    private static boolean validate(boolean b, String message) {
        if (!b) System.out.println(message);

        return b;
    }

    public static String randomName(String[] array) {
        Random random = new Random();
        int n = random.nextInt(array.length);
        return array[n];
    }
}

