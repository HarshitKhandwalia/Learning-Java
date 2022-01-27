import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Mini Arya\nIf you want to exit the program,type '5' ");
            System.out.println("(1) Division\n(2) Multiplication\n(3) Addition\n(4) Subtraction\n(5)Quit");
            System.out.print("Enter your choice:  ");
            int c = ss.nextInt();
            if(c==5){
                System.out.println("Thanks for using Arya!!");
                break;
            }
            System.out.print("Enter the first number: ");
            float a = ss.nextFloat();
            System.out.print("Enter the second number: ");
            float b = ss.nextFloat();
            System.out.println("Enter the operation you want to perform");
            System.out.println("(1) Division\n(2) Multiplication\n(3) Addition\n(4) Subtraction\n(5)Quit");
             if (c == 1) {
                 System.out.println("===================");
                System.out.println(a / b);
                 System.out.println("===================");
            } else if (c == 2) {
                 System.out.println("===================");
                System.out.println(a * b);
                 System.out.println("===================");
            } else if (c == 3) {
                 System.out.println("===================");
                System.out.println(a + b);
                 System.out.println("===================");
            } else if (c == 4) {
                 System.out.println("===================");
                System.out.println(a - b);
                 System.out.println("===================");
            } else {
                 System.out.println("===================");
                System.out.println("Invalid input ");
                 System.out.println("===================");
            }


        }
    }
}