import java.sql.SQLOutput;
import java.util.Scanner;

public class Month_by_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1 to 12");
        int number = scanner.nextInt();

        switch (number) {
            case 1: System.out.println(" January");
                break;
            case 2: System.out.println(" Feb");
                break;
            case 3: System.out.println(" March");
                break;
            case 4: System.out.println(" April");
                break;
            case 5: System.out.println("May ");
                break;
            case 6: System.out.println(" June");
                break;
            case 7: System.out.println(" January");
                break;
            case 8: System.out.println(" January");
                break;
            case 9: System.out.println(" January");
                break;
            case 10: System.out.println(" January");
                break;
            case 11: System.out.println(" January");
                break;
            case 12: System.out.println(" January");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }

    }
}

