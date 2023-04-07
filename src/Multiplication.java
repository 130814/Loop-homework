import java.util.Scanner;
public class Multiplication {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number ");
       int num = scanner.nextInt();

        for (int i = 1; i<=12; i++) {

            System.out.println(num+"*"+i+"="+num*i);

        }
    }
}
