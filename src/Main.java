import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int total = 0;




            
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int NumF = in.nextInt();
            System.out.println("Enter second numbers");
            int numS = in.nextInt();

            int[] array = {NumF, numS};
            for (int i = 0; i < array.length; i++) {

                total = total + array[i];

                System.out.print(array[i] + " ");


            }

                System.out.println("\nСумма массива: " + total);
                System.out.println("Напиши 1, что бы переключиться на новую программу");
                int yesU = in.nextInt();

                if (yesU == 1){

                }



    }
    public  static void yes(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int NumF = in.nextInt();
        System.out.println("Enter second numbers");
        int numS = in.nextInt();
    }

}