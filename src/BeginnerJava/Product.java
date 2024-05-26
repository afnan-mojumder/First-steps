package BeginnerJava;
import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int id;
        String title, price, description, category;

         System.out.print("Enter an ID: ");

         id = input.nextInt();
        
         System.out.println("ID = " + id);

        
         System.out.print("Enter a title: ");

         input.nextLine();
         title = input.nextLine();

         System.out.println("Title = " + title);

         
         System.out.print("Enter a Price: ");
         
         price = input.nextLine();

         System.out.println("Price: " + price);

         
         System.out.print("Enter a Description: ");
         
         description = input.nextLine();

         System.out.println("Description = " + description);

         
         System.out.print("Enter a Category: ");
                
         category = input.nextLine();

         System.out.println("Category = " + category);
          
    }

}
