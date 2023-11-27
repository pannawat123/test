import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab08 {
    public static void main(String[] args) {
        int total;
        int Max;
        int score;
        double average;
        Scanner scan = new Scanner(System.in);

        total = 0;
        System.out.print("Enter number of score : ");
        Max = scan.nextInt();
        for (int n = 1 ; n <= Max ; n++) {
            System.out.print("Enter Integer Score " + n + " : ");
            score = scan.nextInt();
            total = total + score;        
        }

        DecimalFormat twoDigits = new DecimalFormat("0.00");
        average = (double) total / Max ;
        System.out.println("Class average is " + twoDigits.format(average));
    }
}
