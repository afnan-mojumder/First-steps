package array_demo;
import java.util.Scanner;
public class Assignment18 {
    public static void main(String[] args) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.print("Enter Day number (1-7) : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        for (int i= 0; i< weekdays.length;i++){
            if (i == number-1){
                System.out.println(weekdays[i]);
            }


        }
    }

}
