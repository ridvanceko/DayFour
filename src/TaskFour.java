
import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first number? ");
        int num1 = input.nextInt();
        System.out.println("What is your second number? ");
        int num2 = input.nextInt();
        System.out.println("What is your third number? ");
        int num3 = input.nextInt();


     boolean myFavNumber = num1 == num2 && num2 == num3;

     System.out.println("Are these 3 number equal? " + myFavNumber);

    }}
