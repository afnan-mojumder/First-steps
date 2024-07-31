package BeginnerJava;
import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f, i, j;
        System.out.println("Enter any digit: ");
        f = input.nextInt();
        i = 1;
        j = 1;
        while(j<=f){
            i = i*j;
            j++;
        }
        System.out.println("Factorial = "+i);
    
    }

}
