import java.util.Scanner;

public class Factorialnumber {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");//taking number
    int num = scanner.nextInt();

    int fact = 1;//create variable

        for (int i = 1; i <= num; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
}
}

