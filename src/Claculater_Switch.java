import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Claculater_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 1st number ::");
        int a = sc.nextInt();

        System.out.println("Enter value of 2nd number ::");
        int b = sc.nextInt();

        System.out.println("Select operation");
        System.out.println(" + : -: *:  /: ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(  (a + b));
                break;
            case '-':
                System.out.println( (a - b));
                break;
            case '*':
                System.out.println( (a * b));
            case '/':
                System.out.println( (a / b));
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}