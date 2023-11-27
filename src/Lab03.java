import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean result = false;
        int number = 0;
        String color = "";
        System.out.print("Enter number : ");
        number = scan.nextInt();
        
        System.out.print("Enter color : ");
        color = scan.next();

        System.out.println("When number = " + number + ", color = " + color);
        System.out.println();
       
        result = (number < 10) && (color == "red");
        System.out.print("result = (number < 10) && (color == \"red\") = ");
        System.out.println(result);
       
        result = (number < 10) & (color == "red");
        System.out.print("result = (number < 10) & (color == \"red\") = ");
        System.out.println(result);
        
        result = (number < 10) || (color == "red");
        System.out.print("result = (number < 10) || (color == \"red\") = ");
        System.out.println(result);
        
        result = (number < 10) | (color == "red");
        System.out.print("result = (number < 10) | (color == \"red\") = ");
        System.out.println(result);
        
        result = (number < 10) ^ (color == "red");
        System.out.print("result = (number < 10) ^ (color == \"red\") = ");
        System.out.println(result);
        
        result = !(number < 10);
        System.out.println("result = !(number < 10) = " + result);
    }
}
