package BeginnerJava;
import java.util.Scanner;
public class CircleJava {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double radius, area;
        System.out.print("Enter a radius: ");
        radius = input.nextDouble();

        area = 3.1416 * (radius*radius);

        System.out.print("Area of the Circle: " + area); 



    }

}
