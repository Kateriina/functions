

import input.Input;

import java.util.*;

import static input.Input.*;

public class Lab2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean stop = false;

        while (!stop) {

            System.out.println("Введите номер задания от 1 до 15.");
            System.out.print("Если хотите закончить, нажмите иное: ");
            int taskNumber = sc.nextInt();


            switch (taskNumber) {
                case 1:
                    task1(sc);
                    break;

                case 2:
                    task2(sc);
                    break;

                case 3:
                    task3(sc);
                    break;

                case 4:
                    task4(sc);
                    break;

                case 5:
                    task5(sc);
                    break;

                case 6:
                    task6(sc);
                    break;

                case 7:
                    task7(sc);
                    break;

                case 8:
                    task8(sc);
                    break;

                case 9:
                    task9(sc);
                    break;

                case 10:
                    task10(sc);
                    break;

                case 11:
                    task11(sc);
                    break;

                case 12:
                    task12(sc);
                    break;

                case 13:
                    task13(sc);
                    break;

                case 14:
                    task14(sc);
                    break;

                case 15:
                    task15(sc);
                    break;

                case 16:
                    task16(sc);
                    break;
                default:
                    stop = true;

            }
        }
    }



    public static void task1(Scanner sc) {

        int size = 14;
        int[] array = inputArray(size, sc, false);
        int count = 0, sum = 0;
        for(int n = 0; n < size; n++){
            if(array[n] % 2== 0 && array[n] > 0){
                count++;
                sum+=array[n];
            }
        }
        System.out.println("\nРезультаты: ");
        System.out.printf("Количество четных по значению положительных элементов = %d\n", count);
        System.out.printf("Сумма четных по значению положительных элементов  = %d\n\n", sum);
    }

    private static void task2(Scanner sc) {
        int size = 9;
        int[] array = inputArray(size, sc, true);
        int[] newArray = new int[size];
        int sum = 0;
        for(int n = 0; n < size; n++){
            newArray[n]  = Math.abs(array[n] %10) + Math.abs(array[n] / 10);
        }
        System.out.println("Массив: " + Arrays.toString(newArray));
        System.out.println();
    }

    private static void task3(Scanner sc) {

        int size = 12;
        ArrayList<Integer> arrayList = inputArrayListBin(size, sc);
        System.out.println("Исходный массив: " + Arrays.toString(arrayList.toArray()));
        for(int m = 0; m < arrayList.size(); m++){
            int count = 0;
            int abc = arrayList.get(m);
            for(int elem : arrayList) {
                if (abc == elem){
                    count++;
                }
            }
            if (count > 2){
                for(int n = 0; n < arrayList.size(); n++) {
                    if (arrayList.get(n) == abc){
                        arrayList.remove(n);
                        n--;
                    }
                }
                m--;
            }
        }

        System.out.println("Массив: " + Arrays.toString(arrayList.toArray()));
        System.out.println();
    }


    private static void task4(Scanner sc) {

        double array[][] = inputMatrix(sc, false);
        double count_even = 0;
        double count_odd = 0;
        for(int m = 0; m < array.length; m++) {
            for (int n = 0; n < array[m].length; n++) {
                if(array[m][n] % 2 == 0) count_even += array[m][n];
                else count_odd += array[m][n];
            }
        }

        System.out.println("Результаты: ");
        System.out.printf("Сумма четных чисел = %.2f\n", count_even);
        System.out.printf("Сумма нечетных чисел = %.2f\n\n", count_odd);
    }


    private static void task5(Scanner sc) {

        double array[][] = inputMatrix(sc, false);

        System.out.println(" ");
        double x = inputDouble("число для сравнения", sc,false, false, false);
        int count = 0;
        for(int m = 0; m < array.length; m++) {
            for (int n = 0; n < array[m].length; n++) {
                if(array[m][n] == x) count++;
            }
        }

        System.out.println("Результаты: ");
        System.out.printf("Число элементов в матрице, равных %.2f, = %d\n\n", x, count);

    }


    private static void task6(Scanner sc) {
        double array[][] = inputMatrix(sc, true);

        //double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        double min[] = new double[array.length];

        for (int m = 0; m < array.length; m++) {
            min[m] = Double.MAX_VALUE;
            for (int n = 0; n < array[m].length; n++) {
                min[m] = Math.min(min[m], array[m][n]);
            }
        }

        for (int m = 0; m < array.length; m++) {
            max = Math.max(max, min[m]);
        }

        for (int m = 0; m < array.length; m++) {
            for (int n = 0; n < array[m].length; n++) {
                if (array[m][n] == max) {
                    System.out.printf("\nНаибольшее значение среди наименьших в каждой строке maxmin = %.2f\n", max);
                    System.out.printf("Индексы элемента maxmin: m = %d, n = %d \n\n", m, n);
                    break;
                }
            }
        }
    }


    private static void task7(Scanner sc) {
        Lab2Task7 trapezoid = new Lab2Task7(inputInt("нижнее основание трапеции", sc, true, false, false, false),
                inputInt("верхнее основание трапеции", sc, true, false, false, false));

        trapezoid.info(trapezoid.lower, trapezoid.upper);

        System.out.printf("Полу-сумма оснований трапеции = %.2f\n\n", trapezoid.half_sum(trapezoid.lower, trapezoid.upper));

    }

    private static void task8(Scanner sc) {
        Lab2Task8 number = new Lab2Task8(inputDouble("действительную часть комплексного числа: ", sc, false, false, false),
                inputDouble("мнимую часть комплексного числа: ", sc, false, false, false));

        number.info(number.real, number.imag);
        number.func1(number.real, number.imag);
        number.func2(number.real, number.imag);

    }

    private static void task9(Scanner sc) {
        Lab2Task9 trapezoid = new Lab2Task9(inputInt("нижнее основание трапеции", sc, true, false, false, false),
                inputInt("верхнее основание трапеции", sc, true, false, false, false),
                inputDouble("высоту трапеции", sc, false, false, true));

        System.out.printf("Площадь трапециии = %.2f\n\n", trapezoid.square(trapezoid.lower, trapezoid.upper, trapezoid.height));
    }



    private static void task10(Scanner sc) {
        Lab2Task10 number = new Lab2Task10(inputDouble("действительную часть 1го комплексного числа: ", sc, false, false, false),
                inputDouble("мнимую часть 1го комплексного числа: ", sc, false, false, false),
                inputDouble("действительную часть 2го комплексного числа: ", sc, false, false, false),
                inputDouble("мнимую часть 2го комплексного числа: ", sc, false, false, false));

        number.mult(number.real, number.imag, number.real2, number.imag2);
    }


    private static void task11(Scanner sc) {

        Lab2Task11p2 play = new Lab2Task11p2(inputString("название спектакля", sc), inputInt("число зрителей в начале", sc, true, false, false, false),
                inputInt("число зрителей в конце", sc, true, false, false, false), inputInt("год написания пьесы", sc, true, false, false, true));

        play.info(play.name, play.n1, play.n2, play.quality(play.n1, play.n2), play.quality(play.n1, play.n2, play.P));

    }

    private static void task12(Scanner sc) {
        CarLab2Task12 car1 = new CarLab2Task12("Автомобиль", 140);

        ExecutiveCar car2 = new ExecutiveCar("Представительский автомобиль", 160);

        car1.info();
        car2.info();

        car1.speedMax = car1.updateModel(car1.speedMax);
        car2.speedMax = car2.updateModel(car2.speedMax);

        System.out.println("");
        car1.info();
        car2.info();
    }


    private static void task13(Scanner sc) {

        String[] names = { "Александр", "Андрей","Анастасия", "Ирина", "Наталья", "Павел", "Роман", "Светлана", "Сергей", "Татьяна" };

        PersonLab2Task13[] people = new PersonLab2Task13[5];

        for( int n = 0; n < people.length; n++){
            if (n %3 == 0) {
                people[n] = new Formalists(randomName(names), (int)(20 + Math.random()*40));
            }
            else if (n%3 == 1){
                people[n] = new Informals(randomName(names), (int)(20 + Math.random()*40));
            }
            else{
                people[n] = new Realists(randomName(names), (int)(20 + Math.random()*40));
            }
        }

        for( int n = 0; n < people.length; n++){
            people[n].info();
        }

        System.out.println("");
        for( int n = 0; n < people.length - 1; n++){
            for( int m = n+1; m < people.length; m++){
                people[n].welcome(people[m]);
                people[m].welcome(people[n]);
                System.out.println("");
            }
            System.out.println("");
        }
    }

    private static void task14(Scanner sc) {
        String[] names = { "Александр", "Андрей","Анастасия", "Ирина", "Наталья", "Павел", "Роман", "Светлана", "Сергей", "Татьяна" };

        Lab2Task14[] shooters = new Lab2Task14[7];

        for( int n = 0; n < shooters.length; n++){
            if (n % 5 == 0 || n% 5 == 4) {
                shooters[n] = new Beginner(randomName(names), (int)(40 + Math.random()*20), (int)(0 + Math.random()*5));
            }
            else if (n%5 == 1 || n % 5 == 3){
                shooters[n] = new OldStager(randomName(names), (int)(40 + Math.random()*20), (int)(5 + Math.random()*10));
            }
            else{
                shooters[n] = new Skilled(randomName(names), (int)(40 + Math.random()*20), (int)(10 + Math.random()*20));
            }
        }

        System.out.println("");

        for( int n = 0; n < shooters.length; n++){
            shooters[n].info();
            if (shooters[n].shooting() == true){
                System.out.println("Результат стрельбы: Попадание!");
                System.out.println("");
                break;
            }
            else{
                System.out.println("Результат стрельбы: Мимо!");
                System.out.println("");
            }
        }
    }


    private static void task15(Scanner sc) {
        String[] names = { "Александр", "Андрей", "Павел", "Роман", "Сергей", "Алексей", "Виктор", "Василий", "Георгий", "Евгений", "Дмитрий", "Максим", "Игорь" };
        String[] secondNames = { "Александрович", "Андреевич", "Павлович", "Романович", "Сергеевич", "Алексеевич", "Викторович", "Васильевич", "Георгиевич", "Евгеньвич", "Дмитриевич", "Максимович", "Игоревич"};
        String[] surnames = { "Иванов", "Петров", "Сидоров", "Смирнов", "Кузнецов", "Попов", "Соколов", "Михайлов", "Лебедев", "Орлов",  "Степанов", "Макаров"};


        StudentLab2Task15[] students = new StudentLab2Task15[10];

        for( int n = 0; n < students.length; n++){
            if (n <= 4) {
                students[n] = new Normal(randomName(names), randomName(secondNames), randomName(surnames), (int)(Math.random()*20));
            }
            else if (n > 4 &&  n <= 8){
                students[n] = new Smart(randomName(names), randomName(secondNames), randomName(surnames), (int)(Math.random()*20));
            }
            else{
                students[n] = new Genius(randomName(names), randomName(secondNames), randomName(surnames), (int)(Math.random()*20));
            }
        }
        for( int n = 0; n < students.length; n++){
            students[n].info();
        }
    }


    private static void task16(Scanner sc) {
        Lab2Task16[] lists = new Lab2Task16[15];

        for( int n = 0; n < lists.length; n++){

            if (n < 5) {
                System.out.println(n+1 +". Квадратный лист");
                lists[n] = new Lab2Task16_sq(inputDouble("толщину: ", sc, false, false, true), inputDouble("плотность: ", sc, false, false, true), inputDouble("длину листа: ", sc, false, false, true));

            }
            else if (n < 12){
                System.out.println(n-4 +". Прямоугольный лист");
                lists[n] = new Lab2Task16_rect(inputDouble("толщину: ", sc, false, false, true), inputDouble("плотность: ", sc, false, false, true), inputDouble("ширину листа: ", sc, false, false, true), inputDouble("Длину листа: ", sc, false, false, true));
            }
            else{
                System.out.println(n-11 +". Треугольный лист");
                lists[n] = new Lab2Task16_tr(inputDouble("толщину: ", sc, false, false, true), inputDouble("плотность: ", sc, false, false, true), inputDouble("1ю сторону листа: ", sc, false, false, true), inputDouble("2ю сторону листа: ", sc, false, false, true));
            }
        }
        for( int n = 0; n < lists.length; n++){
            lists[n].info();
        }


    }

    /**/
}