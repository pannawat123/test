import java.util.Scanner;
public class Lab01 {
    long id;
    String name;
    int age;
    double salary;

    public static void main(String[] args) {
        Lab01 person;
        Scanner scan = new Scanner(System.in);
        String strValue;

        person = new Lab01();
        System.out.print("Enter Id :");
        person.id = scan.nextLong(); // scan input 

        System.out.print("Enter Name : ");
        person.name = scan.next();

        System.out.print("Enter age : ");
        person.age = scan.nextInt();

        System.out.print("Enter Salary : ");
        person.salary = scan.nextDouble();

        System.out.println("Data person : ");
        System.out.println("===============================\n");
        System.out.println("ID : " + person.id);
        System.out.println("Name : " + person.name);
        System.out.println("Age : " + person.age);
        System.out.println("Salary : " + person.salary);
    }
}
