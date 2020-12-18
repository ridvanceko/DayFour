import java.util.Scanner;

 import java.util.Scanner;

 public class TaskFive {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number? ");
        int num1 = input.nextInt();
        System.out.println("What is your second number? ");
        int num2 = input.nextInt();
        System.out.println("What is your third number? ");
        int num3 = input.nextInt();

        boolean equalNumber = num1 == num2 || num2 == num3;
        System.out.println("Are there two following digits?  " + equalNumber);
}}
