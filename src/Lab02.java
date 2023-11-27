import java.util.Scanner;
public class Lab02 {
    public static void main(String[] args) {
        /*TODO Auto-generated method stub */ 
        Scanner scan = new Scanner(System.in);
        int a = 0 , b = 0;
        double y;

        System.out.print("Enter value a : ");
        a = scan.nextInt();
        
        System.out.print("Enter value b : ");
        b = scan.nextInt();

        System.out.println("When a = " + a + ", b = " + b + '\n' );
        
        y = (a - b) * (a + b);

        System.out.println("y = (a - b) * (a + b) = " + y);
        
        y = 3*((a - b)*(a + b)) - 6;
        
        System.out.println("y = 3 * ((a - b) * (a + b)) - 6 = " + y);

        y = 1 - (2 * a) / (3 * b);
        System.out.println("y = 1 - (2 * a) / (3 * b) = " + y);
        
    }
}
