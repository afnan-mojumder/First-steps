package BeginnerJava;
import java.util.Scanner;
public class InputDemo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        /*int number;
        
        System.out.print("Enter a number :");
        
        number = input.nextInt();
        
        System.out.println("Number = " + number);

        String name;

        System.out.print("Enter your name : ");

        name = input.nextLine();

        System.out.println("Welcome : " + name);*/

        double num1;

        System.out.print("Enter any double value : ");

        num1 = input.nextDouble();

        System.out.println(num1);

    }

}
