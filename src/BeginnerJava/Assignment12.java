package BeginnerJava;
import java.util.Scanner;
public class Assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, i, sum;
        System.out.print("Enter first number: ");
        m = input.nextInt();
        System.out.print("Enter last number: ");
        n = input.nextInt();
        sum = 0;
        for(i=m; i<= n;i++){
            if (i%2 != 0){
                sum = sum+i;
            }
        }
        System.out.println("Sum = "+sum);

    }

}
