import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Что ты хочешь делать с массивами? ");
        System.out.println("1. Сложить всё / 2. Перемножить / 3. Найти среднее арифметическое");
        int answer = in.nextInt();

        if (answer == 1) {
            plus();

        }
        if (answer == 2) {
            umn();
        }
        if (answer == 3) {
            avg();
        }


    }

    public static void plus() {
        System.out.println("Напиши из скольки чисел будет массив: ");
        Scanner in = new Scanner(System.in);
        int lenght = in.nextInt();
        int total = 0;
        int score = 0;
        int array[] = new int[lenght];
        System.out.println("Напиши числа для массива");

        for (int i = 0; i < lenght; i++) {

            score = i;
            System.out.print(score + ": ");
            array[i] = in.nextInt();

        }


        for (int i = 0; i < array.length; i++) {

            total = total + array[i];

            System.out.print(array[i] + " ");


        }

        System.out.println("\nСумма массива: " + total);
    }

    public static void umn() {           //Временно не работает((

        System.out.println("Напиши из скольки чисел будет массив: ");
        Scanner in = new Scanner(System.in);
        int lenght = in.nextInt();
        int mul = 0;
        int score = 0;
        int array[] = new int[lenght];
        System.out.println("Напиши числа для массива");

        for (int i = 0; i < lenght; i++) {

            score = i;
            System.out.print(score + ": ");
            array[i] = in.nextInt();

        }
        for (int i = 0; i <= lenght; i++) {
            mul = mul * array[i];
        }
        System.out.println(" ");
        System.out.println(mul);


    }

    public static void avg() {
        System.out.println("Напиши из скольки чисел будет массив: ");
        Scanner in = new Scanner(System.in);
        int lenght = in.nextInt();
        float value = 0;
        float avr = 0;
        int score = 0;
        int array[] = new int[lenght];
        System.out.println("Напиши числа для массива");

        for (int i = 0; i < lenght; i++) {

            score = i;
            System.out.print(score + ": ");
            array[i] = in.nextInt();
        }
        for (int i = 0; i<lenght; i++){
            value += array[i];
        }
        avr = value / array.length;

        System.out.println("Среднее арифметическое: " + avr);

        System.out.println(" ");
        System.out.println("Хочешь ещё запустить приложение?");
        String ye = in.nextLine();



    }
}