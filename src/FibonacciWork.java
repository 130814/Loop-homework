import java.util.Scanner;

public class FibonacciWork {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int a = 0;
        int b = 1;

        System.out.println("fibonacci sesuence ");
        for (int i = 0; i <=n; i++) {
            System.out.println(a+ " ");
            int c=a+b;
            a=b;
            b=c;


        }

    }
}
