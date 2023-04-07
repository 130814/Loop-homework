import java.util.Scanner;
public class Print10Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter number");

       int  num = scanner.nextInt();
         int a = scanner.nextInt();

        for (int i = num; i <=a; i++)
        {
        System.out.println(i);


}
    }
}


