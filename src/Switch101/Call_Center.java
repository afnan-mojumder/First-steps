package Switch101;
import java.util.Scanner;
public class Call_Center {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option;
        System.out.print("Enter any option: ");

        option = input.nextInt();

        switch(option){

            case 1 :
               System.out.println("Selected language is Bengali.");
               break;
            case 2 :
               System.out.println("Selected language is Hindi.");
               break;
            case 3 :
               System.out.println("Selected language is Urdu.");
               break;
            default :
               System.out.println("Selected Language is English");

        }
        
    }

}
