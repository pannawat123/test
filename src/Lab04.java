import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number;
        DecimalFormat d1 = new DecimalFormat("0,000,000.00");
        DecimalFormat d2 = new DecimalFormat("$#,000,000.00");
        DecimalFormat d3 = new DecimalFormat("#,###,##0.00");

        System.out.print("Enter number : ");
        number = scan.nextDouble();

        System.out.println("Type 1 : " + d1.format(number));
        System.out.println("Type 2 : " + d2.format(number));
        System.out.println("Type 3 : " + d3.format(number));

    }
}
