package array_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = " + number.size());

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(3, 50);

        System.out.println(number);

        /*
         * for (int x:number){
         * System.out.print(" "+x);
         * }
         */

        /*
         * Iterator itr = number.iterator();
         * while(itr.hasNext()){
         * System.out.print(" "+itr.next());
         * }
         */

        System.out.println();
        System.out.println("size = " + number.size());

        /*
         * number.remove(4);
         * 
         * System.out.println(number);
         */

        /*
         * number.removeAll(number);
         * 
         * System.out.println(number);
         */

        /*
         * number.clear();
         * System.out.println(number);
         */

        boolean check = number.isEmpty();
        System.out.println(check);

        boolean thirty = number.contains(30);

        System.out.println("30 is in the list: " + thirty);

        int pos = number.indexOf(40);

        System.out.println("Index of 40 : " + pos);

        number.set(4, 60); // replacing an existing value
        System.out.println(number);

        int x = number.get(1);

        System.out.println("Index 1 has: " + x);

    }

}
