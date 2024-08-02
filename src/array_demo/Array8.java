package array_demo;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int[] number = { 10, -3, 18, 5, 25 };

        Arrays.sort(number);
        System.out.print("Ascending: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(" " + number[i]);

        }
        System.out.println();
        System.out.print("Descending: ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(" " + number[i]);

        }
        System.out.println();

        String[] names = { "afnan", "yeaser", "ayman", "rafid" };

        Arrays.sort(names);
        System.out.print("Ascending: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(" " + names[i]);

        }
        System.out.println();
        System.out.print("Descending: ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(" " + names[i]);

        }
    }

}
