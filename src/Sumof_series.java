
import java.util.Scanner;

public class Sumof_series {

    public static void main(String[] args){

        Scanner r = new Scanner(System.in);

        System.out.println("input any number");
        float n = r.nextFloat();
        float sum;
        sum = 0;

        for (float i = 1; i <= n; i++) {
            sum = sum + 1 / i;
        }
        {
            System.out.println(sum);


        }

    }

    }

