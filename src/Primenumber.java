import java.util.Scanner;

public class Primenumber {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter A Number");

        for (int i = 2; i < n; i++) {
            if (n/i==0)
            System.out.println("is not prime number");
            else{
                System.out.println("is prime number");
            }

        }
            }
        }
