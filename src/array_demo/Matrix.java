package array_demo;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int Sum_Of_Diagonal_Elements = 0;
        int Sum_Of_Upper_Elements = 0;
        int Sum_Of_Lower_Elements = 0;
        System.out.println("Please enter a number : ");
        for(int row = 0; row< 3; row++){
            for(int col= 0; col< 3; col++){
                A[row][col] = input.nextInt();
            }
        }

        for(int row = 0; row< 3; row++){
            for(int col= 0; col< 3; col++){
                if (row==col){
                    Sum_Of_Diagonal_Elements = Sum_Of_Diagonal_Elements + A[row][col];

                }
                if (row<col){
                    Sum_Of_Upper_Elements = Sum_Of_Upper_Elements + A[row][col];

                }
                if (row>col){
                    Sum_Of_Lower_Elements = Sum_Of_Lower_Elements + A[row][col];
                }

            }

        }
        System.out.println("Sum of diagonal elements: "+Sum_Of_Diagonal_Elements);
        System.out.println("Sum of Upper diagonal elements: "+Sum_Of_Upper_Elements);
        System.out.println("Sum of lower diagonal elements: "+Sum_Of_Lower_Elements);


        
    }

}
