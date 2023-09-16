import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Напиши из скольки чисел будет массив: ");
        int lenght = in.nextInt();
        int NumF = 0;
        int numS = 0;
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

}