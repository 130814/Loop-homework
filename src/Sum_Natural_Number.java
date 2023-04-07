import java.util.Scanner;
public class Sum_Natural_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any the number");
        int num = scanner.nextInt();
        System.out.println("number");
        int Sum = 0;
        for (int i = 0; i <= num; i++) {
            Sum=Sum+i;
        }
        System.out.println(Sum);
    }
}







