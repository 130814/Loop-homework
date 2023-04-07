import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {

        System.out.println("please type number");

        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        int reverse = 0;

        for (int i = num; i != 0; i = i / 10) {

            int digit = i % 10;
            reverse = reverse * 10 + digit;
        }
        {

            System.out.println(reverse);


        }

    }
}
